package com.rellik.vico;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rellik.vico.Model.Model;
import com.rellik.vico.WebViews.Government_webview;

import java.util.ArrayList;

public class myadapter_gov  extends RecyclerView.Adapter<myviewholder>{



    ArrayList<Model> data;
    Context context;




    public myadapter_gov(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context = context;


    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, int position) {

        final Model temp = data.get(position);

        holder.Company.setText(data.get(position).getCompany());
        holder.Details.setText(data.get(position).getDetails());
        holder.ClickHere.setText(data.get(position).getClickHere());


        holder.ClickHere.setOnClickListener(v -> {


            Intent i1 = new Intent(context, Government_webview.class);
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

