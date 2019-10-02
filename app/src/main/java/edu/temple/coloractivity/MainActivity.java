package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout mylayout=findViewById(R.id.layout);

        final Spinner textSpinner = findViewById(R.id.spinner);
        final String[] colors =  {"Blue","Cyan", "Gray","Green","Magenta", "Red","Yellow", "Teal", "DarkGray","LightGray","Lime" };

        final ColorAdapter adapter = new ColorAdapter(this,colors,colors.length);

        textSpinner.setAdapter(adapter);

        textSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                view.setBackgroundColor(Color.WHITE);

                mylayout.setBackgroundColor(Color.parseColor(colors[i]));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
