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
import com.google.android.material.snackbar.Snackbar;
import com.rellik.vico.MainActivity;
import com.rellik.vico.Model.Model;
import com.rellik.vico.R;
import com.rellik.vico.WebViews.Show;
import com.rellik.vico.myadapter_college;


import java.util.ArrayList;
import java.util.Collections;



public class College extends Fragment {

    RecyclerView recyclerView;
    myadapter_college adapter;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_college, container, false);


        recyclerView = view.findViewById(R.id.recyclerview_college);
        FloatingActionButton fab = view.findViewById(R.id.fab);



        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new myadapter_college(dataqueue(), requireContext());
        recyclerView.setAdapter(adapter);


        fab.setOnClickListener(v -> {
            Intent i = new Intent(getContext(), Show.class);
            startActivity(i);
        });

        return view;
    }


    public  ArrayList<Model> dataqueue() {

        ArrayList<Model> holder = new ArrayList<>();


        Model obj1 = new Model();
        obj1.setCompany("Andhra University");
        obj1.setDetails("Visakhapatnam\n" +
                "Andhra Pradesh , 530003");
        obj1.setClickHere("http://andhrauniversity.info/");
        holder.add(obj1);


        Model obj2 = new Model();
        obj2.setCompany("College of Science & Technology");
        obj2.setDetails("Andhra University, Visakhapatnam\n" +
                "Andhra Pradesh , 530003");
        obj2.setClickHere("");
        holder.add(obj2);

        Model obj3 = new Model();
        obj3.setCompany("Delhi Public School, Visakhapatnam");
        obj3.setDetails("Sector 8 Ukkunagaram\n" +
                "Visakhapatnam," +
                "\nAndhra Pradesh , 530032");
        obj3.setClickHere("http://www.dpsvisakhapatnam.org/");
        holder.add(obj3);

        Model obj4 = new Model();
        obj4.setCompany("Dr BR Ambedkar College of Law");
        obj4.setDetails("Andhra University\n" +
                "Visakhapatnam," +
                "\nAndhra Pradesh , 530003");
        obj4.setClickHere("http://www.drbrambedkarcollegeoflaw.com/");
        holder.add(obj4);

        Model obj5 = new Model();
        obj5.setCompany("Pradhama Multispeciality Hospital & Research Institute Ltd");
        obj5.setDetails("Door no. 1-1-83, Venkojipalem,\n" +
                "Visakhapatnam," +
                "\nAndhra Pradesh , 530017");
        obj5.setClickHere("");
        holder.add(obj5);

        Model obj6 = new Model();
        obj6.setCompany("Indian School of Petroleum & Energy");
        obj6.setDetails("2nd Floor, AU Engg College Main Block, Andhra University,\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530003");
        obj6.setClickHere("http://iipe.ac.in/");
        holder.add(obj6);

        Model obj7 = new Model();
        obj7.setCompany("Indian Institute of Management(IIM), Visakhapatnam (IIM)");
        obj7.setDetails("Andhra Bank School of Business Building Andhra University Campus\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530003");
        obj7.setClickHere("http://www.iimv.ac.in/");
        holder.add(obj7);

        Model obj8 = new Model();
        obj8.setCompany("GITAM Institute of Medical Sciences & Research");
        obj8.setDetails("GITAM University Rushikonda,\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530045");
        obj8.setClickHere("http://gimsr.gitam.edu/");
        holder.add(obj8);

        Model obj9 = new Model();
        obj9.setCompany("Gayatri Vidya Parishad College of Engineering");
        obj9.setDetails("Madhurawada\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530041");
        obj9.setClickHere("http://gvpce.ac.in/");
        holder.add(obj9);

        Model obj10 = new Model();
        obj10.setCompany("Gayathri Vidya Parishad Institute of Health Care & Medical Technology");
        obj10.setDetails("Maridi valley," + "\nMarikavalasa Village, Madhurawada,\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 530048");
        obj10.setClickHere("http://www.gvpmc.in/");
        holder.add(obj10);

        Model obj11 = new Model();
        obj11.setCompany("Gandhi Institute of Technology and Management");
        obj11.setDetails("Gandhi Nagar, Rushikonda\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 530045");
        obj11.setClickHere("http://www.gitam.edu/");
        holder.add(obj11);

        Model obj12 = new Model();
        obj12.setCompany("Academy for Comprehensive Training");
        obj12.setDetails("#46-10-108, pp. DRM Office, Station Road,\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530016");
        obj12.setClickHere("");
        holder.add(obj12);

        Model obj13 = new Model();
        obj13.setCompany("Albright Consulting");
        obj13.setDetails("48-8-1, IIHT House, Chaitanya college road, Diagonal opp to V Hotel, Dwarkanagar\n" +
                "Visakhapatnam Andhra Pradesh , 530016");
        obj13.setClickHere("http://www.albright.in/");
        holder.add(obj13);

        Model obj14 = new Model();
        obj14.setCompany("Viswanadha Institute of Technology & Management");
        obj14.setDetails("Mindivanipalem (V), Anandapuram (M)\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 531173");
        obj14.setClickHere("");
        holder.add(obj14);


        Model obj15 = new Model();
        obj15.setCompany("Vignan Institute Of Information Technology");
        obj15.setDetails("Besides VSEZ , Duvvada Vadlapudi Post ,Gajuwaka\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 530049");
        obj15.setClickHere("http://vignaniit.edu.in/");
        holder.add(obj15);

        Model obj16 = new Model();
        obj16.setCompany("Vignan Institute of Engineering for Women");
        obj16.setDetails("Kapujaggaraju peta Vadlapudi post Backside of VSEZ\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530046");
        obj16.setClickHere("http://www.view.edu.in/");
        holder.add(obj16);


        Model obj17 = new Model();
        obj17.setCompany("Timpany School");
        obj17.setDetails("Asilmetta\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530003");
        obj17.setClickHere("http://www.timpanyschool.in/");
        holder.add(obj17);

        Model obj18 = new Model();
        obj18.setCompany("Sanketika Institute of Technology & Management");
        obj18.setDetails("Behind International Cricket Stadium" + "\nPM Palem\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 530041");
        obj18.setClickHere("http://www.sanketikajntu.in/");
        holder.add(obj18);

        Model obj19 = new Model();
        obj19.setCompany("Ambedkar Institute Of Management Studies");
        obj19.setDetails("Sandipani Nagar, Yendada,\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530045");
        obj19.setClickHere("http://www.aimsbschool.org/");
        holder.add(obj19);


        Model obj20 = new Model();
        obj20.setCompany("Andhra Medical College, Vsp");
        obj20.setDetails("Maharanipeta\n" +
                "Visakhapatnam" + "\nAndhra Pradesh, 530002");
        obj20.setClickHere("http://amc.edu.in/");
        holder.add(obj20);

        Model obj21 = new Model();
        obj21.setCompany("Anil Neerukonda Institute of Dental Sciences, Vsp");
        obj21.setDetails("Bheemunipatnam, Sanghivalasa,\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 531162");
        obj21.setClickHere("http://www.anits.edu.in/");
        holder.add(obj21);


        Model obj22 = new Model();
        obj22.setCompany("Baba Institute of Technology and Sciences");
        obj22.setDetails("Pothimallayapalem\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530041");
        obj22.setClickHere("http://www.bitsvizag.com/");
        holder.add(obj22);


        Model obj23 = new Model();
        obj23.setCompany("Chaitanya Engineering College");
        obj23.setDetails("Chaitanya valley, Kommadi Madhurawada\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530048");
        obj23.setClickHere("http://www.cec.ac.in/");
        holder.add(obj23);


        Model obj24 = new Model();
        obj24.setCompany("Colleges of Arts & Commerce");
        obj24.setDetails("Andhra University, Visakhapatnam\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530003");
        obj24.setClickHere("http://www.andhrauniversity.edu.in/");
        holder.add(obj24);


        Model obj25 = new Model();
        obj25.setCompany("DAV Centenary Public School, Visakhapatnam");
        obj25.setDetails("Sector3, Ukkunagaram\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530032");
        obj25.setClickHere("http://www.davukku.com/");
        holder.add(obj25);


        Model obj26 = new Model();
        obj26.setCompany("Dr.Lankapalli Bullayya College");
        obj26.setDetails("Survey No:44, New Resapuvanipalem\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530013");
        obj26.setClickHere("");
        holder.add(obj26);

        Model obj27 = new Model();
        obj27.setCompany("GITAM Dental College & Hospital");
        obj27.setDetails("Gandhinagar Campus, Rushikonda\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530045");
        obj27.setClickHere("http://gdch.edu.in/");
        holder.add(obj27);

        Model obj28 = new Model();
        obj28.setCompany("Gitam School of Architecture (Gsa), Gitam University");
        obj28.setDetails("Gandhi Nagar, Rushikonda\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530045");
        obj28.setClickHere("http://vspgsa.gitam.edu/");
        holder.add(obj28);

        Model obj29 = new Model();
        obj29.setCompany("Gods Grace Technologies");
        obj29.setDetails("Visakhapatnam\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530001");
        obj29.setClickHere("http://www.godsgracetech.com/");
        holder.add(obj29);

        Model obj30 = new Model();
        obj30.setCompany("Integral Institute of Advanced Management");
        obj30.setDetails("Plot No 10, Sector 7 MVP Colony\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530017");
        obj30.setClickHere("http://www.iiamvizag.com/");
        holder.add(obj30);

        Model obj31 = new Model();
        obj31.setCompany("JNNC Technologies Pvt Ltd");
        obj31.setDetails("Ravindra Bharathi School Sagar Nagar Dwaraka Nagar\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530016");
        obj31.setClickHere("http://jnnctechnologies.com/");
        holder.add(obj31);

        Model obj32 = new Model();
        obj32.setCompany("Kendriya Vidyalaya Steel Plant Visakhapatnam");
        obj32.setDetails("Sector-1, Steel Plant Township, Ukkunagaram, Visakhapatnam\n" +
                "Andhra Pradesh , 530032");
        obj32.setClickHere("http://www.steelplant.kvs.ac.in/");
        holder.add(obj32);

        Model obj33 = new Model();
        obj33.setCompany("KV No. 2 Sri Vijayanagar, Vsp.");
        obj33.setDetails("Sri Vijaya Nagar, PO Industrial Estate, Gavara Kanchara Palem\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530007");
        obj33.setClickHere("");
        holder.add(obj33);


        Model obj34 = new Model();
        obj34.setCompany("Little Angels School, MVP Colony");
        obj34.setDetails("Sector-3, MVP Colony\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530017");
        obj34.setClickHere("http://www.littleangels.org.in/");
        holder.add(obj34);


        Model obj35 = new Model();
        obj35.setCompany("Navy Children School, Visakhapatnam");
        obj35.setDetails("Nausena Baugh, Gandhigram\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530005");
        obj35.setClickHere("http://www.ncsvizag.edu.in/");
        holder.add(obj35);

        Model obj36 = new Model();
        obj36.setCompany("NRI Institute of Medical Sciences");
        obj36.setDetails("Sangivalasa, Bheemunipatnam,\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 531162");
        obj36.setClickHere("http://nriims.com/");
        holder.add(obj36);

        Model obj37 = new Model();
        obj37.setCompany("Pydah College of Engineering & Technology");
        obj37.setDetails("Gambhiram Boyaplem\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 531163");
        obj37.setClickHere("http://www.pydah.edu.in/");
        holder.add(obj37);

        Model obj38 = new Model();
        obj38.setCompany("Raghu Educational Society");
        obj38.setDetails("Dakamarri(v), Bheemili\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 531162");
        obj38.setClickHere("http://www.raghuenggcollege.com/");
        holder.add(obj38);

        Model obj39 = new Model();
        obj39.setCompany("Samata College");
        obj39.setDetails("M.V.P. Colony\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530017");
        obj39.setClickHere("http://www.samatacollege.co.in/");
        holder.add(obj39);

        Model obj40 = new Model();
        obj40.setCompany("Sanketika Vidya Parishad Engineering College");
        obj40.setDetails("S.V.P. Engineering College,P.M. Palem, Visakhapatnam\n" +
                "Andhra Pradesh , 530041");
        obj40.setClickHere("http://www.svpec.edu.in/");
        holder.add(obj40);


        Model obj41 = new Model();
        obj41.setCompany("School of Wonder Kids");
        obj41.setDetails("9-13-45/6/1, Vijaya Co-Operative Layout, VIP Rd Near Tycoon Hotel\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 530016");
        obj41.setClickHere("http://www.schoolofwonderkids.com/");
        holder.add(obj41);

        Model obj42 = new Model();
        obj42.setCompany("Siva Sivani Public School - Visakhapatnam");
        obj42.setDetails("4-7-11/1, lawson Bay Colony\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530017");
        obj42.setClickHere("");
        holder.add(obj42);


        Model obj43 = new Model();
        obj43.setCompany("Sri Prakash Vidyaniketan");
        obj43.setDetails("T.P.T.Colony Seethammadhara\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530013");
        obj43.setClickHere("http://www.sriprakashschools.com/");
        holder.add(obj43);


        Model obj44 = new Model();
        obj44.setCompany("Sun Institute of Technology and Management, Vsp");
        obj44.setDetails("47-14-5 beside State Bank of India Dwarakanagar Main Road," + "\nNear RTC Complex\n" +
                "Visakhapatnam Andhra Pradesh , 530016");
        obj44.setClickHere("http://www.siitam.edu.in/");
        holder.add(obj44);

        Model obj45 = new Model();
        obj45.setCompany("The Presidential School");
        obj45.setDetails("Survey No. 274/18 & 22, Kapuluppad village K. Nagerapalam, teh., Bheemunipatnam Mandal\n" +
                "Visakhapatnam, Andhra Pradesh , 531163");
        obj45.setClickHere("http://www.thepresidentialschool.in/");
        holder.add(obj45);


        Model obj46 = new Model();
        obj46.setCompany("Timpany Senior Secondary School");
        obj46.setDetails("C.B.M Compound\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530003");
        obj46.setClickHere("http://timpanyseniorsecondaryschool.in/");
        holder.add(obj46);


        Model obj47 = new Model();
        obj47.setCompany("Vignan Steel City Public School");
        obj47.setDetails("Duvvada, Near VSEZ,\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530046");
        obj47.setClickHere("http://www.vignanschools.org/");
        holder.add(obj47);


        Model obj48 = new Model();
        obj48.setCompany("Vignan Vidyalayam High School , Thimmapuram");
        obj48.setDetails("Thimmapuram,\n" +
                "Visakhapatnam" + "\nAndhra Pradesh , 531032");
        obj48.setClickHere("http://www.vignanschools.org/");
        holder.add(obj48);


        Model obj49 = new Model();
        obj49.setCompany("Visakha Institute of Professional Studies");
        obj49.setDetails("Kapuluppada\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 531163");
        obj49.setClickHere("http://www.vips.org.in/");
        holder.add(obj49);


        Model obj50 = new Model();
        obj50.setCompany("VITAM Engineering College");
        obj50.setDetails("Mindivani Palem Village, Sontyam\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 530017");
        obj50.setClickHere("");
        holder.add(obj50);


        Model obj51 = new Model();
        obj51.setCompany("Vizag Institute Of Technology");
        obj51.setDetails("Dakamarri Bheemili(M)\n" +
                "Visakhapatnam," + "\nAndhra Pradesh , 531162");
        obj51.setClickHere("http://www.vit-vizag.ac.in/");
        holder.add(obj51);

/*
        Model obj52 = new Model();
        obj52.setCompany("");
        obj52.setDetails("");
        obj52.setClickHere("");
        holder.add(obj52);

        Model obj53 = new Model();
        obj53.setCompany("");
        obj53.setDetails("");
        obj53.setClickHere("");
        holder.add(obj53);

        Model obj54 = new Model();
        obj54.setCompany("");
        obj54.setDetails("");
        obj54.setClickHere("");
        holder.add(obj54);

        Model obj55 = new Model();
        obj55.setCompany("");
        obj55.setDetails("");
        obj55.setClickHere("");
        holder.add(obj55);


*/


        Collections.sort(holder);

        return holder ;

    }


}