package com.example.psalmers.virtualsafespace;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PostListAdapter extends ArrayAdapter {
    private final Post[] posts;
    private final Context context;

    public PostListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.posts = (Post[]) objects;
    }

    public PostListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List list) {
        super(context, resource, list);
        this.context = context;
        this.posts = (Post[]) list.toArray();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) this.context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.post_list_item, parent, false);

        TextView body = (TextView) rowView.findViewById(R.id.post_body);
        body.setText(posts[position].body);

        TextView handler = (TextView) rowView.findViewById(R.id.handle);
        handler.setText(posts[position].handle);

        TextView emotes = (TextView) rowView.findViewById(R.id.emotes);
        emotes.setText("❤️: 5, \uD83D: 3");

        return rowView;
    }
}
