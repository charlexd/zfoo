package com.zfoo.net.packet.protopacket;

import com.zfoo.protocol.IPacket;
import lombok.Getter;
import lombok.Setter;

/************************************************************
 * VAResponse
 * @date 2022/6/23  
 * @author denglichuan@elex-tech.com
 */
public class VAResponse implements IPacket {
	public static final transient short PROTOCOL_ID = 7003;

	@Getter
	@Setter
	private String message = null;

	public VAResponse() {

	}

	@Override
	public short protocolId() {
		return PROTOCOL_ID;
	}
}
