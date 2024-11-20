package com.yupi.yuoj.judge.impl;

import com.yupi.yuoj.judge.codesandbox.CodeSandbox;
import com.yupi.yuoj.judge.model.ExecuteCodeRequest;
import com.yupi.yuoj.judge.model.ExecuteCodeResponse;

//第三方代码沙箱，调用网上现成的代码沙箱
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
