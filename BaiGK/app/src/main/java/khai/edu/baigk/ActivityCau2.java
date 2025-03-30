package khai.edu.baigk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ActivityCau2 extends AppCompatActivity {
    ListView ListViewBH;
    ArrayList<String> dsBaiHat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ListViewBH = findViewById(R.id.dsBaiHat);
        dsBaiHat = new ArrayList<String>();
        dsBaiHat.add("Giây phút ban đầu");
        dsBaiHat.add("Hành lý trên tay");
        dsBaiHat.add("Điều anh biêt");
        dsBaiHat.add("Ngày em đẹp nhất");
        dsBaiHat.add("Sao cũng được");
        dsBaiHat.add("Ngày hôm ấy");
        dsBaiHat.add("Tay nắm tay rời");
        dsBaiHat.add("Trải qua");
        ArrayAdapter<String> AdapterBH = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,dsBaiHat
        );
        ListViewBH.setAdapter(AdapterBH);
        ListViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //lay noi dung item duoc chon
                String selecteditem = dsBaiHat.get(position);
                //chuyen sang item va chuyen du lieu
                Intent iItem = new Intent(ActivityCau2.this, ActivityItem.class);
                iItem.putExtra("Bạn chọn ", selecteditem);
                startActivity(iItem);
            }
        });
    }
}