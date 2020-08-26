package com.example.helloworldmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworldmvp.R;
import com.example.helloworldmvp.contract.MainActivityContract;
import com.example.helloworldmvp.contract.MainActivityContract.View;
import com.example.helloworldmvp.presenter.MainActivityPresenter;
import com.example.helloworldmvp.contract.MainActivityContract.Presenter;

public class MainActivity extends AppCompatActivity  implements View {

    //https://www.youtube.com/watch?v=9hw0SRtOZ9w


    private TextView mTextView;
    private Button mButton;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);

    }

    @Override
    public void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new android.view.View.OnClickListener() {
                                       @Override
                                       public void onClick(android.view.View view) {
                                           mPresenter.onClick(view);
                                       }
                                   }

        );
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}