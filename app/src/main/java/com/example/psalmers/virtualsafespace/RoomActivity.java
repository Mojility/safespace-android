package com.example.psalmers.virtualsafespace;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        String roomName = DataManager.getInstance().getCurrentRoom().name;
        setTitle(roomName);

        listView = (ListView) findViewById(R.id.post_list);
        final Post[] postArray = {new Post("Test Post 1", 0, "Bob"),
                new Post("Test Post 2", 1, "Joan"),
                new Post("Test Post 3", 2, "Bob"),
                new Post("Test Post 4", 3, "Joan"),
                new Post("Test Post 5", 4, "Bob")};

        PostListAdapter adapter = new PostListAdapter(
                this,
                R.layout.post_list_item,
                postArray);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Post post = (Post) listView.getItemAtPosition(position);
            }

        });
    }

}
