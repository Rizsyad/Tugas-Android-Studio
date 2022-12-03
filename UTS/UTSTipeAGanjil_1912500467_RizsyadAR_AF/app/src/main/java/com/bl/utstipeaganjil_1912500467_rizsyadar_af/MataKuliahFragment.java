package com.bl.utstipeaganjil_1912500467_rizsyadar_af;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MataKuliahFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MataKuliahFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MataKuliahFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MataKuliahFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MataKuliahFragment newInstance(String param1, String param2) {
        MataKuliahFragment fragment = new MataKuliahFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mata_kuliah, container, false);

        Button moprog = view.findViewById(R.id.moprog);
        Button apsi = view.findViewById(R.id.apsi);
        Button aiti = view.findViewById(R.id.aiti);
        Button matbis = view.findViewById(R.id.matbis);
        Button inggris = view.findViewById(R.id.inggris);
        Button wbl = view.findViewById(R.id.wbl);
        Button pbo = view.findViewById(R.id.pbo);
        Button pbd = view.findViewById(R.id.pbd);
        Button vidat = view.findViewById(R.id.vidat);
        Button pemdat = view.findViewById(R.id.pemdat);
        Button bigdata = view.findViewById(R.id.bigdata);
        Button mppl = view.findViewById(R.id.mppl);
        Button pw1 = view.findViewById(R.id.pw1);
        Button pw2 = view.findViewById(R.id.pw2);
        Button algo = view.findViewById(R.id.algo);

        moprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        apsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        aiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        matbis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        inggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        wbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        pbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        pbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        vidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        pemdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        bigdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        mppl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        pw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        pw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NilaiActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }



}