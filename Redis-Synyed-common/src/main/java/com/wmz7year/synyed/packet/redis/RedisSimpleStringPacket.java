package com.wmz7year.synyed.packet.redis;

/**
 * Redis 简单字符串的包<br>
 * 只有一个字符串 没有其他数据
 * 
 * @Title: RedisSimpleStringPacket.java
 * @Package com.wmz7year.synyed.packet.redis
 * @author jiangwei (ydswcy513@gmail.com)
 * @date 2015年12月11日 上午10:32:56
 * @version V1.0
 */
public class RedisSimpleStringPacket extends RedisPacket {

	public RedisSimpleStringPacket(String command) {
		super(command);
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RedisSimpleStringPacket [command=" + command + "]";
	}

}
