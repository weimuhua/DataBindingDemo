package mh.com.databindingdemo.expression;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import mh.com.databindingdemo.R;
import mh.com.databindingdemo.User;
import mh.com.databindingdemo.databinding.ExpressionTestBinding;

public class ExpressionActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ExpressionTestBinding binding = DataBindingUtil.setContentView(this, R.layout.expression_test);
        binding.setUser(new User("Bruce", "Wayne", 36));
    }
}
