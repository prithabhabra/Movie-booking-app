package com.example.mybooking;

import java.util.ArrayList;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class movie extends ArrayAdapter<movieclass> {
	private final Activity context;
	movieclass m;
	View rowView;
	movie(Activity context,ArrayList<movieclass> objects){
		super(context, R.layout.layout1,objects);
		this.context=context;
		}
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if(view==null){
			LayoutInflater inflater = (LayoutInflater) context.getLayoutInflater();
			rowView= inflater.inflate(R.layout.layout1, parent, false);
		}
		else{
			rowView=view;
			Log.d("not null",Integer.toString(position));
		}
		TextView txtTitle = (TextView) rowView.findViewById(R.id.text1);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.image1);
		m=getItem(position);
		txtTitle.setText(m.name);
		imageView.setBackgroundResource(m.image);
		return rowView;
	}
}
