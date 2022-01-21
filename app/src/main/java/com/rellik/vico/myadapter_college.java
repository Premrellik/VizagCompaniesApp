package com.rellik.vico;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rellik.vico.Model.Model;
import com.rellik.vico.WebViews.College_webview;

import java.util.ArrayList;

public class myadapter_college extends RecyclerView.Adapter<myviewholder> {

    ArrayList<Model> data;
    Context context;

    public myadapter_college(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context = context;
    }



    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow_college_schools, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        final Model temp = data.get(position);

        holder.Company.setText(data.get(position).getCompany());
        holder.Details.setText(data.get(position).getDetails());
        holder.ClickHere.setText(data.get(position).getClickHere());


        holder.ClickHere.setOnClickListener(v -> {
            Intent i1 = new Intent(context, College_webview.class);
            i1.putExtra("Uri", temp.getClickHere());
            i1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i1);
        });

    }

    @Override
    public int getItemCount() {
        return data.size();

    }
}
