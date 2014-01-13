package com.hyn.PanelLineAnimation;

import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: yananh
 * Date: 14-1-9
 * Time: 下午3:48
 * To change this template use File | Settings | File Templates.
 */
public class Fragment1 extends Fragment{
    TextView tv = null;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FrameLayout;
        ViewGroup;
        View;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.layout1, container, false);
        tv = (TextView) view.findViewById(R.id.tv1);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        savedInstanceState = this.getArguments();
        String des = null;
        if(null == savedInstanceState){
            des = "Fragment Test";
        }else{
         des = savedInstanceState.getString("data");
        }
        if(TextUtils.isEmpty(des)) des = "Fragment Test";
        if(null != tv){
            tv.setText(des);
        }
    }
}
