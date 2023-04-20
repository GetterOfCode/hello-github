package com.hainiu.excep;
//自定义异常类型
public class AgeOutOfBoundsException extends RuntimeException  {
    AgeOutOfBoundsException(){
        super();
    }
    AgeOutOfBoundsException(String message){
        super(message);
    }

}
