package com.venomeye.icmsbulgaria.Utilities.Adapters;


import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.ParseUtil.ParseNews;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;
import com.venomeye.icmsbulgaria.Utilities.RoundedParseImageView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkshopsAdapter extends ParseQueryAdapter{


    public WorkshopsAdapter(Context context)
    {
        super(context, new ParseQueryAdapter.QueryFactory<ParseNews>() {
            public ParseQuery create() {
                ParseQuery query = new ParseQuery("Workshops");
                query.orderByAscending("createdAt");
                return query;
            }
        });
    }

    @Override
    public View getItemView(final ParseObject object, View v, ViewGroup parent) {
        if (v == null) {
                v = View.inflate(getContext(), R.layout.list_view_workshop_row, null);

        }

        super.getItemView(object, v, parent);

        // Add and download the image
        RoundedParseImageView workshopImage = (RoundedParseImageView) v.findViewById(android.R.id.icon);
        ParseFile imageFile = object.getParseFile("image");
        //workshopImage.setScaleType(ImageView.ScaleType.FIT_XY);
        if (imageFile != null) {
            workshopImage.setParseFile(imageFile);
            workshopImage.loadInBackground();
        }
        TextView workshopDate = (TextView) v.findViewById(R.id.date);
        workshopDate.setText(new SimpleDateFormat("dd MMM").format(object.getDate("date")).toString());
        TextView workshopTitle = (TextView) v.findViewById(R.id.title);
        workshopTitle.setText(object.getString("title"));

        return v;
    }
}
