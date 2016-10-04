package com.example.euphoria.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button new_game = (Button) findViewById(R.id.new_game);
            final int randomPage = (int) ((Math.random() * 4) + 1); //gen ot 1 do 4
            Log.i("PAGE", "Generated: " + randomPage); //kakvo 4islo sme generirali

            new_game.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    switch (randomPage) {
                        case 1:
                            Intent intent = new Intent(getApplicationContext(), page_1.class); // pra6tame 1 na page 1, za da znam 4e e polzvana 1ca za da ne se polzva pak
                            intent.putExtra("Last activity", 1); //pra6tame int na sledva6tata stranica s ID
                            startActivity(intent);
                            break;
                        case 2:
                            Intent intent2 = new Intent(getApplicationContext(), page_2.class); // pra6tame 2 na page 2, za da znam 4e e polzvana 1ca za da ne se polzva pak
                            intent2.putExtra("Last activity", 2); //pra6tame int na sledva6tata stranica s ID
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
        Button button_exit = (Button) findViewById(R.id.button_exit);
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               finish();
                System.exit(0);
            }
        });


            }
}