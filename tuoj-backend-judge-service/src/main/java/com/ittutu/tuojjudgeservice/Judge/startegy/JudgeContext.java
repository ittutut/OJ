package com.ittutu.tuojjudgeservice.Judge.startegy;

import com.ittutu.tuojmodel.model.codesandbox.JudgeInfo;
import com.ittutu.tuojmodel.model.dto.question.JudgeCase;
import com.ittutu.tuojmodel.model.entity.Question;
import com.ittutu.tuojmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @author Ittutu
 * @version 666
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private Question question;

    private List<JudgeCase> judgeCaseList;

    private QuestionSubmit questionSubmit;
}
