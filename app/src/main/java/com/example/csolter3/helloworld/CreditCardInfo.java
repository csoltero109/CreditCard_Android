package com.example.csolter3.helloworld;

public class CreditCardInfo {

    private String CC_Number;
    private String CC_Provider;
    private String CC_Name;
    private String Exp_Date;
    private String Security_Code;

    CreditCardInfo(){
        CC_Number = "No Number";
        CC_Provider = "No Provider";
        CC_Name = "No Name";
        Exp_Date = "No Expiration Date";
        Security_Code = "No Security Code";
    }

    public String getCC_Number(){
        return CC_Number;
    }

    public String getCC_Name(){
        return CC_Name;
    }

    public String getCC_Provider(){
        return CC_Provider;
    }

    public String getExp_Date(){
        return Exp_Date;
    }

    public String getSecurity_Code(){
        return Security_Code;
    }

    private void setCC_Number(String CC_Number){
        this.CC_Number = CC_Number;
    }

    private void setCC_Name(String CC_Name){
        this.CC_Name = CC_Name;
    }

    private void setCC_Provider(String CC_Provider){
        this.CC_Provider = CC_Provider;
    }

    private void setExp_Date(String Exp_Date){
        this.Exp_Date = Exp_Date;
    }

    private void setSecurity_Code(String Security_Code){
        this.Security_Code = Security_Code;
    }
}
