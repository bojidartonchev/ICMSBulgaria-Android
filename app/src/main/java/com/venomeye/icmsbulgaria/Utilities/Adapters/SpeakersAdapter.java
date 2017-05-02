package com.venomeye.icmsbulgaria.Utilities.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Speakers;
import com.venomeye.icmsbulgaria.Utilities.RoundedParseImageView;

import java.util.List;

public class SpeakersAdapter extends ArrayAdapter<Speakers> {

    private Context mContext;

    public SpeakersAdapter(Context context, List<Speakers> objects)
    {
        super(context,R.layout.list_view_speaker,objects);
        mContext=context;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_view_speaker, parent, false);
        }
        Speakers speaker = getItem(position);
        TextView title = (TextView) v.findViewById(R.id.title);
        TextView pos = (TextView) v.findViewById(R.id.position);
        RoundedParseImageView image = (RoundedParseImageView) v.findViewById(android.R.id.icon);
        int resID = mContext.getResources().getIdentifier(speaker.getImageTitle() , "drawable", mContext.getPackageName());
        image.setImageResource(resID);
        title.setText(speaker.getTitle());
        pos.setText(speaker.getPosition());


        return v;
    }
}
