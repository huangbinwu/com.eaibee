package com.eaibee.api.services;

import com.eaibee.api.vo.req.BaseReq;
import com.eaibee.api.vo.resp.BaseResp;

/**
 * @author
 * @date
 */
public interface ILoginService {

    public BaseResp login(BaseReq req);

}
