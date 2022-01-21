package com.rellik.vico.Companies;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rellik.vico.Model.Model;
import com.rellik.vico.R;
import com.rellik.vico.WebViews.Show;
import com.rellik.vico.myadapter_gov;

import java.util.ArrayList;
import java.util.Collections;



public class Government extends Fragment {


    RecyclerView recyclerView;
    myadapter_gov adapter;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_government, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        FloatingActionButton fab = view.findViewById(R.id.fab);


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new myadapter_gov(dataqueue(), requireContext());
        recyclerView.setAdapter(adapter);


        fab.setOnClickListener(v -> {
            Intent i = new Intent(getContext(), Show.class);
            startActivity(i);
        });



        return view;
    }


    public static ArrayList<Model> dataqueue() {


        ArrayList<Model> holder= new ArrayList<>();


        Model obj1 = new Model();
        obj1.setCompany("Hindustan Shipyard Ltd");
        obj1.setDetails("Gandhigram(PO)\n" +
                "Visakhapatnam\n" + "Andhra Pradesh , 530005 ");
        obj1.setClickHere("https://www.hslvizag.in/");
        holder.add(obj1);


        Model obj2 = new Model();
        obj2.setCompany("Bharat Heavy Electricals Ltd (BHEL)");
        obj2.setDetails("BHPV Post\n" +
                "Visakhapatnam\n" + "Andhra Pradesh , 530012");
        obj2.setClickHere("https://hpvp.bhel.com/");
        holder.add(obj2);


        Model obj3 = new Model();
        obj3.setCompany("Rashtriya Ispat Nigam Ltd(Vizag Stl)");
        obj3.setDetails("RINL, VSP, Administrative Building,\n" + "1st Floor B Block,\n" + "Visakhapatnam Steel Plant\n" +
                "Andhra Pradesh , 530031");
        obj3.setClickHere("https://www.vizagsteel.com//");
        holder.add(obj3);

        Model obj4 = new Model();
        obj4.setCompany("Dredging Corporation Of India Ltd");
        obj4.setDetails("Dredge House, Port Area\n" +
                "Visakhapatnam\n" + "Andhra Pradesh , 530035");
        obj4.setClickHere("http://www.dredge-india.com/");
        holder.add(obj4);



        Collections.sort(holder);

        return holder;


    }


}