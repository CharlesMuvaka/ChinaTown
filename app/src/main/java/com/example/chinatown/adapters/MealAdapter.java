package com.example.chinatown.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chinatown.R;
import com.example.chinatown.models.MealItem;

import java.util.List;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.MyViewHolder> {
    private List<MealItem> allMeals;
    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setData(allMeals.get(position));

    }

    @Override
    public int getItemCount() {
        return allMeals.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemName, itemDescription;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemName  = itemView.findViewById(R.id.item_name);
            itemDescription = itemView.findViewById(R.id.description);
        }

        public void setData(MealItem item){
            itemName.setText(item.getStrCategory());
            itemDescription.setText(item.getStrInstructions());

//            Picasso.get().load(item.getStrMealThumb()).into(itemImage);
        }
    }
}
