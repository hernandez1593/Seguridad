package itcr.ac.cr.seguridad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
}
