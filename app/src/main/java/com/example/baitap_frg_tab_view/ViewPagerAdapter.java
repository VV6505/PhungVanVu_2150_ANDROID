// ViewPagerAdapter.java
package com.example.baitap_frg_tab_view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private final List<ListFragment.LayoutType> types;

    public ViewPagerAdapter(@NonNull AppCompatActivity fragmentActivity, List<ListFragment.LayoutType> types) {
        super(fragmentActivity);
        this.types = types;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return ListFragment.newInstance(types.get(position));
    }

    @Override
    public int getItemCount() {
        return types.size();
    }
}