package com.ittutu.tuojjudgeservice.Judge;

import com.ittutu.tuojjudgeservice.Judge.startegy.DefaultJudgeStrategy;
import com.ittutu.tuojjudgeservice.Judge.startegy.JavaLanguageJudgeStrategy;
import com.ittutu.tuojjudgeservice.Judge.startegy.JudgeContext;
import com.ittutu.tuojjudgeservice.Judge.startegy.JudgeStrategy;
import com.ittutu.tuojmodel.model.codesandbox.JudgeInfo;
import com.ittutu.tuojmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @author Ittutu
 * @version 666
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
