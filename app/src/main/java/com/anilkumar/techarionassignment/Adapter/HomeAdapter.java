package com.anilkumar.techarionassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anilkumar.techarionassignment.Modal.HomeModal;
import com.anilkumar.techarionassignment.Modal.Modal;
import com.anilkumar.techarionassignment.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    Context context;
    List<HomeModal>homeModalList;

    public HomeAdapter(Context context, List<HomeModal> homeModalList) {
        this.context = context;
        this.homeModalList = homeModalList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.homelayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(homeModalList.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return homeModalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView1,imageView2,imageView3,imageView4;
        TextView textView;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1= (ImageView) itemView.findViewById(R.id.img1);
            imageView2= (ImageView) itemView.findViewById(R.id.img2);
            imageView3= (ImageView) itemView.findViewById(R.id.img3);
            imageView4= (ImageView) itemView.findViewById(R.id.img4);
            textView = (TextView) itemView.findViewById(R.id.textView);
            linearLayout=(LinearLayout) itemView.findViewById(R.id.linearLayout);

        }
    }
}
