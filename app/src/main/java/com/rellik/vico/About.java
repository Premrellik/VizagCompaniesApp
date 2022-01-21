package com.rellik.vico;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class About extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        Button linked = view.findViewById(R.id.linkedin);
        Button fb = view.findViewById(R.id.facebook);
        Button inst = view.findViewById(R.id.instagram);


        TextView click=view.findViewById(R.id.clickhere);
        LinearLayout connect=view.findViewById(R.id.connect);

        connect.setVisibility(View.INVISIBLE);


        click.setOnClickListener(v -> connect.setVisibility(View.VISIBLE));



        fb.setOnClickListener(v12 -> {
            Intent i1 = new Intent(Intent.ACTION_VIEW);
            i1.setData(Uri.parse("https://www.facebook.com/prem.king.35"));
            startActivity(i1);
        });

        linked.setOnClickListener(v13 -> {
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse("https://www.linkedin.com/in/prem-kumar-785b67143"));
            startActivity(i2);
        });


        inst.setOnClickListener(v1 -> {
            Intent i3 = new Intent(Intent.ACTION_VIEW);
            i3.setData(Uri.parse("https://www.instagram.com/premrellik_98?igshid=20u6v3kurkfd"));
            startActivity(i3);

        });


        return view;



    }



}

