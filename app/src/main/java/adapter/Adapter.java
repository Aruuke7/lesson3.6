package adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson36.databinding.RecycleViewHomeBinding;

import java.util.ArrayList;
import model.ModelInsta;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private RecycleViewHomeBinding binding;
    private ArrayList<ModelInsta> list = new ArrayList<>();

    @SuppressLint("NotifyDataSetChanged")
    public void updateData(ArrayList<ModelInsta> list){
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecycleViewHomeBinding binding = RecycleViewHomeBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
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


        public ViewHolder(@NonNull RecycleViewHomeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(ModelInsta modelInsta) {
            binding.ivHome.setImageResource(modelInsta.getImage());
            binding.textHome.setText(modelInsta.getText());
            binding.date.setText(modelInsta.getDate());
        }
    }
}
