package id.ac.ub.restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class insertDT extends AppCompatActivity {
    EditText idbook,judul;
    TextInputEditText reo;
    Button insert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_dt);
        idbook = findViewById(R.id.id_buku);
        judul = findViewById(R.id.nama_buku);
        reo =findViewById(R.id.desc);
        insert = findViewById(R.id.insert_btn);

        insert.setOnClickListener(this);



    }
}