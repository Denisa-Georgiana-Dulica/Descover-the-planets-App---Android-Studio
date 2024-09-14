package com.example.descovertheplanets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet>
{
    private Context context;
    private ArrayList<Planet> planetList;

    public MyCustomAdapter(Context context, ArrayList<Planet> planetList) {
        super(context, R.layout.my_item,planetList);
        this.context = context;
        this.planetList = planetList;
    }

    static class ViewHolder
    {
        TextView planetName;
        TextView moonNr;
        ImageView img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final View result;
        ViewHolder holder;
        Planet planet=getItem(position);
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.my_item,parent,false);

            holder=new ViewHolder();
            holder.planetName=convertView.findViewById(R.id.planetName);
            holder.moonNr=convertView.findViewById(R.id.moonsNr);
            holder.img=convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }
        else {
            holder= (ViewHolder) convertView.getTag();

        }
        result=convertView;

        holder.planetName.setText(planet.getPlanetName());
        holder.moonNr.setText(planet.getNrMoons());
        holder.img.setImageResource(planet.getImage());

        return result;
    }
}
