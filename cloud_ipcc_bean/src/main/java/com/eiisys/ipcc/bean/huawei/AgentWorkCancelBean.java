package com.eiisys.ipcc.bean.huawei;

import lombok.Getter;
import lombok.Setter;

/**
 * 2.1.14 退出工作态
 * 
 * @author hujm
 */

@Getter
@Setter
public class AgentWorkCancelBean {
    /** 座席工号 **/
    private Integer agentid;
    /** 座席鉴权信息 **/
    private String guid;
}
