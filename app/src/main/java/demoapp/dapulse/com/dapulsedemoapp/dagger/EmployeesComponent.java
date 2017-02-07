package demoapp.dapulse.com.dapulsedemoapp.dagger;

import dagger.Component;
import demoapp.dapulse.com.dapulsedemoapp.features.employees.EmployeeActivity;
import demoapp.dapulse.com.dapulsedemoapp.features.employees.ui.EmployeeFragment;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = {EmployeesModule.class})
public interface EmployeesComponent {
    void inject(EmployeeActivity activity);
    void inject(EmployeeFragment fragment);
}
