package com.example.psalmers.virtualsafespace;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list);

        listView = (ListView) findViewById(R.id.room_list);

        final Room[] roomArray = {new Room("Test Room 1", 0),
                new Room("Test Room 2", 1),
                new Room("Test Room 3", 2),
                new Room("Test Room 4", 3),
                new Room("Test Room 5", 4)};

        ArrayList<Room> rooms = new ArrayList<>(Arrays.asList(roomArray));

        ArrayList<String> roomNames = new ArrayList<>();
        for (Room room : rooms) {
            roomNames.add(room.name);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                roomNames);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                String itemValue = (String) listView.getItemAtPosition(position);

                Context context = getApplicationContext();
                Intent intent = new Intent(context, RoomActivity.class);
                DataManager.getInstance().setCurrentRoom(roomArray[position]);
                intent.putExtra("roomname", roomArray[position].name);
                context.startActivity(intent);
            }

        });
    }


}
