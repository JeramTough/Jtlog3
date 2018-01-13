package com.jeramtough.jtlog3.style;

import com.jeramtough.jtlog3.LogInformation;

public class InfoPrintStyle extends BasePrintStyle
{
	@Override
	public String stylize(LogInformation logInformation)
	{
		String message =
				getHead(logInformation) + getTag(logInformation) + getMessage(logInformation);
		return message;
	}
}
