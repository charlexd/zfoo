package com.zfoo.protocol;

import io.netty.buffer.ByteBuf;

/************************************************************
 * ProtobufPacket
 * @date 2022/6/22  
 * @author denglichuan@gmail.com
 */
public interface IProtobufPacket  {

	void readFrom(ByteBuf buffer);

	void writeTo(ByteBuf buffer);
}
