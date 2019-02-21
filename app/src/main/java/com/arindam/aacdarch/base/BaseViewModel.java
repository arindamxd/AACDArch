package com.arindam.aacdarch.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Arindam Karmakar on 21/02/19.
 */

public abstract class BaseViewModel<N> extends ViewModel {

    private CompositeDisposable mCompositeDisposable;
}