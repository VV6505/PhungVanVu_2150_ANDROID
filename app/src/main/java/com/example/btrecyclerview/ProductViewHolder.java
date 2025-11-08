package com.example.btrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        TextView tvName, tvPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem_2150);
            tvName = itemView.findViewById(R.id.tvName_2150);
            tvPrice = itemView.findViewById(R.id.tvPrice_2150);
        }
    }
