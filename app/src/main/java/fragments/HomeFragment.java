package fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lesson36.R;
import com.example.lesson36.databinding.FragmentHomeBinding;
import java.util.ArrayList;
import adapter.Adapter;
import model.ModelInsta;


public class HomeFragment extends Fragment {


   private FragmentHomeBinding binding;
   private ArrayList<ModelInsta> list = new ArrayList<>();
   private Adapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addRecycler();
        initRecycler();
    }

    private void initRecycler() {
        Log.d("ololo", "initRecycler: " + list);
        adapter = new Adapter();
        binding.recyclerView.setAdapter(adapter);
        adapter.updateData(list);



    }

    private void addRecycler(){
        Log.d("ololo", "addRecycler: " + list.size());
        list.add(new ModelInsta(R.drawable.img,"joshua_l The game in Japan was amazing","September 19"));
        list.add(new ModelInsta(R.drawable.img_4,"joshua_l I want to share some photos","November 23"));
        list.add(new ModelInsta(R.drawable.img,"joshua_l The game in Japan was amazing and I want to share some photos","December 5"));
        list.add(new ModelInsta(R.drawable.img_5,"joshua_l Amazing","November 22"));
        list.add(new ModelInsta(R.drawable.img_4,"joshua_l The game in Japan was amazing and I want to share some photos","October 4"));
        list.add(new ModelInsta(R.drawable.img,"joshua_l The game in Japan was amazing and I want to share some photos","July 13"));
        list.add(new ModelInsta(R.drawable.img_5,"joshua_l The game in Japan was amazing and I want to share some photos","June 30"));

    }
}