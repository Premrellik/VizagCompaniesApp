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
import com.rellik.vico.myadapter_soft;


import java.util.ArrayList;
import java.util.Collections;


public class Software extends Fragment {


    RecyclerView recyclerView;
    myadapter_soft adapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_companies_list, container, false);
        recyclerView = view.findViewById(R.id.recview);
        FloatingActionButton fab = view.findViewById(R.id.fab);


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new myadapter_soft(dataqueue(), requireContext());
        recyclerView.setAdapter(adapter);


        fab.setOnClickListener(v -> {
            Intent i = new Intent(getContext(), Show.class);
            startActivity(i);
        });

        return view;

    }



    public static ArrayList<Model> dataqueue() {

        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setCompany("Cyient Ltd");
        obj1.setDetails("Cyient Ltd.\n" +
                "Survey No: 410\n" +
                "Plot No: 14, SEZ Unit\n" +
                "Hill No: 3, Madhurawada(V)\n" +
                "Rushikonda, Vizag   ");
        obj1.setClickHere("https://www.cyient.com/contact-us");
        holder.add(obj1);


        Model obj2 = new Model();
        obj2.setCompany("eCentric Solutions");
        obj2.setDetails("eCentric Visakhapatnam\n" +
                "Plot No 2,\n" +
                "Hill No 3, IT HUB,\n" +
                "Madhurawada,\n" +
                "Visakhapatnam – 530041");
        obj2.setClickHere("http://www.e-centricsolutions.com/");
        holder.add(obj2);


        Model obj3 = new Model();
        obj3.setCompany("Miracle Software Sysstems");
        obj3.setDetails("APAC Headquarters\n" +
                "Miracle Heights\n" +
                "Hill No. 1, IT SEZ,\n" +
                "Chinna Rushi Konda\n" +
                "Visakhapatnam, AP – 530045, India");
        obj3.setClickHere("https://www.miraclesoft.com/");
        holder.add(obj3);

        Model obj4 = new Model();
        obj4.setCompany("Symbiosys");
        obj4.setDetails("Main Office 2D,\n" +
                "Balaji Mangalagiri Chambers,\n" +
                "Siripuram, Vsp 530003,\n" + "India.Offshore Development Center IT Park, " +
                "Hill No: 2, Rushikonda\n");
        obj4.setClickHere("http://symbiosystech.com/");
        holder.add(obj4);

        Model obj5 = new Model();
        obj5.setCompany("Maple Software Pvt Ltd");
        obj5.setDetails("Visakhapatnam Office :\n" +
                "D. No. 10-50-84/C, 4th Floor,\n" +
                "Sun Towers, Waltair Main Road,\n" +
                "Visakhapatnam – 530002 \n");
        obj5.setClickHere("https://maple-software.com/");
        holder.add(obj5);

        Model obj6 = new Model();
        obj6.setCompany("Mahindra Satyam");
        obj6.setDetails("Mahindra Satyam Old TB Hospital Area,\n" +
                "Dwaraka Nagar,\n" +
                "Visakhapatnam,\n" +
                "Andhra Pradesh 530016");
        obj6.setClickHere("https://www.techmahindra.com/");
        holder.add(obj6);


        Model obj7 = new Model();
        obj7.setCompany("Wipro");
        obj7.setDetails("Address: 50-75-23/10,\n" + "Rama Talkies Road,\n" +
                "STPI, Old TB Hospital Area, Resapuvanipalem,\n" +
                "Visakhapatnam, Andhra Pradesh 530013");
        obj7.setClickHere("https://www.wipro.com/");
        holder.add(obj7);

        Model obj8 = new Model();
        obj8.setCompany("Inspire Edge");
        obj8.setDetails("Address: 2nd Floor,\n" + "Softsol India Building,\n" +
                "PLOT #6, HILL #2,\n" + "APIIC SEZ IT/ITES," +
                " Pedda Rushikonda,\n" +
                "Visakhapatnam, Andhra Pradesh 530048");
        obj8.setClickHere("https://inspiredgeit.com/connect/");
        holder.add(obj8);

        Model obj9 = new Model();
        obj9.setCompany("Fluentgrid");
        obj9.setDetails("Fluentgrid Limited\n" +
                "Waltair Heights,\n" +
                "Level 5, 9-29-19/A,\n" +
                "Balaji Nagar, Visakhapatnam,\n" +
                "Andhra Pradesh 530003");
        obj9.setClickHere("https://fluentgrid.com/");
        holder.add(obj9);

        Model obj10 = new Model();
        obj10.setCompany("Tech Tammina");
        obj10.setDetails("3rd Floor SVS Towers,\n" + "Sankara Matam Rd,\n" +
                "Beside Syndicate Bank,\n" + "Madhuranagar,\n" +
                "Visakhapatnam, Andhra Pradesh 530016");
        obj10.setClickHere("https://www.techtammina.com/");
        holder.add(obj10);

        Model obj11 = new Model();
        obj11.setCompany("Prospecta Technologies");
        obj11.setDetails("India Office: (Offshore Development Center)\n" +
                "2-30-25, SBI-21,\n" + "Sector-7, MVP Colony,\n" +
                "Visakhapatnam, Andhra Pradesh 530017 ");
        obj11.setClickHere("https://prospectatech.com/");
        holder.add(obj11);

        Model obj12 = new Model();
        obj12.setCompany("Catchway");
        obj12.setDetails("Catch Web Solutions PVT LTD\n" +
                "504, Mana Pragada,\n" +
                "Gurdudwar Busstop, Visakhapatnam-530016\n" +
                "Phone: +91-891-6569666");
        obj12.setClickHere("https://www.zaubacorp.com/");
        holder.add(obj12);

        Model obj13 = new Model();
        obj13.setCompany("Amzur Technologies");
        obj13.setDetails("Global Development Center\n" +
                "Amzur Infotech Private Limited \n" +
                "Survey No: 44P, 4th Floor, Tech Hub, \n" +
                "Resapuvanipalem, Visakhapatnam\n" +
                "Phone:+91 903 003 1882");
        obj13.setClickHere("https://amzur.com/");
        holder.add(obj13);

        Model obj14 = new Model();
        obj14.setCompany("Color Moon Technologies");
        obj14.setDetails("405 5th floor\n" +
                "Bharat towers the fifth lane\n" +
                "vizag, Andhra Pradesh");
        obj14.setClickHere("https://thecolourmoon.com/");
        holder.add(obj14);

        Model obj15 = new Model();
        obj15.setCompany("Soft Script");
        obj15.setDetails("#8&9, Krupa Apartments,\n" +
                "CBM Compound, Visakhapatnam,\n" +
                "Zipcode: 530003,\n" +
                "Tel: 0891 2501202,2738589");
        obj15.setClickHere("https://www.softscripts.net/");
        holder.add(obj15);

        Model obj16 = new Model();
        obj16.setCompany("Evolutyz IT Services");
        obj16.setDetails("SF2, VUDA Building, \n" +
                "Seethammadhara\n" +
                "Visakhapatnam, \n" +
                "Andhra Pradesh 530013");
        obj16.setClickHere("https://www.softwaresuggest.com/company/evolutyz-it");
        holder.add(obj16);

        Model obj17 = new Model();
        obj17.setCompany("Prospecta");
        obj17.setDetails("2-30-25, SBI1, \n" +
                "Sector-7, MVP Colony, \n" +
                "Vizag 530017,\n" +
                "Phone: +91 891 2507335");
        obj17.setClickHere("https://prospectatech.com/");
        holder.add(obj17);

        Model obj18 = new Model();
        obj18.setCompany("21st-century software Solutions");
        obj18.setDetails("North Extension layout, \n" +
                "50-102-8/3,\n" +
                "Visakhapatnam, " + "530013\n" +
                "Phone number: 891 695 96666");
        obj18.setClickHere("https://www.21cssindia.com/");
        holder.add(obj18);


        Model obj19 = new Model();
        obj19.setCompany("Mahathi");
        obj19.setDetails("Hill No.2, Plot No. 12 & 13,\n" +
                "Rushikonda, IT / ITES, SEZ,\n" +
                "Bay Area Cyber Towers,\n" +
                "Vsp - 530 043\n" +
                "Landline:+91 81430 50304");
        obj19.setClickHere("http://www.mahathi.com/");
        holder.add(obj19);

        Model obj20 = new Model();
        obj20.setCompany("Tek Wissen");
        obj20.setDetails("TekWissen Software Pvt. Ltd.\n" +
                "9-29-22, 2nd floor, \n" +
                "Balaji Nagar, \n" +
                "Siripuram, Vsp, 530003\n" +
                "Phone: +91 6301951266/67/68/69");
        obj20.setClickHere("https://tekwissen.in/");
        holder.add(obj20);

        Model obj21 = new Model();
        obj21.setCompany("Bluefrog India");
        obj21.setDetails("Bluefrog Mobile Technologies PVT LTD\n" +
                "2ND FLOOR, \n" +
                "SITA NILAYAM,\n" +
                "Near Care Hospital, Ram Nagar, \n" +
                "Visakhapatnam, 530002");
        obj21.setClickHere("http://www.bluefrogindia.com/");
        holder.add(obj21);

        Model obj22 = new Model();
        obj22.setCompany("Sajix Software Solutions Pvt Ltd");
        obj22.setDetails("9-26-4," + "Paila Mansions CBM Compound\n" +
                "Visakhapatnam  530003");
        obj22.setClickHere("http://www.sajix.com/");
        holder.add(obj22);

        Model obj23 = new Model();
        obj23.setCompany("Open Logix Software Sol. Pvt Ltd");
        obj23.setDetails("4-58-2/9, MIG 80,\n" + "Lawsons Bay Colony\n" +
                "Visakhapatnam  530017");
        obj23.setClickHere("https://www.open-logix.com/");
        holder.add(obj23);

        Model obj24 = new Model();
        obj24.setCompany("Trifecta Technologies");
        obj24.setDetails("10-1-8/24, Third Floor - 1,\n" + "Landmark Building Sampath Vinayagar Road,\n" + "Waltair Uplands\n" +
                "Visakhapatnam 530003");
        obj24.setClickHere("http://www.trifecta.com/");
        holder.add(obj24);


        Model obj25 = new Model();
        obj25.setCompany("Patra Corporation");
        obj25.setDetails("D.No.37-5-88/1,\n" + "Sy.No.81/A Zone 4 Manchu Konda Gardens,\n" + "NH16, Muralinagar\n" +
                "Visakhapatnam 530007");
        obj25.setClickHere("https://www.patracorp.com/");
        holder.add(obj25);

        Model obj26 = new Model();
        obj26.setCompany("Vigiboss IT Solutions Pvt Ltd");
        obj26.setDetails("7-1-75, Encore Centre,\n" + "Chinna Waltair,\n" +
                "Visakhapatnam  530017");
        obj26.setClickHere("http://www.vigiboss.com/");
        holder.add(obj26);

        Model obj27 = new Model();
        obj27.setCompany("Virtual Guard Services Pvt Ltd");
        obj27.setDetails("Tech Mahindra Building,\n" + "Phase-2,Third Floor A B & C Wing,\n" + "Survey No 44 (P),\n" + "Old Rasapuvanipalem\n" +
                "Visakhapatnam  530003");
        obj27.setClickHere("http://www.vgssecurity.com/");
        holder.add(obj27);

        Model obj28 = new Model();
        obj28.setCompany("ACN Infotech India Pvt Ltd");
        obj28.setDetails("3 A, & E, Mangalagiri Chambers,\n" + "Siripuram\n" +
                "Visakhapatnam  530003");
        obj28.setClickHere("http://www.acninfotech.com/");
        holder.add(obj28);

        Model obj29 = new Model();
        obj29.setCompany("Neotel Network Services Pvt Ltd");
        obj29.setDetails("Flat No.404,\n" + "GVK Plaza, Seethamma peta,\n" +
                "Visakhapatnam 530016");
        obj29.setClickHere("http://neotelnetworks.com/");
        holder.add(obj29);

        Model obj30 = new Model();
        obj30.setCompany("Datasoft Comnet Pvt Ltd");
        obj30.setDetails("48-12-14,\n" + "Vanitha Residency Janikirama Street, Srinagar\n" +
                "Visakhapatnam  530016");
        obj30.setClickHere("https://www.datasoftcomnet.com/");
        holder.add(obj30);

        Model obj31 = new Model();
        obj31.setCompany("Gods Grace Technologies");
        obj31.setDetails("Visakhapatnam\n" +
                "Andhra Pradesh , 530001");
        obj31.setClickHere("https://www.godsgracetech.com/");
        holder.add(obj31);

        Model obj32 = new Model();
        obj32.setCompany("JITWORLD Technologies Pvt. Ltd");
        obj32.setDetails("No:11-1-5, 1st floor,\n" + "U.B.Complex A Block,\n" + "Siripuram Junction\n" +
                "Visakhapatnam  530003");
        obj32.setClickHere("http://www.jitworld.com/default.aspx");
        holder.add(obj32);

        Model obj33 = new Model();
        obj33.setCompany("Laser Systems Ltd");
        obj33.setDetails("7-11-6/19, 3rd Floor,\n" + "Eswar Palace\n" + "1st Lane, Dwarakanagar,\n" +
                "Visakhapatnam  530016");
        obj33.setClickHere("http://www.lasersystems.in/");
        holder.add(obj33);


      /*  Model obj34 = new Model();
        obj34.setCompany("");
        obj34.setDetails("");
        obj34.setClickHere("");
        holder.add(obj34);

        Model obj35 = new Model();
        obj35.setCompany("");
        obj35.setDetails("");
        obj35.setClickHere("");
        holder.add(obj35);*/





        Collections.sort(holder);

        return holder;


    }


}