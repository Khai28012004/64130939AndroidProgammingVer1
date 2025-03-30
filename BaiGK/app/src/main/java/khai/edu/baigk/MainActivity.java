package khai.edu.baigk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    void Timdieukien(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //tim dieu kien
        Timdieukien();
        //bo lang nghe
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu ly lenh o day
                Intent icau1 = new Intent(MainActivity.this, ActivityCau1.class);
                startActivity(icau1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu ly lenh o day
                Intent icau2 = new Intent(MainActivity.this, ActivityCau2.class);
                startActivity(icau2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu ly lenh o day
                Intent icau3 = new Intent(MainActivity.this, ActivityCau3.class);
                startActivity(icau3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu ly lenh o day
                Intent icau4 = new Intent(MainActivity.this, ActivityCau4.class);
                startActivity(icau4);
            }
        });
    }
}