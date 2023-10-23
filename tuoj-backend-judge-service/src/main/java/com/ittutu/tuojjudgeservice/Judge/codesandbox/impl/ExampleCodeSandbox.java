package com.ittutu.tuojjudgeservice.Judge.codesandbox.impl;

import com.ittutu.tuojjudgeservice.Judge.codesandbox.CodeSandbox;
import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeRequest;
import com.ittutu.tuojmodel.model.codesandbox.ExecuteCodeResponse;
import com.ittutu.tuojmodel.model.codesandbox.JudgeInfo;
import com.ittutu.tuojmodel.model.enums.JudgeInfoMessageEnum;
import com.ittutu.tuojmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 * @author Ittutu
 * @version 666
 */

public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getValue());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
