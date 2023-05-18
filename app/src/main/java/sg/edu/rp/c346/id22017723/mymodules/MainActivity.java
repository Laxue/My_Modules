package sg.edu.rp.c346.id22017723.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView C346;
    TextView C203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.C346);
        C203 = findViewById(R.id.C203);

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Module.class);
                intent.putExtra("code","C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","E63A");
                startActivity(intent);
            }
        });

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Module.class);
                intent.putExtra("code","C203");
                intent.putExtra("name", "Web Appln Development in php");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W64P");
                startActivity(intent);
            }
        });
    }
}