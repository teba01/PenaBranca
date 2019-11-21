package com.example.penabranca.com.example.filhos;


import android.content.Intent;
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
import com.example.penabranca.com.example.consulente.NavigacaoCActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CadastroFragment extends Fragment {

    EditText nome, senha, email, telefone;
    Button botaocadastrar,botaovoltar;
    Switch swtAdm;
    View vista;
    FirebaseDatabase database;
    DatabaseReference ref;
    private FirebaseAuth mFirebaseAuth;
    private Usuario usuario;
    private Admnistrador admnistrador;

    public CadastroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cadastro, container, false);

        botaovoltar = vista.findViewById(R.id.botaovoltar);
        botaocadastrar = vista.findViewById(R.id.botaocadastrar);
        nome = vista.findViewById(R.id.nome);
        senha = vista.findViewById(R.id.senha);
        email = vista.findViewById(R.id.email);
        telefone = vista.findViewById(R.id.telefone);
        swtAdm = vista.findViewById(R.id.swtAdm);
        mFirebaseAuth = FirebaseAuth.getInstance();

        usuario = new Usuario();
        database = FirebaseDatabase.getInstance();
        ref = database.getReference().child("Usuario");

//
        //botaocadastrar.setOnClickListener(new View.OnClickListener() {
            //@Override
           // public void onClick(View v) {
               // mFirebaseAuth.createUserWithEmailAndPassword(email.getText().toString(), senha.getText().toString())
                      //  .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                      //      @Override
        // public void onComplete(@NonNull Task<AuthResult> task) {
        //    if (task.isSuccessful()) {
        //  Toast.makeText(getActivity(), "Salvo", Toast.LENGTH_SHORT).show();
        // } else {
        //  Toast.makeText(getActivity(), "Erro", Toast.LENGTH_SHORT).show();

        // }
        //  }
        //  });

        // }



        // });

        botaocadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario.setNome(nome.getText().toString());
                usuario.setSenha(senha.getText().toString());
                usuario.setTelefone(telefone.getText().toString());
                usuario.setEmail(email.getText().toString());



                ref.child(usuario.getNome()).setValue(usuario);


    }



});


     botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity().getApplication(), NavigacaoCActivity.class);
                startActivity(intent);
            }
     });

        return vista;
    }

}
