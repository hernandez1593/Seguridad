package itcr.ac.cr.seguridad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity {

    //private TextView mTextDetails;

    private CallbackManager mCallbackManager;
    private FacebookCallback<LoginResult> mCallback=new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            AccessToken accessToken = loginResult.getAccessToken();
            Profile profile = Profile.getCurrentProfile();
            if(profile != null){
                //mTextDetails.setText("Welcome "+ profile.getName());
                Toast temp= Toast.makeText(LoginActivity.this , "Welcome! "+profile.getName(), Toast.LENGTH_LONG);
                temp.show();
            }
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);

        }

        @Override
        public void onCancel() {

        }

        @Override
        public void onError(FacebookException error) {
            Toast temp= Toast.makeText(LoginActivity.this ,"There was an error processing the login request", Toast.LENGTH_LONG);
            temp.show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
        mCallbackManager = CallbackManager.Factory.create();

        setContentView(R.layout.activity_login);
        final Button bSignIn = (Button) findViewById(R.id.bSignIn);
           //Intent para el forget que es un TextView
        final TextView forgotLink = (TextView) findViewById(R.id.textView1);

        forgotLink.setOnClickListener(new View.OnClickListener() {  //listener para el click en el textView forgot pass
            @Override
            public void onClick(View v) {
                Intent forgotIntent = new Intent(LoginActivity.this, ForgotActivity.class);
                LoginActivity.this.startActivity(forgotIntent);
            }
        });
    }

    public void onButtonClick(View v) {  //botón para registro
        if (v.getId() == R.id.bSignIn) {
            Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(i);

            Toast temp= Toast.makeText(LoginActivity.this , "Please fill the spaces" , Toast.LENGTH_SHORT);
            temp.show();
        }
    }

    public void onViewCreated(View view, Bundle saverInstanceState){
        //super.onViewCreated(view, saverInstanceState);
        LoginButton loginButton = (LoginButton) view.findViewById(R.id.login_button);

        loginButton.setReadPermissions("user_friends");
        //loginButton.setFragment(this);
        loginButton.registerCallback(mCallbackManager, mCallback);

    }


}
