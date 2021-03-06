package com.fallllllll.lipper.data;

import com.fallllllll.lipper.BuildConfig;
import com.fallllllll.lipper.TestApplication;
import com.fallllllll.lipper.core.MyRobolectricTestRunner;
import com.fallllllll.lipper.core.rxjava.exceptionalhandling.ApiException;
import com.fallllllll.lipper.core.rxjava.exceptionalhandling.ConvertToApiException;
import com.fallllllll.lipper.data.databean.ShotBean;
import com.fallllllll.lipper.data.local.user.LipperUser;
import com.fallllllll.lipper.data.network.model.impl.DribbbleModelImpl;
import com.fallllllll.lipper.utils.BaseRule;
import com.fallllllll.lipper.utils.RxSchedulersOverrideRule;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.robolectric.annotation.Config;

import java.util.List;

import io.reactivex.disposables.Disposable;

import static org.junit.Assert.assertNotNull;

/**
 * Created by fallllllll on 2017/3/9.
 */
@RunWith(MyRobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23, application = TestApplication.class)
public class DribbbleServiceTest {
    Disposable mDisposable;
    List<ShotBean> list;
    LipperUser mLipperUser;
    @Rule
    public MockitoRule mMockitoRule = MockitoJUnit.rule();

    @Rule
    public BaseRule baseRule = new BaseRule(true);

    @Rule
    public RxSchedulersOverrideRule mRxSchedulersOverrideRule = new RxSchedulersOverrideRule();




    @Test
    public void getUserInfo() throws Exception {
        mDisposable = DribbbleModelImpl.getInstance().getUserInfo()
                .onErrorResumeNext(new ConvertToApiException<>())
                .subscribe(lipperUser -> {
                    mLipperUser = lipperUser;
                    System.out.print(mLipperUser.getUsername());
                }, throwable -> {
                    if (throwable instanceof ApiException) {
                        ApiException a = (ApiException) throwable;
                        System.out.print(a.message);
                    } else {
                        System.out.print("throwable" + throwable.getMessage());
                    }
                });
        assertNotNull(mLipperUser);
    }


    @Test
    public void testShotApi() {
        mDisposable =  DribbbleModelImpl.getInstance().getShot(null,null,null,"1")
                .onErrorResumeNext(new ConvertToApiException<>())
                .subscribe(testList -> {
                    list = testList;
                }, throwable -> {
                    if (throwable instanceof ApiException) {
                        ApiException a = (ApiException) throwable;
                        System.out.print(a.message);
                    } else {
                        System.out.print(throwable.getMessage());
                    }
                });
        assertNotNull(list);
    }

    @After
    public void testFinished() {


        if (!mDisposable.isDisposed()) {
            mDisposable.dispose();
        }

    }
}
