package mh.com.databindingdemo;


import android.util.Log;
import android.view.View;

public class User {

    private static final String TAG = "User";

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.first_name:
                Log.d(TAG, "first_name onClick");
                break;
            case R.id.last_name:
                Log.d(TAG, "last_name onClick");
                break;
            default:
                break;
        }
    }

    public boolean isBatMan() {
        return firstName.equals("Bruce");
    }
}
