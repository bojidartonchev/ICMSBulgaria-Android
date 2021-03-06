package com.venomeye.icmsbulgaria.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.Adapters.SessionsAdapter;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Sessions;

import java.util.List;

public class DentistryFragment extends Fragment {

    private ListView mListView;
    private SessionsAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dentistry, container, false);
        List<Sessions> sessions = Sessions.find(Sessions.class, "category = ?", "dentistry");
        mListView = (ListView) v.findViewById(R.id.dentistry_listview);
        mAdapter = new SessionsAdapter(getContext(), sessions);
        mListView.setAdapter(mAdapter);
        return v;
    }
}