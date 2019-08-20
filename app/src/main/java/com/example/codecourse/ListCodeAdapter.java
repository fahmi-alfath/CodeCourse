package com.example.codecourse;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ListCodeAdapter  extends RecyclerView.Adapter<ListCodeAdapter.ListViewHolder> {

    private ArrayList<Code> listCode;
    public ListCodeAdapter(ArrayList<Code> list) {
        this.listCode = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_code, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Code code = listCode.get(position);

        final int resID = getResId(code.getPhoto(), R.drawable.class);
        holder.imgPhoto.setImageResource(resID);
        
        holder.tvName.setText(code.getName());
        holder.tvDetail.setText(code.getDetail());
        holder.rlList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailCode.class);

                intent.putExtra("key", code.getName());
                intent.putExtra("title",code.getName());
                intent.putExtra("text",code.getDetail());
                intent.putExtra("photo",resID);
                intent.putExtra("release",code.getRelease());
                intent.putExtra("extension",code.getExtension());
                intent.putExtra("source",code.getSource());

                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCode.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvBtnDetail;
        RelativeLayout rlList;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            rlList = itemView.findViewById(R.id.list_id);
        }
    }

    public static int getResId(String resName, Class<?> c) {

        try {
            Field idField = c.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
