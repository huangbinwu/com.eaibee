package com.eaibee.controller;

import com.eaibee.api.services.ILoginService;
import com.eaibee.api.vo.req.BaseReq;
import com.eaibee.api.vo.resp.BaseResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date
 */
@RestController
public class LoginController extends BaseController {

    @Autowired
    private ILoginService loginService;

    @GetMapping("/user/login")
    public BaseResp login() {
        BaseReq req = new BaseReq();
        BaseResp resp = loginService.login(req);
        return resp;
    }

}
