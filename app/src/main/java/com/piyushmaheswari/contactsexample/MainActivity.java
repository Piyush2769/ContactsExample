package com.piyushmaheswari.contactsexample;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SimpleCursorAdapter simpleCursorAdapter;

    private RelativeLayout relativeLayout;
    private LinearLayout linearLayout;


    private TextView d21;
    private Image i3;

    private TextView d21s;
    private Image i3s;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
