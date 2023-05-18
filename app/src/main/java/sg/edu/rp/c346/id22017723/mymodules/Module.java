package sg.edu.rp.c346.id22017723.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Module extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        //Step 2
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        Integer year = intentReceived.getIntExtra("year",0);
        Integer semester = intentReceived.getIntExtra("semester",0);
        Integer credit = intentReceived.getIntExtra("credit",0);
        String venue = intentReceived.getStringExtra("venue");
        tvAnswer.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: " + year +
                "\nSemester: " + semester + "\nModule Credit: " + credit + "\nVenue: " + venue );


    }
}