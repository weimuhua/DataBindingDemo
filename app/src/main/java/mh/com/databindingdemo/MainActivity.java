package mh.com.databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;


import mh.com.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private static final int MSG_CHANGE_USER = 1;

    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_CHANGE_USER:
                    Log.d(TAG, "MSG_CHANGE_USER");
                    mUser.setFirstName("Wayne");
                    mUser.setLastName("Bruce");
                    break;
            }
            return false;
        }
    });

    private User mUser;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUser = new User("Bruce", "Wayne");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(mUser);

        mHandler.sendEmptyMessageDelayed(MSG_CHANGE_USER, 3000);
    }

}
