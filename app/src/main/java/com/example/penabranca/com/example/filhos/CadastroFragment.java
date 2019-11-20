package com.example.penabranca.com.example.filhos;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.penabranca.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class CadastroFragment extends Fragment {

    EditText nome, senha, email, telefone;
    Button botaocadastrar;
    Switch swtAdm;
    View vista;
    private FirebaseAuth mFirebaseAuth;

    public CadastroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cadastro, container, false);

        botaocadastrar = vista.findViewById(R.id.botaoplay16);
        nome = vista.findViewById(R.id.nome);
        senha = vista.findViewById(R.id.senha);
        email = vista.findViewById(R.id.email);
        telefone = vista.findViewById(R.id.telefone);
        swtAdm = vista.findViewById(R.id.swtAdm);
        mFirebaseAuth = FirebaseAuth.getInstance();

        botaocadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseAuth.createUserWithEmailAndPassword(email.getText().toString(), senha.getText().toString())
                        .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(getActivity(),"Salvo",Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(getActivity(),"Erro",Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }



        });


        return vista;
    }


}
