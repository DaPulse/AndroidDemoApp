package demoapp.dapulse.com.dapulsedemoapp.features.employees.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import demoapp.dapulse.com.dapulsedemoapp.DemoApp;
import demoapp.dapulse.com.dapulsedemoapp.dagger.DaggerEmployeesComponent;
import demoapp.dapulse.com.dapulsedemoapp.dagger.EmployeesComponent;
import demoapp.dapulse.com.dapulsedemoapp.dagger.EmployeesModule;
import demoapp.dapulse.com.dapulsedemoapp.features.employees.EmployeePresenter;

/**
 * Created by ofer on 08/05/2017.
 */

public class BaseEmployeeFragment extends Fragment {
    @Inject
    protected EmployeePresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setup Dagger to resolve all Dependencies - Ignore this part
        EmployeesComponent employeeComponent = DaggerEmployeesComponent.builder()
                .applicationComponent(((DemoApp) getActivity().getApplication()).getAppComponent())
                .employeesModule(new EmployeesModule(getActivity()))
                .build();
        employeeComponent.inject(this);
    }
}
