package projects.riabhat.com.codeshalaadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class LoginAct extends AppCompatActivity {
    TextView TV;
    EditText name, pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TV=(TextView)findViewById(R.id.tv);
        name=(EditText)findViewById(R.id.et1);
        pass=(EditText)findViewById(R.id.et2);
        login=(Button)findViewById(R.id.bt);
        //if already signed in
        if (FirebaseAuth.getInstance().getCurrentUser() != null)
            startActivity(new Intent(LoginAct.this, MainActivity.class));
        //login code
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname,password;
                uname=name.getText().toString().trim();
                password=pass.getText().toString().trim();
                //Toast.makeText(LoginAct.this, "User pass- "+uname+" "+password, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
