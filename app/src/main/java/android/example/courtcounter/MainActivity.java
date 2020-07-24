package android.example.courtcounter;


import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scorea,scoreb;
    public void pointa_one(View view){
        scorea=scorea+3;
        displaya(scorea);
    }
    public void pointb_one(View view){
        scoreb=scoreb+3;
        displayb(scoreb);
    }
    public void pointa_two(View view){
        scorea=scorea+2;
        displaya(scorea);
    }
    public void pointb_two(View view){
        scoreb=scoreb+2;
        displayb(scoreb);
    }
    public void freea(View view){
        scorea=scorea+1;
        displaya(scorea);
    }
    public void freeb(View view){
        scoreb=scoreb+1;
        displayb(scoreb);
    }
    public void finish(View view){
        if(scorea>scoreb){
            String message="hurrah!!! Team A has won the game by " + (scorea-scoreb) + " points";
            displayMessage(message);
        }
        else{
            String message="hurrah!!! Team B has won the game by " + (scoreb-scorea) + " points";
            displayMessage(message);
        }
    }
    private void displaya(int number){
        TextView teama_text_view=(TextView) findViewById(R.id.teama_text_view);
        teama_text_view.setText(""+number);
    }
    private void displayb(int number) {
        TextView t = (TextView) findViewById(R.id.teamb_text_view);
        t.setText("" + number);
    }
        private void displayMessage(String message){
        TextView r=(TextView) findViewById(R.id.result_text_view);
        r.setText(message);
        }
}
