package mh.com.databindingdemo;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;


import mh.com.databindingdemo.basic.BasicBindingActivity;
import mh.com.databindingdemo.custom.CustomBindingActivity;
import mh.com.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "DataBinding";

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.basicBinding.setOnClickListener(this);
        mBinding.customBinding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v == mBinding.basicBinding) {
            intent = new Intent(this, BasicBindingActivity.class);
        } else if (v == mBinding.customBinding) {
            intent = new Intent(this, CustomBindingActivity.class);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
