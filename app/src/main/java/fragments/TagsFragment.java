package fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson36.R;
import com.example.lesson36.databinding.FragmentGridBinding;
import com.example.lesson36.databinding.FragmentTagsBinding;

import java.util.ArrayList;

import adapter.RecyclerViewAdapter;
import adapter.TabsRecyclerAdapter;

public class TagsFragment extends Fragment {

    FragmentTagsBinding binding;
    private TabsRecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Integer> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTagsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
        initRecycler();
    }

    private void initRecycler() {
        recyclerView = binding.recyclerViewTags;
        adapter = new TabsRecyclerAdapter();
        adapter.updateData(list);
        recyclerView.setAdapter(adapter);
        binding.recyclerViewTags.setLayoutManager( new GridLayoutManager(requireContext(),3));

    }

    private ArrayList<Integer> setData() {
        list = new ArrayList<>();
        list.add(R.drawable.img);
        list.add(R.drawable.img_5);
        list.add(R.drawable.img_4);
        list.add(R.drawable.img_5);
        list.add(R.drawable.img_4);
        list.add(R.drawable.img);
        list.add(R.drawable.img_4);
        list.add(R.drawable.img);
        list.add(R.drawable.img_5);
        return list;
    }
}