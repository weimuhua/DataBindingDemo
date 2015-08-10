package mh.com.databindingdemo.custom;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import mh.com.databindingdemo.R;
import mh.com.databindingdemo.User;
import mh.com.databindingdemo.databinding.ContactBinding;

public class CustomBindingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ContactBinding binding = DataBindingUtil.setContentView(this, R.layout.custom_bind);
        binding.setUser(new User("test", "test", 18));
    }
}
