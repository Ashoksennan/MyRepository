package com.example.admin.myapplication.presenter;

import com.example.admin.myapplication.presenter.contracts.IDonarLoginContract;

import javax.inject.Inject;

public class DonorLoginPresenter implements IDonarLoginContract.presenter {
    IDonarLoginContract.view view;
    @Inject
    public DonorLoginPresenter(IDonarLoginContract.view view) {
        this.view = view;
    }

    @Override
    public void loginFunctionality() {

    }
}
