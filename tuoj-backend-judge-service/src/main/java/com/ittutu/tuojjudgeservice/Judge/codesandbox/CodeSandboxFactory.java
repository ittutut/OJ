package com.ittutu.tuojjudgeservice.Judge.codesandbox;


import com.ittutu.tuojjudgeservice.Judge.codesandbox.impl.ExampleCodeSandbox;
import com.ittutu.tuojjudgeservice.Judge.codesandbox.impl.RemoteCodeSandbox;
import com.ittutu.tuojjudgeservice.Judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * @author Ittutu
 * @version 666
 */

public class CodeSandboxFactory {

    /**
     * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
     * @param type
     * @return
     */
    public static CodeSandbox newInstance(String type){
        switch (type){
            case "remote" :
                return new RemoteCodeSandbox();
            case "thirdParty" :
                return new ThirdPartyCodeSandbox();
            case "example" :
            default:
                return new ExampleCodeSandbox();
        }
    }
}
