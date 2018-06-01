package com.rse.pagerrecycler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RSE_VZLA_07 on 1/6/2018.
 */

public class FragmentContact extends Fragment {

    private RecyclerView recyclerView;
    private List<Contact> contacts;

    public FragmentContact() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_fragment, container, false);
        recyclerView = view.findViewById(R.id.contact_rv);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), contacts);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contacts = new ArrayList<>();
        contacts.add(new Contact("Aaron Jones", "(111) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
        contacts.add(new Contact("Amela Kendrick", "(216) 2588525", R.drawable.ic_star_black_24dp));
    }
}
