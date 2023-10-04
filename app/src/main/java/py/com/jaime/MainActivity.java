package py.com.jaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName,etApellido,etEmail,etNumeroTel;
    Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etApellido = findViewById(R.id.etApellido);
        etEmail = findViewById(R.id.etEmail);
        etNumeroTel = findViewById(R.id.etNumeroTel);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = etName.getText().toString();
                String Apellido = etApellido.getText().toString();
                String Email = etEmail.getText().toString();
                int NumeroTel = Integer.parseInt(etNumeroTel.getText().toString());

                User user = new User(Name,Apellido,Email,NumeroTel);

                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("user",user);
                startActivity(intent);
            }
        });


    }
}