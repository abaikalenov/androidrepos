package jihc.kz.birinzhizhoba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button7, button8, button9, button0, button1, button2, button3, button4, button5, button6;
    Button btnC, btnPandM;
    TextView tvSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classwork4);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button9 = findViewById(R.id.button9);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        tvSan = findViewById(R.id.textsan);

        btnC = findViewById(R.id.C);
        btnPandM = findViewById(R.id.plusandmin);

        View.OnClickListener buttonsandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldingy = tvSan.getText().toString();
                String results = "";
                String results2 = "";

                switch (view.getId()) {
                    case R.id.button8:
                        results = "8";
                        break;

                    case R.id.button7:
                        results = "7";
                        break;

                    case R.id.button9:
                        results = "9";
                        break;

                    case R.id.btn6:
                        results = "6";
                        break;

                    case R.id.btn5:
                        results = "5";
                        break;

                    case R.id.btn4:
                        results = "4";
                        break;

                    case R.id.btn3:
                        results = "3";
                        break;

                    case R.id.btn2:
                        results = "2";
                        break;

                    case R.id.btn1:
                        results = "1";
                        break;

                    case R.id.btn0:
                        results = "0";
                        break;
                }
            if (!aldingy.equals("0")) results2 = aldingy + results;
            else results2 = results;
            tvSan.setText(results2);
            }
        };

        button7.setOnClickListener(buttonsandar);
        button8.setOnClickListener(buttonsandar);
        button0.setOnClickListener(buttonsandar);
        button1.setOnClickListener(buttonsandar);
        button2.setOnClickListener(buttonsandar);
        button3.setOnClickListener(buttonsandar);
        button4.setOnClickListener(buttonsandar);
        button5.setOnClickListener(buttonsandar);
        button6.setOnClickListener(buttonsandar);
        button9.setOnClickListener(buttonsandar);

        View.OnClickListener btnoshiruandPandM = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.C:
                        tvSan.setText("0");
                        break;
                    case R.id.plusandmin:
                        String sanText = tvSan.getText().toString();
                        int san = Integer.parseInt(sanText);

                        if (san > 0) tvSan.setText("-"+sanText);
                        else {
                            san = san * (-1);
                            tvSan.setText(""+san);}

                        break;
                }
            }
        };
        btnC.setOnClickListener(btnoshiruandPandM);
        btnPandM.setOnClickListener(btnoshiruandPandM);
    }
}