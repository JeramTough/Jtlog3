package com.jeramtough.jtlog.style;

import com.jeramtough.jtlog.context.LogContext;
import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtlog.bean.LogInformation;
import com.jeramtough.jtlog.util.MyStringUtil;

/**
 * Created by 11718
 * on 2017  October 14 Saturday 17:44.
 *
 * @author 11718
 */

public abstract class BasePrintStyle implements PrintStyle {

    private LogContext logContext;

    public BasePrintStyle(LogContext logContext) {
        this.logContext = logContext;
    }

    protected String getHead(LogInformation logInformation) {

        String context, tag;
        if (getLogContext().getContextName().equals(L.class.getSimpleName())) {
            context = "";
        }
        else {
            context = " , {context}=" + getLogContext().getContextName();
        }
        if (logInformation.getTag() == null) {
            tag = "";
        }
        else {
            tag = " , {tag}=" + logInformation.getTag();

        }
        String head = logInformation.getLogLevel().getFlag() + ":{time}=" +
                logInformation.getTime() + " , " + "{thread}=" + logInformation.getThreadName() + context + tag;

        return head;
    }

    protected String getMessage(LogInformation logInformation) {
        int limitNumber = getLogContext().getLogConfig().getMaxLengthOfRow();
        String message;
        if (limitNumber > 0) {
            message = "\n" + MyStringUtil.splitTextByCounterOfRow(
                    logInformation.getMessage(),
                    limitNumber) + "\n";
        }
        else {
            message = "\n" + logInformation.getMessage() + "\n";
        }
        return message;
    }

    protected String getTraceIfEnable(LogInformation logInformation) {
        if (true) {
            return " , {trace}=at " + logInformation.getClassName() + "." +
                    logInformation.getMethodName() + "(" +
                    logInformation.getFileName() + ":" +
                    logInformation.getLine() + ")";
        }
        else {
            return "";
        }

    }

    public LogContext getLogContext() {
        return logContext;
    }
}
