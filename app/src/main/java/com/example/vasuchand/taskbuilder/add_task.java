package com.example.vasuchand.taskbuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class add_task extends AppCompatActivity {

    private EditText e1,e2;
    private Button b1;
    data dta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = e1.getText().toString();
                String b = e2.getText().toString();
                System.out.println(a + " "+  b);
                if(a !=null || !a.isEmpty()&& b!=null ||!b.isEmpty() )
                {
                    dta = new data(a,b);
                    MainActivity.movieList.add(dta);
                    MainActivity.mpter.notifyDataSetChanged();
                    Intent intent = new Intent(add_task.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

                    startActivity(intent);
                }
                else{
                    Toast.makeText(add_task.this,"Something Missiing",Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
