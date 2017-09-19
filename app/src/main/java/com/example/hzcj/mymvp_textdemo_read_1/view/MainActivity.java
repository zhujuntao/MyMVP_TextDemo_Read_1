package com.example.hzcj.mymvp_textdemo_read_1.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hzcj.mymvp_textdemo_read_1.R;
import com.example.hzcj.mymvp_textdemo_read_1.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,IUserview{
    private EditText mFirstNameEditText, mLastNameEditText, mIdEditText;
    private Button mSaveButton, mLoadButton;
    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findWidgets();
        //创建presenter对象
        userPresenter = new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);


    }
    //找控件
    private void findWidgets() {
        mFirstNameEditText = (EditText) findViewById(R.id.et_firstName);
        mLastNameEditText = (EditText) findViewById(R.id.et_lastName);
        mIdEditText = (EditText) findViewById(R.id.et_id);
        mSaveButton = (Button) findViewById(R.id.bt_write);
        mLoadButton = (Button) findViewById(R.id.bt_read);


    }
//点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_write:
                userPresenter.saveUser(getID(),getFirstName(),getLastName());
                break;
            case R.id.bt_read:
                userPresenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return Integer.parseInt(mIdEditText.getText().toString());
    }

    @Override
    public String getFirstName() {
        return mFirstNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLastNameEditText.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstNameEditText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLastNameEditText.setText(lastName);
    }
}
