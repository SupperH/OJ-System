package com.yupi.yuoj.judge.impl;

import com.yupi.yuoj.judge.codesandbox.CodeSandbox;
import com.yupi.yuoj.judge.model.ExecuteCodeRequest;
import com.yupi.yuoj.judge.model.ExecuteCodeResponse;

//示例代码沙箱 仅为了跑通业务流程
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例代码沙箱");
        return null;
    }
}
