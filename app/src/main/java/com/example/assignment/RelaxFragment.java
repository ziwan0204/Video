package com.example.assignment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mikhaellopez.circularimageview.CircularImageView;

public class RelaxFragment extends Fragment {

    CircularImageView clickVideo;


    public RelaxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_relax, container, false);
        clickVideo = view.findViewById(R.id.imageView2);
        clickVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VideoActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
