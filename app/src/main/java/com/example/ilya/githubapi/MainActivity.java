package com.example.ilya.githubapi;

import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListValidator validator = RepoFactory.retrofitRepo().create(ListValidator.class);

        final Call<List<RepoValidate>> call = validator.validate();

        NetworkThread.getInstance().execute(call, new NetworkThread.ExecuteCallback<List<RepoValidate>>() {

            @Override
            public void onSuccess(List<RepoValidate> result) {
                TextView textRepo = (TextView) findViewById(R.id.repo);
                textRepo.setText(result.toString());
            }

            @Override
            public void onError(Exception ex) {
            }
        });

//        RecyclerView view = (RecyclerView)findViewById(R.id.rec);
//        CustomAdapter myAdapter = new CustomAdapter();
//        view.setAdapter(myAdapter);
//
//        private class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder>{
//

        }
    }
}
