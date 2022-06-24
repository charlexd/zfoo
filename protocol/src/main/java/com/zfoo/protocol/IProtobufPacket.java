package com.zfoo.protocol;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.MessageOrBuilder;
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
