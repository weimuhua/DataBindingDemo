package mh.com.databindingdemo.observable;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import mh.com.databindingdemo.R;
import mh.com.databindingdemo.User;
import mh.com.databindingdemo.databinding.ObservableTestBinding;

public class ObservableActivity extends Activity {

    private static final int MSG_CHANGE_DATA = 1;

    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_CHANGE_DATA:
                    mUser.setFirstName("Wayne");
                    mUser.setLastName("Bruce");
                    mUser.setAge(15);

                    mCompanyName.set("Google");
                    mCompanyAge.set(20);
                    mEmployeeList.add(mIndex, "Larry Page");
                    break;
            }
            return false;
        }
    });

    private User mUser;
    private Company mCompany;

    private int mIndex;
    private ObservableInt mCompanyAge;
    private ObservableField<String> mCompanyName;
    private ObservableArrayList<String> mEmployeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUser = new User("Bruce", "Wayne", 36);

        mIndex = 0;
        mEmployeeList = new ObservableArrayList<>();
        mEmployeeList.add("Robin");
        mCompanyName = new ObservableField<>("Baidu");
        mCompanyAge = new ObservableInt(15);
        mCompany = new Company(mCompanyName, mCompanyAge, mEmployeeList);

        ObservableTestBinding binding = DataBindingUtil.setContentView(this, R.layout.observable_test);
        binding.setUser(mUser);

        binding.setIndex(mIndex);
        binding.setCompany(mCompany);

        mHandler.sendEmptyMessageDelayed(MSG_CHANGE_DATA, 3000);
    }
}
