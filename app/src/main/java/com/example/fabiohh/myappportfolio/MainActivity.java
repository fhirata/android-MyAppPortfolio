package com.example.fabiohh.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    public void sendPopularMoviesMessage(View view) {
        showToast(R.string.popular_movies);
    }

    public void sendStockHawkMessage(View view) {
        showToast(R.string.stock_hawk);
    }

    public void sendBuildItBiggerMessage(View view) {
        showToast(R.string.build_it_bigger);
    }

    public void sendAppMaterialMessage(View view) {
        showToast(R.string.app_material);
    }

    public void sendGoUbiquitousMessage(View view) {
        showToast(R.string.go_ubiquitous);
    }

    public void sendCapstoneMessage(View view) {
        showToast(R.string.capstone);
    }

    private void showToast(int resourceId) {
        Context context = getApplicationContext();
        CharSequence text = getResources().getText(resourceId);

        String sentence = String.format(partialSentence, text);
        Toast toast = Toast.makeText(context, sentence, toastDuration);
        toast.show();
    }
}