package sg.edu.rp.c346.id20029443.demodatapassingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        tvAnswer = findViewById(R.id.textView);

        Intent intent = getIntent();
        int value = intent.getIntExtra("value",-1);
        char charValue = intent.getCharExtra("valueChar",'z');
        double doubleValue = intent.getDoubleExtra("valueDouble", 1.00);

        tvAnswer.setText("Integer value recieved: " + value + "\n" + "Character Value Recieved: " + charValue + "\n" + "Double Value Recieved: " + doubleValue);

    }
}