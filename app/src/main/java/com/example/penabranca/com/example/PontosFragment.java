package com.example.penabranca.com.example;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.penabranca.R;


public class PontosFragment extends Fragment {

    Button botaoplay1;
    Button botaoplay2;
    Button botaoplay3;
    Button botaoplay4;
    Button botaoplay5;
    Button botaoplay6;
    Button botaoplay7;
    Button botaoplay8;
    Button botaoplay9;
    Button botaoplay10;
    Button botaoplay11;
    Button botaoplay12;
    Button botaoplay13;
    Button botaoplay14;
    Button botaoplay15;
    Button botaoplay16;
    Button botaoplay17;
    Button botaoplay18;
    Button botaoplay19;
    Button botaoplay20;

    MediaPlayer mp;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    MediaPlayer mp5;
    MediaPlayer mp6;
    MediaPlayer mp7;
    MediaPlayer mp8;
    MediaPlayer mp9;
    MediaPlayer mp10;
    MediaPlayer mp11;
    MediaPlayer mp12;
    MediaPlayer mp13;
    MediaPlayer mp14;
    MediaPlayer mp15;
    MediaPlayer mp16;
    MediaPlayer mp17;
    MediaPlayer mp18;
    MediaPlayer mp19;
    MediaPlayer mp20;
    View vista;
    public PontosFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       vista= inflater.inflate(R.layout.fragment_pontos, container, false);



        botaoplay1 = vista.findViewById(R.id.botaoplay1);
        botaoplay2 = vista.findViewById(R.id.botaoplay2);
        botaoplay3 = vista.findViewById(R.id.botaoplay3);
        botaoplay4 = vista.findViewById(R.id.botaoplay4);
        botaoplay5 = vista.findViewById(R.id.botaoplay5);
        botaoplay6 = vista.findViewById(R.id.botaoplay6);
        botaoplay7 = vista.findViewById(R.id.botaoplay7);
        botaoplay8 = vista.findViewById(R.id.botaoplay8);
        botaoplay9 = vista.findViewById(R.id.botaoplay9);
        botaoplay10 = vista.findViewById(R.id.botaoplay10);
        botaoplay11 = vista.findViewById(R.id.botaoplay11);
        botaoplay12 = vista.findViewById(R.id.botaoplay12);
        botaoplay13 = vista.findViewById(R.id.botaoplay13);
        botaoplay14 = vista.findViewById(R.id.botaoplay14);
        botaoplay15 = vista.findViewById(R.id.botaoplay15);
        botaoplay16 = vista.findViewById(R.id.botaoplay16);
        botaoplay17 = vista.findViewById(R.id.botaoplay17);
        botaoplay18 = vista.findViewById(R.id.botaoplay18);
        botaoplay19 = vista.findViewById(R.id.botaoplay19);
        botaoplay20 = vista.findViewById(R.id.botaoplay20);
        mp = MediaPlayer.create(getActivity(),R.raw.ogum);
        mp2 = MediaPlayer.create(getActivity(),R.raw.yemaja);
        mp3 = MediaPlayer.create(getActivity(),R.raw.ogum2);
        mp4 = MediaPlayer.create(getActivity(),R.raw.obaluae);
        mp5 = MediaPlayer.create(getActivity(),R.raw.iemanja2);
        mp6 = MediaPlayer.create(getActivity(),R.raw.iemanja3);
        mp7 = MediaPlayer.create(getActivity(),R.raw.iemanja4);
        mp8 = MediaPlayer.create(getActivity(),R.raw.oxala);
        mp9 = MediaPlayer.create(getActivity(),R.raw.oxala2);
        mp10 = MediaPlayer.create(getActivity(),R.raw.iansa);
        mp11 = MediaPlayer.create(getActivity(),R.raw.nana);
        mp12 = MediaPlayer.create(getActivity(),R.raw.nana2);
        mp13 = MediaPlayer.create(getActivity(),R.raw.oxossi);
        mp14 = MediaPlayer.create(getActivity(),R.raw.xango);
        mp15 = MediaPlayer.create(getActivity(),R.raw.xango2);
        mp16 = MediaPlayer.create(getActivity(),R.raw.ibejada);
        mp17 = MediaPlayer.create(getActivity(),R.raw.obaluae2);
        mp18 = MediaPlayer.create(getActivity(),R.raw.oxum);
        mp19 = MediaPlayer.create(getActivity(),R.raw.oxum2);
        mp20 = MediaPlayer.create(getActivity(),R.raw.oxum3);

        botaoplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()){
                    mp.pause();
                    botaoplay1.setBackgroundResource(R.drawable.play);

                }else{
                    mp.start();
                    botaoplay1.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp2.isPlaying()){
                    mp2.pause();
                    botaoplay2.setBackgroundResource(R.drawable.play);

                }else{
                    mp2.start();
                    botaoplay2.setBackgroundResource(R.drawable.pause);
                }
            }
        });

        botaoplay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp3.isPlaying()){
                    mp3.pause();
                    botaoplay3.setBackgroundResource(R.drawable.play);

                }else{
                    mp3.start();
                    botaoplay3.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp4.isPlaying()){
                    mp4.pause();
                    botaoplay4.setBackgroundResource(R.drawable.play);

                }else{
                    mp4.start();
                    botaoplay4.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp5.isPlaying()){
                    mp5.pause();
                    botaoplay5.setBackgroundResource(R.drawable.play);

                }else{
                    mp5.start();
                    botaoplay5.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp6.isPlaying()){
                    mp6.pause();
                    botaoplay6.setBackgroundResource(R.drawable.play);

                }else{
                    mp6.start();
                    botaoplay6.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp7.isPlaying()){
                    mp7.pause();
                    botaoplay7.setBackgroundResource(R.drawable.play);

                }else{
                    mp7.start();
                    botaoplay7.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp8.isPlaying()){
                    mp8.pause();
                    botaoplay8.setBackgroundResource(R.drawable.play);

                }else{
                    mp8.start();
                    botaoplay8.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp9.isPlaying()){
                    mp9.pause();
                    botaoplay9.setBackgroundResource(R.drawable.play);

                }else{
                    mp9.start();
                    botaoplay9.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp10.isPlaying()){
                    mp10.pause();
                    botaoplay10.setBackgroundResource(R.drawable.play);

                }else{
                    mp10.start();
                    botaoplay10.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp11.isPlaying()){
                    mp11.pause();
                    botaoplay11.setBackgroundResource(R.drawable.play);

                }else{
                    mp11.start();
                    botaoplay11.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp12.isPlaying()){
                    mp12.pause();
                    botaoplay12.setBackgroundResource(R.drawable.play);

                }else{
                    mp12.start();
                    botaoplay12.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp13.isPlaying()){
                    mp13.pause();
                    botaoplay13.setBackgroundResource(R.drawable.play);

                }else{
                    mp13.start();
                    botaoplay13.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp14.isPlaying()){
                    mp14.pause();
                    botaoplay14.setBackgroundResource(R.drawable.play);

                }else{
                    mp14.start();
                    botaoplay14.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp15.isPlaying()){
                    mp15.pause();
                    botaoplay15.setBackgroundResource(R.drawable.play);

                }else{
                    mp15.start();
                    botaoplay15.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp16.isPlaying()){
                    mp16.pause();
                    botaoplay16.setBackgroundResource(R.drawable.play);

                }else{
                    mp16.start();
                    botaoplay16.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp17.isPlaying()){
                    mp17.pause();
                    botaoplay17.setBackgroundResource(R.drawable.play);

                }else{
                    mp17.start();
                    botaoplay17.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp18.isPlaying()){
                    mp18.pause();
                    botaoplay18.setBackgroundResource(R.drawable.play);

                }else{
                    mp18.start();
                    botaoplay18.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp19.isPlaying()){
                    mp19.pause();
                    botaoplay19.setBackgroundResource(R.drawable.play);

                }else{
                    mp19.start();
                    botaoplay19.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        botaoplay20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp20.isPlaying()){
                    mp20.pause();
                    botaoplay20.setBackgroundResource(R.drawable.play);

                }else{
                    mp20.start();
                    botaoplay20.setBackgroundResource(R.drawable.pause);
                }
            }
        });



        return vista;

    }

}
