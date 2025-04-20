package khai.edu.lengockhai_64130939;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2Activity extends AppCompatActivity {
    private EditText edtDiemQT, edtDiemGK, edtDiemCK;
    private TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);

        edtDiemQT = findViewById(R.id.edtDiemQT);
        edtDiemGK = findViewById(R.id.edtDiemGK);
        edtDiemCK = findViewById(R.id.edtDiemCK);
        txtKetQua = findViewById(R.id.txtKetQua);
        Button btnTinhDiem = findViewById(R.id.btnTinhDiem);

        btnTinhDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhDiemTrungBinh();
            }
        });
    }

    private void tinhDiemTrungBinh() {
        try {
            double diemQT = Double.parseDouble(edtDiemQT.getText().toString());
            double diemGK = Double.parseDouble(edtDiemGK.getText().toString());
            double diemCK = Double.parseDouble(edtDiemCK.getText().toString());

            double diemTB = (diemQT * 0.2) + (diemGK * 0.3) + (diemCK * 0.5);
            txtKetQua.setText("Điểm trung bình: " + diemTB);
        } catch (NumberFormatException e) {
            txtKetQua.setText("Vui lòng nhập điểm hợp lệ");
        }
    }
}
