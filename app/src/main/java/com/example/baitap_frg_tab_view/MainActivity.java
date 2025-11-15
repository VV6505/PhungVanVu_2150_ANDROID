package com.example.baitap_frg_tab_view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager2 viewPager = findViewById(R.id.view_pager);

        List<String> tabTitles = Arrays.asList("DỌC", "NGANG", "LƯỚI (GRID)");
        // Các kiểu layout tương ứng
        List<ListFragment.LayoutType> layoutTypes = Arrays.asList(
                ListFragment.LayoutType.VERTICAL,
                ListFragment.LayoutType.HORIZONTAL,
                ListFragment.LayoutType.GRID
        );

        // Thiết lập Adapter cho ViewPager2
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, layoutTypes);
        viewPager.setAdapter(adapter);

        // Liên kết TabLayout với ViewPager2
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText(tabTitles.get(position))
        ).attach();
    }
}