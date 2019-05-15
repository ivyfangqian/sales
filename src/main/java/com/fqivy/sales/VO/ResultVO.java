package com.fqivy.sales.VO;

import lombok.Data;

import java.util.List;

/**
 * @program: sales
 * @description:
 * @author: fqivy
 * @create: 2019-05-15 12:38
 */

@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;
}
