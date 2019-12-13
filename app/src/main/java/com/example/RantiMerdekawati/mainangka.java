package com.example.RantiMerdekawati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class mainangka extends AppCompatActivity {

    ListView listView;
    String mTittle[] = {"Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan"};
    int image[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eigth, R.drawable.nine};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainangka);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTittle, image);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTittle[];
        int rImgs[];

        MyAdapter (Context c, String tittle[], int imgs[]) {
            super(c, R.layout.list_item, R.id.textView1, tittle);
            this.context = c;
            this.rTittle = tittle;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @NonNull  View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View list_item = layoutInflater.inflate(R.layout.list_item, parent, false);
            ImageView images = list_item.findViewById(R.id.image);
            TextView myTittle = list_item.findViewById(R.id.textView1);

            images.setImageResource(rImgs[position]);
            myTittle.setText(rTittle[position]);

            return list_item;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
