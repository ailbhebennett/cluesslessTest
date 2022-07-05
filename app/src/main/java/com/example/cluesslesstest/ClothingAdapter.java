package com.example.cluesslesstest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ClothingAdapter extends RecyclerView.Adapter<ClothingAdapter.ViewHolder> {

    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public EditText EntName1;
        public EditText EntColour1;
        public EditText EntType1;
        public ImageView imgClothing1;
         public ViewHolder(LinearLayout v) {
            super(v);
            EntName1 = (EditText) v.findViewById(R.id.EntName);
            EntColour1 = (EditText) v.findViewById(R.id.EnterColour);
            EntType1 = (EditText) v.findViewById(R.id.EntType);
            imgClothing1 = (ImageView) v.findViewById(R.id.imgClothing);
        }
    }

    public ClothingAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    @NonNull
    @Override
    public ClothingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);
        ViewHolder vh = new ViewHolder((LinearLayout) v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.EntName1.setText(mDataset[position]);
        holder.EntColour1.setText(mDataset[position]);
        holder.EntType1.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
