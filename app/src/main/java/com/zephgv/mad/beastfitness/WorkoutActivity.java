package com.zephgv.mad.beastfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class WorkoutActivity extends AppCompatActivity {

    CardView cd1,cd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cd1 = findViewById(R.id.pushcard);
        cd2 = findViewById(R.id.pullcard);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=IODxDxX7oi4");
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WorkoutActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=eGo4IYlbE5g");
            }
        });




    }
    private void gotoUri(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}