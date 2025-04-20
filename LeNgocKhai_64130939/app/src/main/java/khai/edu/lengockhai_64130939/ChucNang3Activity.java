package khai.edu.lengockhai_64130939;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        ListView listView = findViewById(R.id.listView);

        String[] items = {
                "Lập trình C",
                "Lập trình Java",
                "Phát triển ứng dụng Web",
                "Khai phá dữ liệu lớn",
                "Internet vạn vật kết nối",
                "Quản lý hệ thống cơ sở dữ liệu",
                "Lập trình Android",
                "Phát triển ứng dụng iOS",
                "Machine Learning",
                "Trí tuệ nhân tạo",
                "..."
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        listView.setAdapter(adapter);
    }
}
