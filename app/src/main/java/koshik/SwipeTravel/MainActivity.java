package koshik.SwipeTravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import koshik.travelove.R;


public class MainActivity extends AppCompatActivity {
    private Button signInBtn, signUpBtn;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signInBtn = (Button) findViewById(R.id.btnSingIn);
        signUpBtn = (Button) findViewById(R.id.btnSignUp);

    }


    public void signInMethod(View v) {
        Intent i;
        i = new Intent(this, signinActivity.class);
        startActivity(i);

    }

    public void signUpMethod(View v) {
        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);


    }
}