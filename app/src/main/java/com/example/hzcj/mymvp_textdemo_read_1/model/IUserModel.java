package com.example.hzcj.mymvp_textdemo_read_1.model;

import com.example.hzcj.mymvp_textdemo_read_1.bean.UserBean;

/**
 * Created by HZCJ on 2017/9/18.
 * <pre>
 * author:zhu
 * e-mail:18911664778@163.com
 * desc:
 * version:
 * </pre>
 */

public interface IUserModel {
    void setID(int id);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    UserBean load(int id);
}
