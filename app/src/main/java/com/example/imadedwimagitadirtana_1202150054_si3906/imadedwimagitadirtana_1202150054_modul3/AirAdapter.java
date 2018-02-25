package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dwima on 2/25/2018.
 */

public class AirAdapter extends RecyclerView.Adapter<AirAdapter.MinumanViewHolder> {

    public ArrayList<DataMinuman> datas;

    public AirAdapter(ArrayList<DataMinuman> datas) {
        this.datas = datas;


    }

    @Override
    public MinumanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //untuk menampilkan daftar menu
        View view = layoutInflater.inflate(R.layout.activity_daftar_menu, parent, false);
        return new MinumanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MinumanViewHolder holder, int position) {
        final DataMinuman item = datas.get(position);
        holder.bindTo(item);
        //untuk
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),DetailMenuActivity.class);
                go.putExtra("etitle",item.getNama());
                go.putExtra("edesc",item.getDeskripsi());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class MinumanViewHolder extends RecyclerView.ViewHolder{

        private TextView mLblMinumanJudul;
        private TextView mLblMinumanInfo;
        private ImageView mLblMinumanImg;
        private Context mContext;
        private DataMinuman mCurrentMinuman;

        public MinumanViewHolder(View itemView) {
            super(itemView);
            mLblMinumanJudul = (TextView)itemView.findViewById(R.id.JudulMenu);
            mLblMinumanInfo = (TextView)itemView.findViewById(R.id.DeskripsiMenu);
            mLblMinumanImg = (ImageView)itemView.findViewById(R.id.logoair);
        }

        public void bindTo(DataMinuman minuman){
            mCurrentMinuman = minuman;
            mLblMinumanImg.setImageResource(minuman.getGambar());
            mLblMinumanJudul.setText(minuman.getNama());
            mLblMinumanInfo.setText(minuman.getInfo());
        }
    }
}
