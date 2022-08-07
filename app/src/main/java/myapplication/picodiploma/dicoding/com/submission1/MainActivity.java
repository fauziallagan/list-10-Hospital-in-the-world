package myapplication.picodiploma.dicoding.com.submission1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

import static myapplication.picodiploma.dicoding.com.submission1.R.id.action_about;
import static myapplication.picodiploma.dicoding.com.submission1.R.id.list_item;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHospital;
    private ArrayList<Hospital> list = new ArrayList<>();
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHospital = findViewById(R.id.rv_hospital);

        rvHospital.setHasFixedSize(true);

        list.addAll(HospitalData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHospital.setLayoutManager(new LinearLayoutManager(this));
        ListHospitalAdapter listHospitalAdapter = new ListHospitalAdapter(list);
        rvHospital.setAdapter(listHospitalAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }


    public void setMode(int selectedMode){
        Intent myintent = new Intent(MainActivity.this,About.class);
        startActivity(myintent);
    }

}



