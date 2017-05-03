package com.venomeye.icmsbulgaria.Utilities.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Program;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Sessions;

import java.util.List;

public class SessionsAdapter extends ArrayAdapter<Sessions> {
    public SessionsAdapter(Context context, List<Sessions> objects)
    {
        super(context,R.layout.list_view_session,objects);
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_view_session, parent, false);
        }


        Sessions session = getItem(position);
        TextView title = (TextView) v.findViewById(R.id.title);
        TextView content = (TextView) v.findViewById(R.id.content);
        title.setText(session.getAuthor());
        content.setText(session.getContent());


        return v;
    }
}
