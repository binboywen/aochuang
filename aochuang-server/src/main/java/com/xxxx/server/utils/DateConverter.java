package com.xxxx.server.utils;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** 日期转换
 * @author wentao  @create 2022/10/28-下午9:05
 */
@Component
public class DateConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String source) {

        try {
            return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            //return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
