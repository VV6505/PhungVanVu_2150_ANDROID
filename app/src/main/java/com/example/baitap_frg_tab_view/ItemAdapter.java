// ItemAdapter.java
package com.example.baitap_frg_tab_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private final List<Item> dataList;

    public ItemAdapter(List<Item> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Sử dụng layout fragment_item.xml
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item currentItem = dataList.get(position);

        holder.tvName.setText(currentItem.getName());
        holder.tvPrice.setText(currentItem.getPrice());
        holder.imgItem.setImageResource(currentItem.getImage()); // Gán hình ảnh
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvPrice;
        public ImageView imgItem;

        public ItemViewHolder(View view) {
            super(view);

            tvName = view.findViewById(R.id.tvName_2150);
            tvPrice = view.findViewById(R.id.tvPrice_2150);
            imgItem = view.findViewById(R.id.imgItem_2150);
        }
    }
}