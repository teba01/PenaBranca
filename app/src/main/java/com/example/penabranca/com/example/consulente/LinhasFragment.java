package com.example.penabranca.com.example.consulente;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.penabranca.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LinhasFragment extends Fragment {


    public LinhasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_linhas, container, false);
    }

}
