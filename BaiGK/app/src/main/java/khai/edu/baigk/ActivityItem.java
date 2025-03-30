package khai.edu.baigk;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityItem extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item);
        tv = findViewById(R.id.tv);
        //nhan du lieu tu intent
        String receivedData = getIntent().getStringExtra("Bạn chọn ");
        //hien thi noi dung
        tv.setText(receivedData);
    }
}