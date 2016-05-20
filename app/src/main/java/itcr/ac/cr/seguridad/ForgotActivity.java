package itcr.ac.cr.seguridad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        final Button bSend = (Button) findViewById(R.id.bSend);
    }

    public void onButtonClick(View v) {  //botón para registro
        if (v.getId() == R.id.bSend) {
            Intent i = new Intent(ForgotActivity.this, LoginActivity.class);
            startActivity(i);

            Toast temp= Toast.makeText(ForgotActivity.this , "Check Your Email!" , Toast.LENGTH_SHORT);
            temp.show();
        }
    }
}
