package com.example.macstudent.thunder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnLogin;
    Button btnRegister;
    EditText edtUserName,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btnLogin  = (Button)findViewById(R.id.btn_login);
        btnRegister  = (Button)findViewById(R.id.btn_register);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        edtUserName = (EditText)findViewById(R.id.editText);
        edtPassword = (EditText)findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == btnLogin.getId())
        {
            String uname = edtUserName.getText().toString();
            String pwd = edtPassword.getText().toString();


            Toast.makeText(this,uname + " " +pwd ,Toast.LENGTH_LONG).show();
        }
        else if(view.getId() == btnRegister.getId())
        {
            Toast.makeText(this,"Register",Toast.LENGTH_LONG).show();
        }
    }
}
