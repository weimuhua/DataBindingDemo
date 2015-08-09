package mh.com.databindingdemo;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import mh.com.databindingdemo.BR;

public class User extends BaseObservable {

    private static final String TAG = "User";

    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isAdult() {
        return this.age >= 18 ? "true" : "false";
    }
}
