package adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson36.databinding.RecViewActionsBinding;

import java.util.ArrayList;

import model.ModelInsta;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    @NonNull
    private RecViewActionsBinding binding;
    private ArrayList<ModelInsta> list = new ArrayList<>();

    @SuppressLint("NotifyDataSetChanged")
    public void updateData(ArrayList<ModelInsta> list){
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecViewActionsBinding binding = RecViewActionsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new RecyclerViewAdapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(@NonNull RecViewActionsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(ModelInsta modelInsta) {
            binding.image.setImageResource(modelInsta.getImage());
            binding.tvLike.setText(modelInsta.getText());
            binding.time.setText(modelInsta.getDate());
            binding.imImage.setImageResource(modelInsta.getImage2());
        }
    }
}
