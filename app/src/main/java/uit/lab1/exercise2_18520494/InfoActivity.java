package uit.lab1.exercise2_18520494;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    TextView txtName, txtEmail, txtProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtProject = findViewById(R.id.txtProject);

    }
    public void onClick(View v){
        Intent iGetContactInfo = new Intent(getApplicationContext(), ViewContactInfoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("nameKey", txtName.getText().toString());
        bundle.putString("emailKey", txtEmail.getText().toString());
        bundle.putString("projectKey", txtProject.getText().toString());
        iGetContactInfo.putExtras(bundle);

        startActivity(iGetContactInfo);
    }

}
