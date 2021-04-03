package com.jeramtough.jtlog.jtlogger;

import com.jeramtough.jtlog.bean.LogInformation;
import com.jeramtough.jtlog.context.LogContext;
import com.jeramtough.jtlog.level.LogLevel;
import com.jeramtough.jtlog.message.MessagePlaceholdersWrapper;
import com.jeramtough.jtlog.message.MessageWrapper;
import com.jeramtough.jtlog.printer.PrinterFactory;
import com.jeramtough.jtlog.tag.ErrPrintlnTag;
import com.jeramtough.jtlog.tag.OutPrintlnTag;
import com.jeramtough.jtlog.tag.Tag;
import com.jeramtough.jtlog.util.ExceptionUtil;

/**
 * Created on 2018-08-21 14:51
 * by @author JeramTough
 */
public class JtLogger implements Logger {

    private final LogContext logContext;

    JtLogger(LogContext logContext) {
        this.logContext = logContext;
    }

    @Override
    public void arrive() {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ARRIVE).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }


    @Override
    public <T> void p(T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.PRINTLN).setMessage(message).setTag(
                OutPrintlnTag.getInstance()).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void p(MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.PRINTLN).setMessageWrapper(messageWrapper).setTag(
                OutPrintlnTag.getInstance()).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void e(T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.PRINTLN).setMessage(message).setTag(
                ErrPrintlnTag.getInstance()).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void e(MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.PRINTLN).setMessageWrapper(messageWrapper).setTag(
                ErrPrintlnTag.getInstance()).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void info(T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessage(message).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void info(MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void info(Tag tag, T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessage(message).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void info(Tag tag, MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void info(T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessage(formatMessage).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void info(MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void info(Tag tag, T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessage(formatMessage).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void info(Tag tag, MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.INFO).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void warn(T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessage(message).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void warn(MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void warn(Tag tag, T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessage(message).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void warn(Tag tag, MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void warn(T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessage(formatMessage).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void warn(MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void warn(Tag tag, T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessage(formatMessage).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void warn(Tag tag, MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.WARN).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void error(T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessage(message).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void error(MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void error(Tag tag, T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessage(message).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void error(Tag tag, MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void error(T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessage(formatMessage).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void error(MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void error(Exception e, T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        formatMessage = formatMessage + System.getProperty(
                "line.separator") + ExceptionUtil.getDetail(e);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessage(formatMessage).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void error(Exception e, MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(e, messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void error(Exception e) {
        String formatMessage = ExceptionUtil.getDetail(e);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessage(formatMessage).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void error(Tag tag, T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessage(formatMessage).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void error(Tag tag, MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void error(Tag tag, Exception e, T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        formatMessage = formatMessage + System.getProperty(
                "line.separator") + ExceptionUtil.getDetail(e);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessage(formatMessage).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void error(Tag tag, Exception e, MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(e, messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.ERROR).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void debug(T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessage(message).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void debug(MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void debug(Tag tag, T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessage(message).setTag(
                tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void debug(Tag tag, MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessageWrapper(messageWrapper).setTag(
                tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void debug(T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessage(formatMessage).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void debug(MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void debug(Tag tag, T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessage(formatMessage).setTag(
                tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void debug(Tag tag, MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessageWrapper(messageWrapper).setTag(
                tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void debugs(T... messages) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < messages.length; i++) {
            String m = messages[i] == null ? "[null]" : messages[i].toString();
            if (m != null) {
                if (i == 0) {
                    stringBuilder.append(m);
                }
                else {
                    stringBuilder.append(" , ").append(m);
                }
            }
        }

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.DEBUG).setMessage(stringBuilder.toString()).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void verbose(T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessage(message).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void verbose(MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void verbose(Tag tag, T message) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessage(message).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void verbose(Tag tag, MessageWrapper messageWrapper) {
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void verbose(T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessage(formatMessage).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void verbose(MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessageWrapper(messageWrapper).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public <T> void verbose(Tag tag, T message, Object... placeholders) {
        String formatMessage = String.format(message.toString(), placeholders);
        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessage(formatMessage).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public void verbose(Tag tag, MessageWrapper messageWrapper, Object... placeholders) {
        //message包装类
        messageWrapper = new MessagePlaceholdersWrapper(messageWrapper, placeholders);

        LogInformation logInformation = new LogInformation.Builder(logContext).setJtLogLevel(
                LogLevel.VERBOSE).setMessageWrapper(messageWrapper).setTag(tag).build();
        PrinterFactory.getPrinter(logContext).print(logInformation);
    }

    @Override
    public LogContext getLogContext() {
        return logContext;
    }


}
