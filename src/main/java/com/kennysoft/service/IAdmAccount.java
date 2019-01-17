package com.kennysoft.service;
import com.kennysoft.model.*;

public interface IAdmAccount extends  XIServiceBase<KsAdmin> {

    public  ZCustDataResult selectCustDataResult(ZCustDataExample example);
}
