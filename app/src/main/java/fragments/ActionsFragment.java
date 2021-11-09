package fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson36.R;
import com.example.lesson36.databinding.FragmentActionsBinding;

import java.util.ArrayList;

import adapter.RecyclerViewAdapter;
import model.ModelInsta;


public class ActionsFragment extends Fragment {
    private FragmentActionsBinding binding;
    private ArrayList<ModelInsta> list = new ArrayList<>();
    private RecyclerViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentActionsBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
        initRecycler();
    }

    private void initRecycler() {
        adapter = new RecyclerViewAdapter();
        binding.recycler.setAdapter(adapter);
        adapter.updateData(list);
    }

    private void setData() {
        list.add(new ModelInsta(R.drawable.img_4,"karennne liked your photo.","1h",R.drawable.img_5));
        list.add(new ModelInsta(R.drawable.img_4,"karennne liked your photo.","1h",R.drawable.img));
        list.add(new ModelInsta(R.drawable.img_4,"karennne liked your photo.","1h",R.drawable.img_5));
        list.add(new ModelInsta(R.drawable.img_4,"karennne liked your photo.","1h",R.drawable.img));
    }
}