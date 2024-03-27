package com.ChatAppApplication.models;

public class ChatMessage {
private String sender;
private String content;
private messagaeType type;


public enum messagaeType{
	CHAT,LEAVE,JOIN
}


public String getSender() {
	return sender;
}


public void setSender(String sender) {
	this.sender = sender;
}


public String getContent() {
	return content;
}


public void setContent(String content) {
	this.content = content;
}


public messagaeType getType() {
	return type;
}


public void setType(messagaeType type) {
	this.type = type;
}


@Override
public String toString() {
	return "Message [sender=" + sender + ", content=" + content + ", type=" + type + "]";
}


public ChatMessage(String sender, String content, messagaeType type) {
	super();
	this.sender = sender;
	this.content = content;
	this.type = type;
}


public ChatMessage() {
	super();
	// TODO Auto-generated constructor stub
}

}