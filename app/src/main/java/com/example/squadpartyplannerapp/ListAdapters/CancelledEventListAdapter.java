package com.example.squadpartyplannerapp.ListAdapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.squadpartyplannerapp.ModelClass.Event_Info;
import com.example.squadpartyplannerapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CancelledEventListAdapter extends RecyclerView.Adapter<CancelledEventListAdapter.ItemViewHolder> {

    Context context;
    ArrayList<Event_Info> dataArrayList;
    Event_Info eventData;
    Uri eventImage;

    public CancelledEventListAdapter(ArrayList<Event_Info> eventDataArrayList, Context context) {
        dataArrayList = eventDataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CancelledEventListAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new CancelledEventListAdapter.ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        eventData = dataArrayList.get(position);
        eventImage = Uri.parse(eventData.getEventImage());
        Picasso.get().load(eventImage).into(holder.imageView);
        holder.eventName.setText(eventData.getEventName());
        holder.eventStartdate.setText(eventData.getEventStartDate());
        holder.eventEndDate.setText(eventData.getEventEndDate());
        holder.eventStartTime.setText(eventData.getEventStartTime());
        holder.eventEndTime.setText(eventData.getEventEndTime());
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView eventName,eventStartdate,eventEndDate,eventStartTime,eventEndTime;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.event_image_list_item);
            eventName = itemView.findViewById(R.id.eventName_item);
            eventStartdate = itemView.findViewById(R.id.eventStartDate_item);
            eventEndDate = itemView.findViewById(R.id.eventEndDate_item);
            eventStartTime = itemView.findViewById(R.id.eventStart_item);
            eventEndTime = itemView.findViewById(R.id.eventEnd_item);
        }
    }
}
