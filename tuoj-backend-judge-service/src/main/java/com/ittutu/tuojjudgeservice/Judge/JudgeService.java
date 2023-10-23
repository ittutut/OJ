package com.ittutu.tuojjudgeservice.Judge;


import com.ittutu.tuojmodel.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
