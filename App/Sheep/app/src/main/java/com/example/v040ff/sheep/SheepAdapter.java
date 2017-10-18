package com.example.v040ff.sheep;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

/**
 * Created by cloud on 2017/09/24.
 */

public class SheepAdapter extends RealmBaseAdapter<Sheep> {
    private static class ViewHolder{
        TextView num;
        TextView mondai;
        TextView kaisetsu;
    }
    public SheepAdapter(@Nullable OrderedRealmCollection<Sheep> data) {
        super(data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView==null){
            convertView= LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.mondai=(TextView) convertView.findViewById(android.R.id.text1);
            viewHolder.num=(TextView) convertView.findViewById(android.R.id.text2);
            //viewHolder.kaisetsu=(TextView) convertView.findViewById(android.R.id.text3);
            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)convertView.getTag();
        }
        Sheep sheep=adapterData.get(position);
        viewHolder.num.setText(sheep.getNum());
        viewHolder.mondai.setText(sheep.getMondai());
        //viewHolder.kaisetsu.setText(sheep.getKaisetsu());
        return convertView;
    }
}
