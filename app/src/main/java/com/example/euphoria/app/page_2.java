package com.example.euphoria.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class page_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);

        Button button_correct1 = (Button) findViewById(R.id.button_correct1);
        button_correct1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                int get_prev_page = intent.getIntExtra("Last activity", 2);  //pra6tame int na sledva6tata stranica s ID

                int randomPage = (int) ((Math.random() * 4) + 1); //gen ot 1 do 4

                while(randomPage == get_prev_page){
                    randomPage = (int)((Math.random() * 4) + 1);
                }    //generira razli4no chislo ot nastoqshtiq page
                v.setBackgroundColor(Color.GREEN);
                switch (randomPage) {
                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), page_1.class); // pra6tame 1 na page 1, za da znam 4e e polzvana 1ca za da ne se polzva pak
                        intent2.putExtra("Last activity", 1); //pra6tame int na sledva6tata stranica s ID
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), page_3.class); // pra6tame 3 na page 3, za da znam 4e e polzvana 1ca za da ne se polzva pak
                        intent3.putExtra("Last activity", 3); //pra6tame int na sledva6tata stranica s ID
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), page_4.class); // pra6tame 4 na page 4, za da znam 4e e polzvana 1ca za da ne se polzva pak
                        intent4.putExtra("Last activity", 4); //pra6tame int na sledva6tata stranica s ID
                        startActivity(intent4);
                        break;
                }

            }
        });
        Button but5 = (Button) findViewById(R.id.but5);
        but5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_2.this, page_2.class));

            }
        });
        Button but6 = (Button) findViewById(R.id.but6);
        but6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_2.this, page_2.class));

            }
        });
        Button but7 = (Button) findViewById(R.id.but7);
        but7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_2.this, page_2.class));

            }
        });
    }
}