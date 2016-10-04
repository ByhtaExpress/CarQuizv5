package com.example.euphoria.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.Random;

public class page_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);

        Button button_correct2 = (Button) findViewById(R.id.button_correct2);
        button_correct2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
                Intent intent = getIntent();
                int get_prev_page = intent.getIntExtra("Last activity", 3);  //pra6tame int na sledva6tata stranica s ID

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
                    case 2:
                        Intent intent3 = new Intent(getApplicationContext(), page_2.class); // pra6tame 2 na page 2, za da znam 4e e polzvana 1ca za da ne se polzva pak
                        intent3.putExtra("Last activity", 2); //pra6tame int na sledva6tata stranica s ID
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
        Button but8 = (Button) findViewById(R.id.but8);
        but8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_3.this, page_3.class));

            }
        });
        Button but9 = (Button) findViewById(R.id.but9);
        but9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_3.this, page_3.class));

            }
        });
        Button but10 = (Button) findViewById(R.id.but10);
        but10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_3.this, page_3.class));

            }
        });
    }
}