package koshik.SwipeTravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import koshik.travelove.R;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etEmail,etUsername,etPassword;
    Button btPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etUsername= (EditText) findViewById(R.id.etUserName);
        etPassword= (EditText) findViewById(R.id.etPassword);
        btPassword= (Button) findViewById(R.id.btnSingIn);
    btPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSingIn:
                break;
        }

    }
}
