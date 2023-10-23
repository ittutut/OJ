package com.ittutu.tuojmodel.model.dto.question;

/**
 * @author Ittutu
 * @version 666
 */
import lombok.Data;

/**
 * 题目用例
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}

