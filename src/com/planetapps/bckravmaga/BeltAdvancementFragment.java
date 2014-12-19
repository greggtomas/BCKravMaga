package com.planetapps.bckravmaga;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BeltAdvancementFragment extends Fragment{
	private static final String ARG_POSITION = "position";

	private int position;

	public static BeltAdvancementFragment newInstance(int position) {
		BeltAdvancementFragment f = new BeltAdvancementFragment();
		/*Bundle b = new Bundle();
		b.putInt(ARG_POSITION, position);
		f.setArguments(b);*/
		return f;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment_belt_advancement, container, false);
	}
}
