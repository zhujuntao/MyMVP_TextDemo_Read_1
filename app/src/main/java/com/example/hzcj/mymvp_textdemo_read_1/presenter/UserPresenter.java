package com.example.hzcj.mymvp_textdemo_read_1.presenter;

import com.example.hzcj.mymvp_textdemo_read_1.bean.UserBean;
import com.example.hzcj.mymvp_textdemo_read_1.model.IUserModel;
import com.example.hzcj.mymvp_textdemo_read_1.model.UserModel;
import com.example.hzcj.mymvp_textdemo_read_1.view.IUserview;

/**
 * Created by HZCJ on 2017/9/18.
 * <pre>
 * author:zhu
 * e-mail:18911664778@163.com
 * desc:
 * version:
 * </pre>
 */

public class UserPresenter {
    private IUserview mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserview view) {
        mUserView = view;
        mUserModel=new UserModel();
    }
    public void saveUser(int id,String firstName,String lastName){
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }
    public void loadUser(int id){
        UserBean userBean=mUserModel.load(id);
        mUserView.setFirstName(userBean.getmFirstName());
        mUserView.setLastName(userBean.getmLirstName());
    }




}
