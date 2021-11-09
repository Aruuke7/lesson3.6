package adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson36.R;
import com.example.lesson36.databinding.RecyclerGridBinding;

import java.util.ArrayList;

public class TabsRecyclerAdapter extends RecyclerView.Adapter<TabsRecyclerAdapter.ViewHolder> {
    private ArrayList<Integer> list = new ArrayList<>();

   public void updateData(ArrayList<Integer> list){
       this.list.clear();
       this.list.addAll(list);
       notifyDataSetChanged();
   }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(RecyclerGridBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       private RecyclerGridBinding binding;


        public ViewHolder(@NonNull RecyclerGridBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void onBind(Integer list) {
            binding.imGrid.setImageResource(list);
        }
    }
}
