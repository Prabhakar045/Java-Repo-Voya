package com.voya.abstraction;

public class AbsMain {
    public static void main(String[] args) {
        /*
       Branch1 branch1 = new Branch1();
       branch1.carLoan();
       branch1.educationLoan();
       branch1.houseLoan();


         */
       SubBranch subBranch = new SubBranch();
       subBranch.subPay();
       subBranch.carLoan();
       subBranch.educationLoan();
       subBranch.houseLoan();
       subBranch.admin();
       subBranch.loanType();

       Bank bank = new SubBranch();
       bank.admin();
       bank.carLoan();

       SubBranch subBranch1 = (SubBranch) bank;
       subBranch1.loanType();
       subBranch1.houseLoan();
       subBranch1.educationLoan();
       subBranch1.subPay();
    }
}
