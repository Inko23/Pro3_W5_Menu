package hcu.info.cne.pro3_w5_menu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    CheckBox ck1;
    CheckBox ck2;
    TextView tv1;
    Button bt1;

    int flaga = 0;
    int flagb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.textView1);

        ck1 = findViewById(R.id.checkBox1);
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tv1.setText("ピザを注文");
                    flaga = 1;
                } else {
                    tv1.setText("ピザは取りやめ");
                    flaga = 0;
                }
            }
        });
        ck2 = findViewById(R.id.checkBox2);
        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged (CompoundButton buttonView,boolean isChecked){
              if (isChecked) {
                  tv1.setText("コーラを注文");
                    flagb = 1;
                } else {
                  tv1.setText("コーラは取りやめ");
                    flagb = 0;
                }
            }
        }) ;

        bt1 = findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (flaga == 1 || flagb ==1) {
                    tv1.setText("注文ありがとうございます");
                }else if(flaga == 0 || flagb == 0){
                    tv1.setText(" ");
                }
            }
        });
    }
}
