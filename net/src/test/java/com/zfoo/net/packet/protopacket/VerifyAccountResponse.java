package com.zfoo.net.packet.protopacket;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zfoo.net.packet.protobuf.MsgLogin;
import com.zfoo.protocol.IPacket;
import com.zfoo.protocol.IProtobufPacket;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

/************************************************************
 * VerifyAccountResponse
 * @date 2022/6/21  
 * @author denglichuan@gmail.com
 */
public class VerifyAccountResponse implements IProtobufPacket, IPacket {

	public static final transient short PROTOCOL_ID = 5003;

	@Getter
	@Setter
	private MsgLogin.PBVerifyAccountResponse.Builder messageBuilder = null;
	//@Getter
	//private MsgLogin.PBVerifyAccountResponse message = null;

	public VerifyAccountResponse() {
		messageBuilder = MsgLogin.PBVerifyAccountResponse.newBuilder();
	}

	@Override
	public short protocolId() {
		return PROTOCOL_ID;
	}

	@Override
	public void readFrom(ByteBuf buffer) {
		int length = buffer.readIntLE();
		var bytes =  new byte[length];
		buffer.readBytes(bytes);
		//var buf = buffer.readRetainedSlice(length);
		try {
			var message = MsgLogin.PBVerifyAccountResponse.parseFrom(bytes);
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
