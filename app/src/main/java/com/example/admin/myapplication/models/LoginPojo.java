package com.example.admin.myapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPojo {

@SerializedName("DonarId")
@Expose
private String donarId;
@SerializedName("DName")
@Expose
private String dName;
@SerializedName("DPhno")
@Expose
private String dPhno;
@SerializedName("DEmailId")
@Expose
private String dEmailId;
@SerializedName("DPassword")
@Expose
private String dPassword;
@SerializedName("DLatLng")
@Expose
private String dLatLng;
@SerializedName("DGender")
@Expose
private String dGender;
@SerializedName("DBg")
@Expose
private String dBg;
@SerializedName("DDob")
@Expose
private String dDob;

public String getDonarId() {
return donarId;
}

public void setDonarId(String donarId) {
this.donarId = donarId;
}

public String getDName() {
return dName;
}

public void setDName(String dName) {
this.dName = dName;
}

public String getDPhno() {
return dPhno;
}

public void setDPhno(String dPhno) {
this.dPhno = dPhno;
}

public String getDEmailId() {
return dEmailId;
}

public void setDEmailId(String dEmailId) {
this.dEmailId = dEmailId;
}

public String getDPassword() {
return dPassword;
}

public void setDPassword(String dPassword) {
this.dPassword = dPassword;
}

public String getDLatLng() {
return dLatLng;
}

public void setDLatLng(String dLatLng) {
this.dLatLng = dLatLng;
}

public String getDGender() {
return dGender;
}

public void setDGender(String dGender) {
this.dGender = dGender;
}

public String getDBg() {
return dBg;
}

public void setDBg(String dBg) {
this.dBg = dBg;
}

public String getDDob() {
return dDob;
}

public void setDDob(String dDob) {
this.dDob = dDob;
}

}