package com.example.btrecyclerview;

import android.os.Bundle;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SearchView searchView;
    List<ProductModel> itemList;
    ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.searchView_2150);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();

        itemList.add(new ProductModel("Áo sơ mi trắng", "Giá: 180.000đ", R.drawable.ao_somi));
        itemList.add(new ProductModel("Quần jean xanh", "Giá: 250.000đ", R.drawable.quan_jean));
        itemList.add(new ProductModel("Áo thun tay ngắn", "Giá: 120.000đ", R.drawable.ao_thun));
        itemList.add(new ProductModel("Áo khoác bomber", "Giá: 390.000đ", R.drawable.ao_khoac));
        itemList.add(new ProductModel("Giày thể thao", "Giá: 560.000đ", R.drawable.giay));
        itemList.add(new ProductModel("Túi xách da nữ", "Giá: 680.000đ", R.drawable.tui_xach));
        itemList.add(new ProductModel("Mũ bucket", "Giá: 95.000đ", R.drawable.mu_bucket));
        itemList.add(new ProductModel("Đồng hồ đeo tay", "Giá: 1.250.000đ", R.drawable.dong_ho));
        itemList.add(new ProductModel("Kính mát", "Giá: 300.000đ", R.drawable.glasses));

        adapter = new ProductAdapter(this, itemList);
        recyclerView.setAdapter(adapter);

        // 🔹 Xử lý sự kiện tìm kiếm
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Có thể xử lý logic khi nhấn nút Search trên bàn phím (không bắt buộc)
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Gọi hàm lọc của adapter mỗi khi chữ thay đổi
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}