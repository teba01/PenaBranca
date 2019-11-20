package com.example.penabranca.com.example.filhos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import com.example.penabranca.R;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    public Button botaologin;
    public EditText usuario,senha;;
    private String email,password;

   private FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        usuario =(EditText) findViewById(R.id.usuario);
        senha =(EditText) findViewById(R.id.senha);
        Button botaologin = (Button) findViewById(R.id.botaologin);




        botaologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }

    private void login(final String email, String password) {
        mFirebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent i = new Intent(LoginActivity.this,FilhoActivity.class);
                            startActivity(i);

                            Toast.makeText(LoginActivity.this, "Bem Vindo",
                                    Toast.LENGTH_SHORT).show();




                        }else {
                            Toast.makeText(LoginActivity.this, "Usuario ou Senha incorreto",
                                    Toast.LENGTH_SHORT).show();


                        }


                    }
                });


    }
}
