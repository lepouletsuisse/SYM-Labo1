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
        System.out.println("The activity is creating!");
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
    public void onStart(){
        super.onStart();
        System.out.println("The activity is starting!");
    }

    @Override
    public void onResume(){
        super.onResume();
        System.out.println("The activity is resuming!");
    }

    @Override
    public void onPause(){
        super.onPause();
        System.out.println("The activity is pausing!");
    }

    @Override
    public void onStop(){
        super.onStop();
        System.out.println("The activity is stoping!");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        System.out.println("The activity is destroying!");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        System.out.println("The activity is restarting!");
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
