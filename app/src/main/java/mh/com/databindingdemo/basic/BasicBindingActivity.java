package mh.com.databindingdemo.basic;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import mh.com.databindingdemo.R;
import mh.com.databindingdemo.User;
import mh.com.databindingdemo.databinding.BasicBindBinding;

public class BasicBindingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BasicBindBinding binding = DataBindingUtil.setContentView(this, R.layout.basic_bind);
        binding.setUser(new User("Bruce", "Wayne", 32));
    }
}
