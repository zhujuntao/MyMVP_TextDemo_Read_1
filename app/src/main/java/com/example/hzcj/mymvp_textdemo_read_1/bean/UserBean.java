package com.example.hzcj.mymvp_textdemo_read_1.bean;

/**
 * Created by HZCJ on 2017/9/18.
 * <pre>
 * author:zhu
 * e-mail:18911664778@163.com
 * desc:
 * version:
 * </pre>
 */

public class UserBean {
    private String mFirstName;
    private String mLirstName;

    public UserBean(String mFirstName, String mLirstName) {
        this.mFirstName = mFirstName;
        this.mLirstName = mLirstName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLirstName() {
        return mLirstName;
    }
}
