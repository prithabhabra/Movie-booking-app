package com.example.mybooking;



import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends ListActivity implements OnItemClickListener{
	 ArrayList<movieclass> ar;
	String[] text={"1","2","3"};
	String movietime[]={"10:00a.m. 2:00a.m.","3:00","3:00","3:00","3:00","3:00","3:00","3:00","3:00","3:00","3:00","3:00"};
	Integer[]  image={R.drawable.ic_launcher,R.drawable.x_yz,R.drawable.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       ar= new ArrayList<movieclass>();
        ar.add(new movieclass("Badrinath ki Dulhania",R.drawable.badri_nath));
        ar.add(new movieclass("BahuBali:The Conclusion",R.drawable.bahu_bali));
        ar.add(new movieclass("The Ghazi Attack",R.drawable.ghazi_attack));
        ar.add(new movieclass("Hindi Medium",R.drawable.hindi_med));
        ar.add(new movieclass("Jab Harry Met Sejal",R.drawable.jab_harry));
        ar.add(new movieclass("Raabta",R.drawable.raab_ta));
        ar.add(new movieclass("Toilet:Ek prem katha",R.drawable.toilet_ek));
        ar.add(new movieclass("MOM",R.drawable.m_om));
        ar.add(new movieclass("Barelliy Ki Barfi",R.drawable.barelliy_ki));
        ar.add(new movieclass("Sachin :The Billion Dreams",R.drawable.sach_in));
        ar.add(new movieclass("Jolly LLB 2",R.drawable.jolly_llb));
        movie adapter=new movie(this,ar);
        ListView list=(ListView)getListView();
        list.setOnItemClickListener(this);
        list.setChoiceMode(1);
        setListAdapter(adapter);
    }
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		movieclass m=ar.get(arg2);
        Intent i=new Intent(getApplicationContext(),secondact.class);
        i.setData(Uri.parse(movietime[arg2]));
        startActivity(i);
	}
    
	
    
}