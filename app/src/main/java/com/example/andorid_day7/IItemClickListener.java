package com.example.andorid_day7;

public interface IItemClickListener {
    void onItemClick(int position);

    void onChangWishlist(int position);

    void onDelete (int position);

    void onUpdate (int position);
}
