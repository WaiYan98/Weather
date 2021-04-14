package com.example.weather.util;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class ItemDecoration extends RecyclerView.ItemDecoration {

    private final int spaceLength;

    public ItemDecoration(int spaceLength) {
        this.spaceLength = spaceLength;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.bottom = spaceLength;
        outRect.left = 32;
    }
}
