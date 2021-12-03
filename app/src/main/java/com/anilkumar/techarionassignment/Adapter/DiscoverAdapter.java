package com.anilkumar.techarionassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anilkumar.techarionassignment.Modal.DiscoverModal;
import com.anilkumar.techarionassignment.R;

import java.util.List;

public class DiscoverAdapter  extends RecyclerView.Adapter<DiscoverAdapter.ViewHolder> {

    Context context;
    List<DiscoverModal> discoverModals;

    public DiscoverAdapter(Context context, List<DiscoverModal> discoverModals) {
        this.context = context;
        this.discoverModals = discoverModals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView1.setText(discoverModals.get(position).getText());
        holder.button1.setText(discoverModals.get(position).getButton());
        holder.button2.setText(discoverModals.get(position).getButton());


    }

    @Override
    public int getItemCount() {
        return discoverModals.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView2;
        Button button1,button2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.text1);
            textView2 = (TextView) itemView.findViewById(R.id.text2);
            button1 = (Button) itemView.findViewById(R.id.btn1);
            button2 = (Button) itemView.findViewById(R.id.btn2);




        }
    }
}
