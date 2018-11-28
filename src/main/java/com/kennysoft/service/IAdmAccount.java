package com.kennysoft.service;
import com.kennysoft.model.*;
public interface IAdmAccount extends  XIServiceBase<AdmAccount> {

    public  ZCustDataResult selectCustDataResult(ZCustDataExample example);
}
