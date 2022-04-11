package uit.lab1.exercise2_18520494;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    EditText edtName, edtEmail, edtProject;
    Button btnContInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        edtName = findViewById(R.id.editTextName);
        edtEmail = findViewById(R.id.editTextEmail);
        edtProject = findViewById(R.id.editTextProject);

        btnContInfo = findViewById(R.id.btnContactInformation);

        btnContInfo.setOnClickListener(view -> {
            Intent iGetContactInfo = new Intent(InfoActivity.this, ViewContactInfoActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("nameKey", edtName.getText().toString());
            bundle.putString("emailKey", edtEmail.getText().toString());
            bundle.putString("projectKey", edtProject.getText().toString());
            iGetContactInfo.putExtras(bundle);

            startActivity(iGetContactInfo);
        });

    }



}
