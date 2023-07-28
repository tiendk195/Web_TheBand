package com.example.a280723;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.item_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.item1:
                Toast.makeText(this, "Chức năng này chưa được cập nhật", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                openQL();
                break;
            case R.id.item3:
                Toast.makeText(this, "Chức năng này chưa được cập nhật", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void openQL()
    {
        Intent intent=new Intent(MainActivity.this,QuanLySDT.class);
        startActivity(intent);
    }
}