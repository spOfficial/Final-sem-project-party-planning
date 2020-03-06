package com.example.squadpartyplannerapp;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class add_event_f5 extends Fragment {
    TextView eventID,eventName,eventStartDate,eventEndDate,eventStartTime,eventEndTime;
    SharedPreferences sharedPreferences;

    public add_event_f5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_event_f5, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ((AppCompatActivity)getActivity()).getSupportActionBar();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Add Event");
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //((AppCompatActivity)getActivity()).getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        sharedPreferences = getActivity().getSharedPreferences("AddEventData", Context.MODE_PRIVATE);

        eventID = view.findViewById(R.id.event_id_f5);
        eventName = view.findViewById(R.id.event_name_f5);
        eventStartDate = view.findViewById(R.id.event_start_date_f5);
        eventEndDate = view.findViewById(R.id.event_end_date_f5);
        eventStartTime = view.findViewById(R.id.event_start_Time_f5);
        eventEndTime = view.findViewById(R.id.event_end_time_f5);
        eventID.setText(sharedPreferences.getString("EventID",""));
        eventName.setText(sharedPreferences.getString("event_name",""));
        eventStartDate.setText(sharedPreferences.getString("event_Start_date",""));
        eventEndDate.setText(sharedPreferences.getString("event_End_date",""));
        eventStartTime.setText(sharedPreferences.getString("event_start_time",""));
        eventEndTime.setText(sharedPreferences.getString("event_end_time",""));

    }
}
