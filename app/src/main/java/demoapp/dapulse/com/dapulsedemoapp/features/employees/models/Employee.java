package demoapp.dapulse.com.dapulsedemoapp.features.employees.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {

@SerializedName("id")
@Expose
public Integer id;
@SerializedName("name")
@Expose
public String name;
@SerializedName("phone")
@Expose
public String phone;
@SerializedName("email")
@Expose
public String email;
@SerializedName("title")
@Expose
public String title;
@SerializedName("profile_pic")
@Expose
public String profilePic;
@SerializedName("manager_id")
@Expose
public Integer managerId;
@SerializedName("department")
@Expose
public String department;
@SerializedName("is_manager")
@Expose
public Boolean isManager;

}