package com.venomeye.icmsbulgaria.Utilities.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Program;

import java.util.List;

public class ProgramAdapter extends ArrayAdapter<Program> {
    public ProgramAdapter(Context context, List<Program> objects)
    {
        super(context,R.layout.list_view_event,objects);
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_view_event, parent, false);
        }


        Program prog = getItem(position);
        TextView title = (TextView) v.findViewById(R.id.title);
        TextView time = (TextView) v.findViewById(R.id.time);
        TextView location = (TextView) v.findViewById(R.id.location);
        title.setText(prog.getTitle());
        time.setText(prog.getTime());
        location.setText(prog.getLocation());


        return v;
    }
}
