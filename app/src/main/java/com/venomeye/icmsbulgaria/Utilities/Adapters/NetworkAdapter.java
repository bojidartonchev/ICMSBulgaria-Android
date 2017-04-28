package com.venomeye.icmsbulgaria.Utilities.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Networking;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Program;

import java.util.List;

public class NetworkAdapter extends ArrayAdapter<Networking> {
    public NetworkAdapter(Context context, List<Networking> objects)
    {
        super(context,R.layout.list_view_network,objects);
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_view_network, parent, false);
        }


        Networking net = getItem(position);
        TextView title = (TextView) v.findViewById(R.id.title);
        TextView content = (TextView) v.findViewById(R.id.content);
        TextView date = (TextView) v.findViewById(R.id.date);
        TextView location = (TextView) v.findViewById(R.id.location);
        title.setText(net.getTitle());
        content.setText(net.getContent());
        location.setText(net.getLocation());
        date.setText(net.getDate());


        return v;
    }
}
