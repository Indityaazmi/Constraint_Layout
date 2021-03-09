package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan passoword
    String nama,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email keddalam variabel nama
                nama= edemail.getText().toString();
                password = edpassword.getText().toString();

                if (nama.equals("inditya@gmail.com") && password.equals("123456")){
                    //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                    Toast t = Toast.makeText(getApplicationContext(),
                            "login sukses",Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();

                } else if (!nama.equals("inditya@gmail.com") && password.equals("123456")){
                    //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email salah",Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();

                } else if (nama.equals("inditya@gmail.com") && !password.equals("123456")){
                    //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                    Toast t = Toast.makeText(getApplicationContext(),
                            "password salah",Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                } else if (!nama.equals("inditya@gmail.com") && !password.equals("567")){
                    //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email dan password salah",Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();

                }




            }
        });




    }
}