package itcr.ac.cr.seguridad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.FacebookSdk;


public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final Button Bsingup = (Button) findViewById(R.id.Bsingup);
        FacebookSdk.sdkInitialize(getApplicationContext());
    }

    public void onButtonClick(View v) {  //botón para registrarse
        if (v.getId() == R.id.Bsingup) {
            Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(i);

            Toast temp= Toast.makeText(RegisterActivity.this , "Registered successfully!" , Toast.LENGTH_SHORT);
            temp.show();
        }
    }
}
