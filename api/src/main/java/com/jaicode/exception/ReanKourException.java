package com.jaicode.exception;

/**
 * Created by siheng.chap on 04/06/2015.
 */
public class ReanKourException extends Throwable {

    private String errorCode = "";
    public ReanKourException(String strException) {
        super(strException);
        this.errorCode = strException;
    }

    public ReanKourException(String strException, Throwable t)
    {
        super(strException,t);
        this.errorCode = strException;
    }

    public ReanKourException(Throwable t){
        super(t);
    }

    public String getErrorCode()
    {
        if (this.errorCode.equals("")) {
            return super.getMessage();
        }
        return this.errorCode;
    }
}
