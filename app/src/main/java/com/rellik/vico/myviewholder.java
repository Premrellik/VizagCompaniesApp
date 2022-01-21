package com.rellik.vico;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class myviewholder extends RecyclerView.ViewHolder {

     TextView  Company, Details , ClickHere;




    public myviewholder(@NonNull View itemView) {
        super(itemView);
        Company=(TextView)itemView.findViewById(R.id.CompanyName);
        Details=(TextView)itemView.findViewById(R.id.details);
        ClickHere=(TextView)itemView.findViewById(R.id.clickhere);


    }
}
