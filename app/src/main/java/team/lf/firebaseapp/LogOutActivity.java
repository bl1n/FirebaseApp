package team.lf.firebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class LogOutActivity extends AppCompatActivity {

    private TextView mUserNameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);


        mUserNameTV = findViewById(R.id.userName);

        String userName = getIntent().getExtras().getString("userName");
        if(userName!=null) mUserNameTV.setText(userName);


    }

    @Override
    public void onBackPressed() {
        logout();
        super.onBackPressed();
    }

    private void logout(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("state", 1);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        logout();
        return super.onOptionsItemSelected(item);
    }
}
