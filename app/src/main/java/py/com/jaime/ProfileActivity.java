package py.com.jaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView tvName,tvApellido,tvEmail,tvNumeroTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = findViewById(R.id.tvName);
        tvApellido = findViewById(R.id.tvApellido);
        tvEmail = findViewById(R.id.tvEmail);
        tvNumeroTel = findViewById(R.id.tvNumeroTel);

        Intent intent = getIntent();

        User user = intent.getParcelableExtra("user");

        tvName.setText(user.getFirstname());
        tvApellido.setText(user.getApellido());
        tvEmail.setText(user.getEmail());
        tvNumeroTel.setText(String.valueOf(user.getNumeroTel()));

    }
}