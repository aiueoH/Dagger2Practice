package com.dowob.dagger2practice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
import javax.inject.Singleton;

/**
 * Created by Wei on 2016/10/24.
 */

@Retention(RetentionPolicy.RUNTIME)
@Singleton
public @interface PerActivity {
}
