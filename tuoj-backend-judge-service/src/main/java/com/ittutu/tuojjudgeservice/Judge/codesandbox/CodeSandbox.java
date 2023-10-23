package com.ittutu.tuojjudgeservice.Judge.codesandbox;


import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeRequest;
import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
