package com.example.studentportal;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
public class Viewpage extends FragmentStateAdapter{
    public Viewpage(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1){
            return new RegisterFragment();
        }
        return new LoginFragment();
    }
    @Override
    public int getItemCount() {
        return 2;
    }
}