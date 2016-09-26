package ch.heigvd.sym.template;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        Bundle extras = getIntent().getExtras();

        TextView text_email = (TextView)findViewById(R.id.textEmail);
        text_email.setText("Login: " + extras.getString("emailEntered"));

        TextView text_pass = (TextView)findViewById(R.id.textPass);
        text_pass.setText("Password: " + extras.getString("passwordGiven"));

        Button button = (Button)findViewById(R.id.buttOk);
        button.setText(R.string.app_name);
        button.setOnClickListener(event -> click());

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(BasicActivity.this, getResources().getString(R.string.logout), Toast.LENGTH_LONG).show();
        finish();
    }

    private void click(){
        Toast.makeText(BasicActivity.this, getResources().getString(R.string.app_name), Toast.LENGTH_LONG).show();
    }

}
