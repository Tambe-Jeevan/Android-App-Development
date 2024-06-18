package com.example.tic_tac_toe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int flag = 0;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();
    }
    private void init(){
        b1 = findViewById(R.id.btnFirst);
        b2=findViewById(R.id.btnSecond);
        b3=findViewById(R.id.btnThird);
        b4=findViewById(R.id.btnFour);
        b5=findViewById(R.id.btnFive);
        b6=findViewById(R.id.btnSix);
        b7=findViewById(R.id.btnSeven);
        b8=findViewById(R.id.btnEight);
        b9=findViewById(R.id.btnNine);
    }
    public void check(View v){
        Button currentbtn = (Button) v;

        if(currentbtn.getText().toString().equals("")) {
            count++;

            if (flag == 0) {
                currentbtn.setText("X");
                flag = 1;
            } else {
                currentbtn.setText("O");
                flag = 0;
            }

            if (count > 4) {
                btn1 = b1.getText().toString();
                btn2 = b2.getText().toString();
                btn3 = b3.getText().toString();
                btn4 = b4.getText().toString();
                btn5 = b5.getText().toString();
                btn6 = b6.getText().toString();
                btn7 = b7.getText().toString();
                btn8 = b8.getText().toString();
                btn9 = b9.getText().toString();

                //conditions

                if (btn1.equals(btn2) && btn2.equals(btn3) && !btn1.equals("")) {
                    //1
                    Toast.makeText(this, "Winner Is: "+btn1, Toast.LENGTH_SHORT).show();
                    gameover();
                } else if (btn4.equals(btn5) && btn5.equals(btn6) && !btn4.equals("")) {
                    //2
                    Toast.makeText(this, "Winner Is: "+btn4, Toast.LENGTH_SHORT).show();
                    gameover();
                } else if (btn7.equals(btn8) && btn8.equals(btn9) && !btn7.equals("")) {
                    //3
                    Toast.makeText(this, "Winner Is: "+btn7, Toast.LENGTH_SHORT).show();
                    gameover();
                } else if (btn1.equals(btn4) && btn4.equals(btn7) && !btn1.equals("")) {
                    //4
                    Toast.makeText(this, "Winner Is: "+btn1, Toast.LENGTH_SHORT).show();
                    gameover();
                } else if (btn2.equals(btn5) && btn5.equals(btn8) && !btn2.equals("")) {
                    //5
                    Toast.makeText(this, "Winner Is: "+btn2, Toast.LENGTH_SHORT).show();
                    gameover();
                } else if (btn3.equals(btn6) && btn6.equals(btn9) && !btn3.equals("")) {
                    //6
                    Toast.makeText(this, "Winner Is: "+btn3, Toast.LENGTH_SHORT).show();
                    gameover();
                } else if (btn1.equals(btn5) && btn5.equals(btn9) && !btn1.equals("")) {
                    //7
                    Toast.makeText(this, "Winner Is: "+btn1, Toast.LENGTH_SHORT).show();
                    gameover();
                } else if (btn3.equals(btn5) && btn5.equals(btn7) && !btn3.equals("")) {
                    //8
                    Toast.makeText(this, "Winner Is: "+btn3, Toast.LENGTH_SHORT).show();
                    gameover();
                }
            }

        }

    }

    public void gameover(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        flag = 0;
        count = 0;
    }
}