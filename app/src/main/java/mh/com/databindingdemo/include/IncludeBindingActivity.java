package mh.com.databindingdemo.include;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import mh.com.databindingdemo.R;
import mh.com.databindingdemo.User;
import mh.com.databindingdemo.databinding.IncludeBindBinding;

public class IncludeBindingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IncludeBindBinding bindBinding = DataBindingUtil.setContentView(this, R.layout.include_bind);
        bindBinding.setUser(new User("Bruce", "Wayne", 18));
    }
}
