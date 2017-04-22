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
import com.parse.ParseImageView;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsAdapter extends ParseQueryAdapter{


    public NewsAdapter(Context context)
    {
        super(context, new ParseQueryAdapter.QueryFactory<ParseNews>() {
            public ParseQuery create() {
                ParseQuery query = new ParseQuery("News");
                query.orderByDescending("createdAt");
                return query;
            }
        });
    }

    @Override
    public View getItemView(final ParseObject object, View v, ViewGroup parent) {
        if (v == null) {
            v = View.inflate(getContext(), R.layout.list_view_news_row, null);
        }

        super.getItemView(object, v, parent);

        // Add and download the image
        ParseImageView newsImage = (ParseImageView) v.findViewById(R.id.photo);
        ParseFile imageFile = object.getParseFile("image");
        newsImage.setScaleType(ImageView.ScaleType.FIT_XY);
        if (imageFile != null) {
            newsImage.setParseFile(imageFile);
            newsImage.loadInBackground();
        }
        TextView newsTitle = (TextView) v.findViewById(R.id.title);
        TextView newsDate = (TextView) v.findViewById(R.id.date);
        newsTitle.setText(object.getString("title"));;
        String currentDate =
                new SimpleDateFormat("yyyy-MMM-dd").format(object.getCreatedAt()).toString();
        newsDate.setText(currentDate);

        return v;
    }
}
