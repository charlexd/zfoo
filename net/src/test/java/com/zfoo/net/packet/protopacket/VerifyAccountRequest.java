package com.zfoo.net.packet.protopacket;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zfoo.net.packet.protobuf.MsgLogin;
import com.zfoo.protocol.IPacket;
import com.zfoo.protocol.IProtobufPacket;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

/************************************************************
 * VerifyAccountRequest
 * @date 2022/6/20  
 * @author denglichuan@gmail.com
 */
public class VerifyAccountRequest implements IProtobufPacket, IPacket {


	public static final transient short PROTOCOL_ID = 5002;

	@Getter
	@Setter
	private MsgLogin.PBVerifyAccountRequest.Builder messageBuilder = null;

	public VerifyAccountRequest() { messageBuilder = MsgLogin.PBVerifyAccountRequest.newBuilder();}

	@Override
	public short protocolId() {
		return PROTOCOL_ID;
	}


	@Override
	public void readFrom(ByteBuf buffer) {
		int length = buffer.readIntLE();

		var bytes =  new byte[length];
		buffer.readBytes(bytes);
		//var buf = buffer.readBytes(length);
		try {
			var message = MsgLogin.PBVerifyAccountRequest.parseFrom(bytes);
			messageBuilder = message.toBuilder();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void writeTo(ByteBuf buffer) {
		var buf = messageBuilder.build().toByteArray();
		buffer.writeIntLE(buf.length);
		buffer.writeBytes(buf);
	}

}