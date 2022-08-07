package myapplication.picodiploma.dicoding.com.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

public class detail extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String[] datas = (String[]) getIntent().getExtras().get("detailHospital");

        ImageView imgPhoto = findViewById(R.id.tv_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDetail = findViewById(R.id.tv_item_detail);
        ImageView tvLab = findViewById(R.id.tv_item_photo_lab);
        ImageView tvRoom = findViewById(R.id.tv_item_photo_room);
        ImageView tvIgd = findViewById(R.id.tv_item_photo_igd);


        tvName.setText(datas[0]);
        tvDetail.setText(datas[1]);

       Glide.with(this)
               .load(datas[2]).apply(new RequestOptions().override(820, 720)).dontAnimate().into(imgPhoto);
        Glide.with(this)
                .load(datas[3]).apply(new RequestOptions().override(820, 720)).dontAnimate().into(tvLab);
        Glide.with(this)
                .load(datas[4]).apply(new RequestOptions().override(820, 720)).dontAnimate().into(tvRoom);
        Glide.with(this)
                .load(datas[5]).apply(new RequestOptions().override(820, 720)).dontAnimate().into(tvIgd);

    }
}
