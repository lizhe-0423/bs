package com.lizhi.bs.common;

import org.apache.poi.ss.formula.functions.T;

/**
 * 返回工具类
 *
 * @author <a href="https://github.com/lizhe-0423">荔枝程序员</a>
 * 
 */
public class ResultUtils {

    private ResultUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 成功
     *
     * @param data data to
     * @param <T> type of result
     * @return result
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode error code
     * @return result
     */
    public static BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code  code
     * @param message   message
     * @return result
     */
    public static BaseResponse<T> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode error code
     * @return result
     */
    public static BaseResponse<T> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}
