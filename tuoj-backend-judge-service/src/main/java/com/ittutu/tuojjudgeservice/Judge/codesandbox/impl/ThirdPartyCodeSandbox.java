package com.ittutu.tuojjudgeservice.Judge.codesandbox.impl;

import com.ittutu.tuojjudgeservice.Judge.codesandbox.CodeSandbox;
import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeRequest;
import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 * @author Ittutu
 * @version 666
 */

public class ThirdPartyCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
