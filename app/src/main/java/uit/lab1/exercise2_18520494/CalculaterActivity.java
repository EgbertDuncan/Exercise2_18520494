package uit.lab1.exercise2_18520494;


import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class CalculaterActivity extends AppCompatActivity {

//    View.OnClickListener buttonListener;
    EditText EditTextNumber, EditTextKQ;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btPlus, btSub, btMult, btDivi, btDelete, btResult, btPoint ;
    private final char cong = '+';
    private final char tru = '-';
    private final char nhan = '*';
    private final char chia = '/';
    private final char bang = '0';
    private double gtri1 = Double.NaN;
    private double gtri2 = Double.NaN;
    private char thucthi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);

        bt0 = findViewById(R.id.btn0);
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);
        btPlus = findViewById(R.id.btnPlus);
        btSub = findViewById(R.id.btnSub);
        btMult = findViewById(R.id.btnMult);
        btDivi = findViewById(R.id.btnDivi);
        btDelete = findViewById(R.id.btnDelete);
        btPoint = findViewById(R.id.btnPoint);
        btResult = findViewById(R.id.btnBang);
        EditTextNumber = findViewById(R.id.EditTextNumber);
        EditTextKQ= findViewById(R.id.EditTextKQ);

        bt0.setOnClickListener(buttonListener);
        bt1.setOnClickListener(buttonListener);
        bt2.setOnClickListener(buttonListener);
        bt3.setOnClickListener(buttonListener);
        bt4.setOnClickListener(buttonListener);
        bt5.setOnClickListener(buttonListener);
        bt6.setOnClickListener(buttonListener);
        bt7.setOnClickListener(buttonListener);
        bt8.setOnClickListener(buttonListener);
        bt9.setOnClickListener(buttonListener);
        btPlus.setOnClickListener(buttonListener);
        btSub.setOnClickListener(buttonListener);
        btMult.setOnClickListener(buttonListener);
        btDivi.setOnClickListener(buttonListener);
        btResult.setOnClickListener(buttonListener);
        btDelete.setOnClickListener(buttonListener);


//
    }
    private final View.OnClickListener buttonListener = new View.OnClickListener() {
        @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
        public void onClick(View v) {
                Button bt = (Button) v;
                switch (bt.getId()) {
                    case R.id.btn0:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "0");
                        break;
                    case R.id.btn1:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "1");
                        break;
                    case R.id.btn2:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "2");
                        break;
                    case R.id.btn3:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "3");
                        break;
                    case R.id.btn4:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "4");
                        break;
                    case R.id.btn5:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "5");
                        break;
                    case R.id.btn6:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "6");
                        break;
                    case R.id.btn7:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "7");
                        break;
                    case R.id.btn8:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "8");
                        break;
                    case R.id.btn9:
                        EditTextNumber.setText(EditTextNumber.getText().toString() + "9");
                        break;
                    case R.id.btnPlus:
                        tinhtoan();
                        thucthi = cong;
                        EditTextKQ.setText(String.valueOf(gtri1) + "+");
                        EditTextNumber.setText(null);
                        break;
                    case R.id.btnSub:
                        tinhtoan();
                        thucthi = tru;
                        EditTextKQ.setText(String.valueOf(gtri1) + "-");
                        EditTextNumber.setText(null);
                        break;
                    case R.id.btnMult:
                        tinhtoan();
                        thucthi = nhan;
                        EditTextKQ.setText(String.valueOf(gtri1) + "*");
                        EditTextNumber.setText(null);
                        break;
                    case R.id.btnDivi:
                        tinhtoan();
                        thucthi = chia;
                        EditTextKQ.setText(String.valueOf(gtri1) + "/");
                        EditTextNumber.setText(null);
                        break;
                    case R.id.btnBang:
                        tinhtoan();
                        thucthi = bang;
                        EditTextNumber.setText(EditTextNumber.getText().toString() + String.valueOf(gtri2) + "=" + String.valueOf(gtri1));
                        EditTextKQ.setText(null);
                        break;
                    case R.id.btnDelete:
                        if(EditTextNumber.getText().length()>0){
                            CharSequence name = EditTextNumber.getText().toString();
                            EditTextNumber.setText(name.subSequence(0,name.length()-1));

                        }else{
                            gtri1 = Double.NaN;
                            gtri2 = Double.NaN;
                            EditTextNumber.setText(null);
                            EditTextKQ.setText(null);
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + bt.getId());
                }

        }
    };

    public void tinhtoan()
    {
        if(!Double.isNaN(gtri1)){
            gtri2 =  Double.parseDouble(EditTextNumber.getText().toString());
            switch (thucthi){
                case cong:
                    gtri1 = gtri1 + gtri2;
                    break;
                case tru:
                    gtri1 = gtri1 - gtri2;
                    break;
                case nhan:
                    gtri1 = gtri1 * gtri2;
                    break;
                case chia:
                    gtri1 = gtri1 / gtri2;
                    break;
                case bang:
                    break;

            }

        }else{
            gtri1 = Double.parseDouble(EditTextNumber.getText().toString());
        }
    }

}
