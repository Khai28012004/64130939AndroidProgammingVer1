package khai.edu.lengockhai_64130939;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChucNang2 = findViewById(R.id.btnChucNang2);
        Button btnChucNang3 = findViewById(R.id.btnChucNang3);
        Button btnChucNang4 = findViewById(R.id.btnChucNang4);
        Button btnAboutMe = findViewById(R.id.btnAboutMe);

        btnChucNang2.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ChucNang2Activity.class)));
        btnChucNang3.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ChucNang3Activity.class)));
        btnChucNang4.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ChucNang4Activity.class)));
        btnAboutMe.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, AboutMeActivity.class)));
    }
}
