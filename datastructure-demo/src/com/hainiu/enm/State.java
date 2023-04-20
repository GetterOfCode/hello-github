package com.hainiu.enm;

public enum State {
    NORMAL("正常"),GOOD("良好"),ABNORMAL("异常");
    private String name;
    private State(){};
    private State(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
