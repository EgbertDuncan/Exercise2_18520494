package uit.lab1.exercise2_18520494;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewContactInfoActivity extends AppCompatActivity {
    TextView txtNameValue, txtEmailValue, txtProjectValue;
    Button btnFinish;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfo);

        txtNameValue = findViewById(R.id.txtNameInfoValue);
        txtEmailValue = findViewById(R.id.txtEmailInfoValue);
        txtProjectValue = findViewById(R.id.txtProjectInfoValue);

        btnFinish = findViewById(R.id.btnFinishh);
        btnFinish.setOnClickListener(mClickFinishListener);

        Intent mIntent = getIntent();
        String name = mIntent.getStringExtra("nameKey");
        String email = mIntent.getStringExtra("emailKey");
        String project = mIntent.getStringExtra("projectKey");

        txtNameValue.setText(name);
        txtEmailValue.setText(email);
        txtProjectValue.setText(project);
    }
    private View.OnClickListener mClickFinishListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };

}
