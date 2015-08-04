package mh.com.databindingdemo;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import mh.com.databindingdemo.BR;

public class User extends BaseObservable {

    private static final String TAG = "User";

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        Log.d(TAG, "setFirstName");
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
        Log.d(TAG, "this.firstName : " + this.firstName);
    }

    public void setLastName(String lastName) {
        Log.d(TAG, "setLastName");
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
        Log.d(TAG, "this.lastName : " + this.lastName);
    }
}
