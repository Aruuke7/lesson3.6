package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson36.databinding.RecyclerGridBinding;

import java.util.ArrayList;

import fragments.GridFragment;
import fragments.TagsFragment;

public class TabLayoutAdapter extends FragmentPagerAdapter {

    private Context context;
    private int tabCount;

    public TabLayoutAdapter(FragmentManager fragmentManager, int behavior) {
        super(fragmentManager);
        this.context = context;
        this.tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new GridFragment();
            case 1:
                return new TagsFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
