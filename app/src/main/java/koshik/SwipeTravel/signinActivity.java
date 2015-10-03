package koshik.SwipeTravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import koshik.travelove.R;

public class signinActivity extends AppCompatActivity implements View.OnClickListener {

    Button btLogIn;
    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_screen);
        btLogIn = (Button) findViewById(R.id.btnSingIn);
        etEmail = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPass);
        btLogIn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSingIn:
                startActivity(new Intent(this, SwapTab.class));
                break;
        }

    }
}
