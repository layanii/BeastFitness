package com.zephgv.mad.beastfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class YogaActivity extends AppCompatActivity {

    CardView cd1,cd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        cd1 = findViewById(R.id.virkshasana);
        cd2 = findViewById(R.id.cobrasana);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(YogaActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=Dic293YNJI8");
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(YogaActivity.this, "Opening Youtube!", Toast.LENGTH_SHORT).show();
                gotoUri("https://www.youtube.com/watch?v=fOdrW7nf9gw");
            }
        });



    }
    private void gotoUri(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}