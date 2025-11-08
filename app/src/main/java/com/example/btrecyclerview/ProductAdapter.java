package com.example.btrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> implements Filterable {

    private Context context;
    private List<ProductModel> itemList;

    private List<ProductModel> itemListFull;
    private int selectedPosition = -1;

    public ProductAdapter(Context context, List<ProductModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        this.itemListFull = new ArrayList<>(itemList);
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductModel item = itemList.get(position);
        holder.tvName.setText(item.getName());
        holder.tvPrice.setText(item.getPrice());
        holder.imgItem.setImageResource(item.getImage());

        // đổi màu khi item được chọn
        if (position == selectedPosition) {
            holder.itemView.setBackgroundColor(0xFF87CEFA);
        } else {
            holder.itemView.setBackgroundColor(0xFFFFFFFF);
        }

        // sự kiện click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPosition = holder.getAdapterPosition();
                notifyDataSetChanged();
                Toast.makeText(context, "Chọn: " + item.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String removeAccents(String s) {
        if (s == null) {
            return null;
        }
        // Chuẩn hóa chuỗi (NFKD) để tách dấu ra khỏi chữ cái
        s = java.text.Normalizer.normalize(s, java.text.Normalizer.Form.NFKD);
        // Loại bỏ các ký tự dấu (nhóm chung \p{Mn} - Mark, nonspacing)
        s = s.replaceAll("\\p{Mn}", "");
        return s;
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // 🔹 PHƯƠNG THỨC LỌC DỮ LIỆU CHÍNH
    @Override
    public Filter getFilter() {
        return productFilter;
    }

    private Filter productFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<ProductModel> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(itemListFull);
            } else {
                String filterPattern = removeAccents(constraint.toString().toLowerCase().trim());

                for (ProductModel item : itemListFull) {
                    String itemNameNormalized = removeAccents(item.getName().toLowerCase());

                    // So sánh hai chuỗi không dấu
                    if (itemNameNormalized.contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            itemList.clear();
            itemList.addAll((List) results.values);
            notifyDataSetChanged();
            selectedPosition = -1; // Reset trạng thái chọn sau khi lọc dữ liệu
        }
    };
}