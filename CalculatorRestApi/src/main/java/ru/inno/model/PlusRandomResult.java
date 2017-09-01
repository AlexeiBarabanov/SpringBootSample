package ru.inno.model;

public class PlusRandomResult {
    private Integer passedArgument;
    private Integer randomArgument;
    private Integer result;

    public PlusRandomResult(Integer passedArgument, Integer randomArgument, Integer result) {
        this.passedArgument = passedArgument;
        this.randomArgument = randomArgument;
        this.result = result;
    }

    public Integer getPassedArgument() {
        return passedArgument;
    }

    public Integer getRandomArgument() {
        return randomArgument;
    }

    public Integer getResult() {
        return result;
    }

}
