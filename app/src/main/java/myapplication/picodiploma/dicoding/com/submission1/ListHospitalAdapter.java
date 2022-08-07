package myapplication.picodiploma.dicoding.com.submission1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;
import java.util.List;

public class ListHospitalAdapter extends RecyclerView.Adapter<ListHospitalAdapter.ListViewHolder> {
    private ArrayList<Hospital> listhospital;
    public Context context;

    public ListHospitalAdapter(ArrayList<Hospital> list) {
        this.listhospital = list;
    }

    public void setListhospital(ArrayList<Hospital> listhospital){
        this.listhospital = listhospital;
    }
    ListHospitalAdapter(Context context){
        this.context = context;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View View = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hospital, viewGroup, false);
        return new ListViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Hospital hospital = listhospital.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hospital.getPhoto())
                .apply(new RequestOptions().override(520, 520))
                .into(holder.imgPhoto);

        holder.tvName.setText(hospital.getName());
        holder.tvDetail.setText(hospital.getDetail());



    }
    @Override
    public int getItemCount() {
        return listhospital.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        ImageView tv_item_room;
        ImageView tv_item_igd;
        ImageView tv_item_lab;
        TextView tvName, tvDetail, tvAbout;
        Button btndetail;

        public ListViewHolder(final View itemView) {
             super(itemView);

             imgPhoto =  (ImageView) itemView.findViewById(R.id.img_item_photo);
             tvName = itemView.findViewById(R.id.tv_item_name);
             tv_item_room = (ImageView)itemView.findViewById(R.id.tv_item_photo_room);
             tv_item_lab = (ImageView) itemView.findViewById(R.id.tv_item_photo_lab);
             tv_item_igd =(ImageView) itemView.findViewById(R.id.tv_item_photo_igd);
             tvAbout = itemView.findViewById(R.id.tv_item_about);
             tvDetail = itemView.findViewById(R.id.tv_item_detail);
             btndetail = itemView.findViewById(R.id.button);

             btndetail.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent i = new Intent(itemView.getContext(), detail.class);
                     i.putExtra("detailHospital",HospitalData.getHospital(getLayoutPosition()));
                     itemView.getContext().startActivity(i);
                 }
             });


        }
    }}