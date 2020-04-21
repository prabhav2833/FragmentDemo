package com.example.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BottonFragment extends Fragment {

    Button clicked;
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_botton, container, false);
        // Inflate the layout for this fragment
        tv = (TextView)v.findViewById(R.id.bot_text);
        clicked = (Button)v.findViewById(R.id.id_botfragbut);
            clicked.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv.setText("Clicked");
                }
            });


        return v;
    }
}
