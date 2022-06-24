package com.zfoo.net.packet.protopacket;

import com.zfoo.net.packet.protobuf.MsgLogin;
import com.zfoo.protocol.IPacket;
import lombok.Getter;
import lombok.Setter;

/************************************************************
 * VARequest
 * @date 2022/6/23  
 * @author denglichuan@elex-tech.com
 */
public class VARequest implements IPacket {
	public static final transient short PROTOCOL_ID = 7002;

	@Getter
	@Setter
	private String message = null;

	public VARequest() {

	}

	@Override
	public short protocolId() {
		return PROTOCOL_ID;
	}
}
