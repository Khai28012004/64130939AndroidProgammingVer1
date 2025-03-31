package khai.edu.baigk;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ActivityCau3 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FoodAdapter foodAdapter;
    private List<FoodItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        foodList = new ArrayList<>();
        foodList.add(new FoodItem("su kem", "Bánh su kem", R.drawable.img_3));
        foodList.add(new FoodItem("Sushi", "Món sushi Nhật Bản", R.drawable.img));
        foodList.add(new FoodItem("Hamburger", "Bánh mì kẹp thịt", R.drawable.img_1));
        foodList.add(new FoodItem("Phở", "Món phở truyền thống", R.drawable.img_2));

        foodAdapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(foodAdapter);
    }
}