package itcr.ac.cr.seguridad;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotActivity extends AppCompatActivity {
    private EditText cedula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        final Button bSend = (Button) findViewById(R.id.bSend);
        cedula =(EditText)findViewById(R.id.etCedula);
    }

    public void onButtonClick(View v) {  //botón para enviar email h
        Intent intent=null, chooser=null;
        if (v.getId() == R.id.bSend) {

            intent= new Intent(Intent.ACTION_SEND);
            //EditText email =(EditText)findViewById(R.id.etEmail);
            //System.out.println(email.getText().toString());
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{""});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto");
            intent.putExtra(Intent.EXTRA_TEXT, "PASSWORD MESSAGE HERE!");   //AQUÏ va la contraseña
            intent.setType("message/rfc822");

            try{
                startActivity(Intent.createChooser(intent, "Sending Email"));
            }catch(Exception e){
                e.printStackTrace();
            }


            Intent i = new Intent(ForgotActivity.this, LoginActivity.class);
            startActivity(i);
            Toast temp= Toast.makeText(ForgotActivity.this , "Check Your Email!" , Toast.LENGTH_LONG);
            temp.show();
        }
    }
}
