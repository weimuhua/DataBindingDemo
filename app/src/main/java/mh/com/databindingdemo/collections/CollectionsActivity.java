package mh.com.databindingdemo.collections;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mh.com.databindingdemo.R;
import mh.com.databindingdemo.databinding.CollectionTestBinding;

public class CollectionsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CollectionTestBinding binding = DataBindingUtil.setContentView(this, R.layout.collection_test);

        binding.setIndex(1);

        String key = "firstName";
        binding.setKey(key);

        List<String> list = new ArrayList<>();
        list.add("Bruce");
        list.add("Wayne");
        binding.setList(list);

        SparseArray<String> sparse = new SparseArray<>();
        sparse.put(0, "Bruce");
        sparse.put(1, "Wayne");
        binding.setSparse(sparse);

        Map<String, String> map = new HashMap<>();
        map.put(key, "Bruce");
        map.put("lastName", "Wayne");
        binding.setMap(map);
    }
}
