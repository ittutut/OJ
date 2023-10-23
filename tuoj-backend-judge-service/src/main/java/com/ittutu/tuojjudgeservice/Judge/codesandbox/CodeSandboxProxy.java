package com.ittutu.tuojjudgeservice.Judge.codesandbox;

import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeRequest;
import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ittutu
 * @version 666
 */
@Slf4j
public class CodeSandboxProxy implements CodeSandbox{

    private CodeSandbox codeSandbox;

    public CodeSandboxProxy(CodeSandbox codeSandbox){
        this.codeSandbox = codeSandbox;
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息：" + executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱响应信息：" + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
