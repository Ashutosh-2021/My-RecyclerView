package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

   Context context;
   ArrayList<ContactModel> arrayList;

   public  RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrayList){
       this.context = context;
       this.arrayList = arrayList;
   }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.img.setImageResource(arrayList.get(position).img);
        holder.name.setText(arrayList.get(position).name);
        holder.pno.setText(arrayList.get(position).pno);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       ImageView img;
       TextView name, pno;

        public ViewHolder(View itemView){
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            pno = itemView.findViewById(R.id.pno);
        }
    }
}
