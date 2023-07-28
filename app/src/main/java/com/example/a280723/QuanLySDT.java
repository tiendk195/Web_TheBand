package com.example.a280723;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class QuanLySDT extends AppCompatActivity {
    Button btnThem,btnGD,btnTiep;
    ListView listViewSDT;
    ArrayList<String> listSDT;
    ArrayAdapter<String> adapter;
    EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_sdt);
        btnThem=findViewById(R.id.btnThem);
        btnGD=findViewById(R.id.btnGD);
        btnTiep=findViewById(R.id.btnTiep);
        listViewSDT=findViewById(R.id.listViewSDT);
        edtName=findViewById(R.id.edtName);
        listSDT=new ArrayList<>(Arrays.asList("0928767898","093475898","0979870355"));
        adapter=new ArrayAdapter<>(QuanLySDT.this, android.R.layout.simple_list_item_1,listSDT);
        listViewSDT.setAdapter(adapter);
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=edtName.getText().toString();
                listSDT.add(s);
                adapter.notifyDataSetChanged();
                edtName.setText("");
            }
        });
    }
}