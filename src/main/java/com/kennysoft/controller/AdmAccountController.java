package com.kennysoft.controller;

import com.kennysoft.model.*;
import com.kennysoft.service.IAdmAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/account")
//@SessionAttributes("ACCOUNT")
public class AdmAccountController {
    @Resource
    IAdmAccount service;


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(HttpServletRequest request,Model model)
    {
        return "/home/index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public   @ResponseBody
    XRspJson  login(HttpServletRequest request, Model model){
        XRspJson<List<AdmAccount>> rsp =new XRspJson<>();
        XPagePara xPagePara= new XPagePara();
        XOrder xOrder = new XOrder();
        xPagePara.setLimit(10);
        xPagePara.setOffset(10000);
        XQueryResult<AdmAccount> ret = service.list(xPagePara,xOrder);
        rsp.setRet(0);
        rsp.setMsg("success");
        rsp.setData(ret.getList());
        return rsp;
    }
}
