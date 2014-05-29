package com.example.bufunfa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReceitasFragment extends Fragment {

	public ReceitasFragment() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		View rootView = inflater.inflate(R.layout.fragment_receitas, container, false);
		
		TextView textView = (TextView) rootView.findViewById(R.id.text_label);
		textView.setText("Hello World, Receitas!");
		
		return rootView; //alterar
	}

}
