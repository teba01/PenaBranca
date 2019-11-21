package com.example.penabranca;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Bundle;

import com.example.penabranca.com.example.consulente.NavigacaoCActivity;

public class MainActivity extends AppCompatActivity {
//alguma coisa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();
            }
        }, 2000);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                MainActivity.this, NavigacaoCActivity.class
        );
        startActivity(intent);
        finish();
    }

}
