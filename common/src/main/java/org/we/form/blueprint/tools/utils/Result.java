package org.we.form.blueprint.tools.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * author: jim(god)
 *
 */
@Data
public class Result {
    //operation 标志  ok ==> 200
//    ------------------属性---------------
    private Integer code;

    private String message;


    private Map<String,Object> data;


    private Result (){
        this.data = new HashMap<>();
    }

//    -------------------build a Result instance----------------

    public static Result ok(){

        Result result = new Result();
        result.code = 200;
        result.message ="ok";
        return result;
    };
    public static Result error(){
        Result result = new Result();
        result.code = 999;
        result.message = "error";
        return result;
    }
    public static Result unValid(){
        Result result = new Result();
        result.code = 400;
        result.message = "unValid";
        return result;
    }
    public static Result unAuthorized(){
        Result result = new Result();
        result.code = 401;
        result.message="unAuthorized";
        return result;
    }
//    -----------------instance 空间-------------------
    public void message(String message){
        this.message = message;
    }
    public void data(String key,Object value){
        this.data.put(key,value);
    };




}
