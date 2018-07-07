package com.example.a24565.queuedial;


import android.content.Context;
import android.print.PrintDocumentAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private ArrayList<Contact> contactArrayList;
    private LayoutInflater inflater;

    public ContactAdapter(ArrayList<Contact> contactArrayList,Context context){
        this.contactArrayList=contactArrayList;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.contact_cell,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nameTextView.setText(contactArrayList.get(position).getFullName());
        holder.phoneTextView.setText(contactArrayList.get(position).getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return contactArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTextView;
        private TextView phoneTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView=itemView.findViewById(R.id.nameTextView);
            phoneTextView=itemView.findViewById(R.id.phoneTextView);
        }
    }
}
