package com.example.nickolay.recyclerview;

import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private LinearLayoutManager horisontalLinearLayautManager;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.recycler);

        verticalLinearLayoutManager=new LinearLayoutManager(this);
        horisontalLinearLayautManager=new LinearLayoutManager(this);

        recyclerView.setLayoutManager(verticalLinearLayoutManager);
        
        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        adapter.addAll(ModelItem.getFakeItem());

    }
    private class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{
        private ArrayList<ModelItem> items=new ArrayList<>();
        public void addAll(List<ModelItem> fakeItems){
            int pos = getItemCount();
            this.items.addAll(fakeItems);
            notifyItemInserted(pos);
        }


        @NonNull
        @Override
        public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
            View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false);
            return new RecyclerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
            holder.bind(items.get(position));

            
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView image;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.title);
            image=(ImageView) itemView.findViewById(R.id.image);

        }


        public void bind(ModelItem modelItem) {
            image.setImageBitmap(BitmapFactory.decodeResource(itemView.getResources(), modelItem.getImgId()));
            title.setText(modelItem.getName());

        }
    }
}
