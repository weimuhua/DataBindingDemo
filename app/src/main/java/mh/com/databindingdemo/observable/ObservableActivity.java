package mh.com.databindingdemo.observable;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import mh.com.databindingdemo.R;
import mh.com.databindingdemo.User;
import mh.com.databindingdemo.databinding.BasicBindBinding;
import mh.com.databindingdemo.databinding.ObservableTestBinding;

public class ObservableActivity extends Activity {

    private static final int MSG_CHANGE_USER = 1;

    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_CHANGE_USER:
                    mUser.setFirstName("Wayne");
                    mUser.setLastName("Bruce");
                    mUser.setAge(15);
                    break;
            }
            return false;
        }
    });

    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUser = new User("Bruce", "Wayne", 36);
        ObservableTestBinding binding = DataBindingUtil.setContentView(this, R.layout.observable_test);
        binding.setUser(mUser);

        mHandler.sendEmptyMessageDelayed(MSG_CHANGE_USER, 3000);
    }
}
