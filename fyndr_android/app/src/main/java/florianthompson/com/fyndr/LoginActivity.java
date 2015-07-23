package florianthompson.com.fyndr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @InjectView(R.id.btnSignIn) Button mBtnSignIn;
    @InjectView(R.id.textSignUp) TextView mSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);

        // hide ActionBar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }

    @OnClick(R.id.btnSignIn)
    public void signIn(){
        finish();
    }

    @OnClick(R.id.textSignUp)
    public void StartSignUp(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
