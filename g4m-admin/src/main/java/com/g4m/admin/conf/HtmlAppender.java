package com.g4m.admin.conf;

import java.io.IOException;
import java.io.Serializable;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;

import com.g4m.admin.websocket.WebSocketTest;


@Plugin(name = "HtmlAppender", category = "Core", elementType = "appender", printObject = true)
public class HtmlAppender extends AbstractAppender {


	@Autowired
	WebSocketTest webSocketTest;
	
	protected HtmlAppender(String name, Filter filter, Layout<? extends Serializable> layout) {
		super(name, filter, layout);
	}

	@Override
	public void append(LogEvent event) {
		final byte[] bytes = getLayout().toByteArray(event);
		try {
			webSocketTest.sendMessage(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/*  接收配置文件中的参数 */
	@PluginFactory
	public static AbstractAppender createAppender(@PluginAttribute("name") String name,
			@PluginElement("Filter") final Filter filter,
			@PluginElement("Layout") Layout<? extends Serializable> layout,
			@PluginAttribute("ignoreExceptions") boolean ignoreExceptions) {
		if (name == null) {
			LOGGER.error("no name defined in conf.");
			return null;
		}
		if (layout == null) {
			layout = PatternLayout.createDefaultLayout();
		}
		return new HtmlAppender(name, filter, layout);
	}
}
