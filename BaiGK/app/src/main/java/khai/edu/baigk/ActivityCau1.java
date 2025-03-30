package khai.edu.baigk;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityCau1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
    }
    //bo lang nghe va xu ly cong o day
    public void XuLyCong(View view){
        EditText editTextA = (EditText) findViewById(R.id.edtA);
        EditText editTextB = (EditText) findViewById(R.id.edtB);
        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);
        //lay du lieu
        String strA = editTextA.getText().toString();
        String strB = editTextB.getText().toString();
        //chuyen du lieu sang dang so
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        //Tinh tong
        int Tong = so_A + so_B;
        String strTong = String.valueOf(Tong);
        //hien thi ket qua ra man hinh
        editTextKQ.setText(strTong);
    }
