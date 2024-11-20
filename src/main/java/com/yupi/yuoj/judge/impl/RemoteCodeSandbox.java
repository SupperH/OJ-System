package com.yupi.yuoj.judge.impl;

import com.yupi.yuoj.judge.codesandbox.CodeSandbox;
import com.yupi.yuoj.judge.model.ExecuteCodeRequest;
import com.yupi.yuoj.judge.model.ExecuteCodeResponse;

//远程代码沙箱（实际调用接口的沙箱）
public class RemoteCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}
