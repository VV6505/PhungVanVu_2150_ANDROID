package com.example.baitap_frg_tab_view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    public enum LayoutType { VERTICAL, HORIZONTAL, GRID }

    private static final String ARG_TYPE = "layout_type";

    public ListFragment() {
    }

    public static ListFragment newInstance(LayoutType type) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    private List<Item> createItemList() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Áo sơ mi trắng", "Giá: 180.000đ", R.drawable.ao_somi));
        itemList.add(new Item("Quần jean xanh", "Giá: 250.000đ", R.drawable.quan_jean));
        itemList.add(new Item("Áo thun tay ngắn", "Giá: 120.000đ", R.drawable.ao_thun));
        itemList.add(new Item("Áo khoác bomber", "Giá: 390.000đ", R.drawable.ao_khoac));
        itemList.add(new Item("Giày thể thao", "Giá: 560.000đ", R.drawable.giay));
        itemList.add(new Item("Túi xách da nữ", "Giá: 680.000đ", R.drawable.tui_xach));
        itemList.add(new Item("Mũ bucket", "Giá: 95.000đ", R.drawable.mu_bucket));
        itemList.add(new Item("Đồng hồ đeo tay", "Giá: 1.250.000đ", R.drawable.dong_ho));
        itemList.add(new Item("Kính mát", "Giá: 300.000đ", R.drawable.glasses));
        return itemList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        LayoutType layoutType = (LayoutType) getArguments().getSerializable(ARG_TYPE);

        List<Item> itemList = createItemList();

        RecyclerView.LayoutManager layoutManager;
        if (layoutType == LayoutType.VERTICAL) {
            // Kiểu DỌC
            layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        } else if (layoutType == LayoutType.HORIZONTAL) {
            // Kiểu NGANG
            layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        } else {
            // Kiểu GRID (Lưới 2 cột)
            layoutManager = new GridLayoutManager(getContext(), 2);
        }

        recyclerView.setLayoutManager(layoutManager);

        //Adapter với dữ liệu trên
        recyclerView.setAdapter(new ItemAdapter(itemList));
    }
}