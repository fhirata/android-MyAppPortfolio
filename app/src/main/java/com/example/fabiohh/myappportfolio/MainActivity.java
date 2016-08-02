package com.example.fabiohh.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int toastDuration = Toast.LENGTH_SHORT;
    String partialSentence = "This button will launch my %1s app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void showToast(View view) {
        Button button = (Button) view;
        String appName = button.getText().toString();

        Context context = getApplicationContext();
        String sentence = String.format(partialSentence, appName);

        Toast toast = Toast.makeText(context, sentence, toastDuration);
        toast.show();
    }
}