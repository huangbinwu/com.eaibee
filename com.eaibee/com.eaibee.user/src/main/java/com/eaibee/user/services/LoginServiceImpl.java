package com.eaibee.user.services;

import com.eaibee.api.services.ILoginService;
import com.eaibee.api.vo.req.BaseReq;
import com.eaibee.api.vo.resp.BaseResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author
 * @date
 */
@Slf4j
@Service
public class LoginServiceImpl implements ILoginService {

    /**
     * @param req
     * @return
     */
    @Override
    public BaseResp login(BaseReq req) {
        BaseResp resp = new BaseResp();
        log.info("do login... ...");
        return resp;
    }
}
