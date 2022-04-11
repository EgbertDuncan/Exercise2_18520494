package uit.lab1.exercise2_18520494;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class RadioActivity extends AppCompatActivity {

    RadioButton r_red, r_blue, r_gray, r_green;
    ImageView img;


    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radioactivity);

        r_red = findViewById(R.id.radio_red);
        r_blue = findViewById(R.id.radio_blue);
        r_green = findViewById(R.id.radio_green);
        r_gray = findViewById(R.id.radio_gray);

        img = findViewById(R.id.imgView);

        r_red.setOnClickListener((View view) -> img.setBackgroundResource(R.color.red));
        r_gray.setOnClickListener((View view) -> img.setBackgroundResource(R.color.gray));
        r_green.setOnClickListener((View view) -> img.setBackgroundResource(R.color.green));
        r_blue.setOnClickListener((View view) -> img.setBackgroundResource(R.color.blue));
    }
}
