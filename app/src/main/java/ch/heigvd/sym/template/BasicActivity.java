package ch.heigvd.sym.template;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

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

        Button button = (Button)findViewById(R.id.buttLogout);
        button.setText(R.string.logout);
        button.setOnClickListener(event -> click());

    }

    @Override
    public void onBackPressed() {
        getIntent().putExtra("ResultValue", "0");
        setResult(Activity.RESULT_CANCELED, getIntent());
        finish();
    }

    private void click(){
        getIntent().putExtra("ResultValue", "1");
        setResult(Activity.RESULT_OK, getIntent());
        finish();
    }

}
