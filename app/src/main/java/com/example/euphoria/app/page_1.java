package com.example.euphoria.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class page_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);
        List<Integer> answers = new ArrayList<Integer>();   // Spisuk koito da sudurja pokazanite veche otgovori s cel randomizing

        int randomAnswer = (int) ((Math.random() * 4) + 1); // Generirame proizvolno chislo ot 1 do 4
        while (answers.size() < 4) {    // Pulnim spisuka s otgovori
            while (answers.contains(randomAnswer)) {    // Gledame da nqma povtarqshti se proizvolni chisla za da nqma povtarqshti se otgovori
                randomAnswer = (int) ((Math.random() * 4) + 1); // Ako segashnoto chislo se povtarq s nqkoe ot predishnite generirame novo
            }

            /**
             * Sled kato chisloto ne figurira v spisuka v zavisimost ot stoinostta mu suzdavame butona na ekrana
             * Nachina ne raboti zashtoto v xml e hard code-nat layouta i ne moje da se promeni ot koda bez da se promeni cqloto prilojenie
             * V momenta se generirat butoni na proizvolen princip no nachina po koito se pokazvat e edin i susht
             */

            if (randomAnswer == 1) {
                Button but2 = (Button) findViewById(R.id.but2);
                but2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ClickHandler(v);
                    }
                });
            }
            if (randomAnswer == 2) {
                Button but3 = (Button) findViewById(R.id.but3);
                but3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ClickHandler(v);
                    }
                });
            }
            if (randomAnswer == 3) {
                Button but4 = (Button) findViewById(R.id.but4);
                but4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ClickHandler(v);
                    }
                });
            }

            /**
             * Sled suzdavane na greshnite vuzmojni butoni suzdavame i pravilniqt
             */
            if (randomAnswer == 4) {
                Button button_correct = (Button) findViewById(R.id.button_correct);
                button_correct.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent intent = getIntent();
                        int get_prev_page = intent.getIntExtra("Last activity", 1);  //vzimame ID na starata stranica

                        int randomPage = (int) ((Math.random() * 4) + 1); //gen ot 1 do 4, Math.random java func za generirane

                        while (randomPage == get_prev_page) {   // Gledame generiranoto chislo da ne suvpada s ID-to na predishanta stranica
                            randomPage = (int) ((Math.random() * 4) + 1);   // Generirame novo chislo dokato ne namerim nqkoe koeto ne e ravno na ID-to na starata stranica
                        }

                        v.setBackgroundColor(Color.GREEN);
                        switch (randomPage) {
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
            }
            answers.add(randomAnswer);
        }
    }

    /**
     * ClickHandler se izvikva vseki put kato se natisne greshen buton za da izbegnem vuzmojni povtoreniq v koda
     */
    protected void ClickHandler(View v) {
        v.setBackgroundColor(Color.RED);
        startActivity(new Intent(page_1.this, page_1.class));
    }

}
