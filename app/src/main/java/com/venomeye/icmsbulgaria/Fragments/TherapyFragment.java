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

public class TherapyFragment extends Fragment {

    private ListView mListView;
    private SessionsAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_therapy, container, false);
        List<Sessions> sessions = Sessions.find(Sessions.class, "category = ?", "therapy");
        mListView = (ListView) v.findViewById(R.id.therapy_listview);
        mAdapter = new SessionsAdapter(getContext(), sessions);
        mListView.setAdapter(mAdapter);
        return v;
    }
}