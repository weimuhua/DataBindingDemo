package mh.com.databindingdemo.observable;


import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;


public class Company {
    public ObservableField<String> name;
    public ObservableInt age;

    public ObservableArrayList<String> employeeList;

    public Company(ObservableField<String> name, ObservableInt age, ObservableArrayList<String> employeeList) {
        this.name = name;
        this.age = age;
        this.employeeList = employeeList;
    }
}
