/*
 * Copyright (C) 2020 The zfoo Authors
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.zfoo.net.core.gateway;

import com.zfoo.net.NetContext;
import com.zfoo.net.packet.gateway.GatewayToProviderRequest;
import com.zfoo.net.packet.gateway.GatewayToProviderResponse;
import com.zfoo.net.packet.protopacket.VARequest;
import com.zfoo.net.packet.protopacket.VAResponse;
import com.zfoo.net.packet.protopacket.VerifyAccountRequest;
import com.zfoo.net.packet.protopacket.VerifyAccountResponse;
import com.zfoo.net.router.attachment.GatewayAttachment;
import com.zfoo.net.router.receiver.PacketReceiver;
import com.zfoo.net.session.model.Session;
import com.zfoo.protocol.util.JsonUtils;
import com.zfoo.protocol.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author jaysunxiao
 * @version 3.0
 */
@Component
public class GatewayProviderController {

    private static final Logger logger = LoggerFactory.getLogger(GatewayProviderController.class);

    @PacketReceiver
    public void atGatewayToProviderRequest(Session session, GatewayToProviderRequest request, GatewayAttachment gatewayAttachment) {
        logger.info("provider receive [packet:{}] from client", JsonUtils.object2String(request));

        var response = new GatewayToProviderResponse();
        response.setMessage(StringUtils.format("Hello, this is the [provider:{}] response!", NetContext.getConfigManager().getLocalConfig().toLocalRegisterVO().toString()));

        NetContext.getRouter().send(session, response, gatewayAttachment);
    }

    @PacketReceiver
    public void atVerifyAccountRequest(Session session, VerifyAccountRequest request, GatewayAttachment gatewayAttachment) {
        //logger.info("provider receive [packet:{}] from client", JsonUtils.object2String(request.getMessageBuilder()));

        logger.info("provider receive [protopacket:{}] from client", request.getMessageBuilder().getAccount().getDeviceToken());
        var response = new VerifyAccountResponse();
        response.getMessageBuilder().setRetCode(1122334);

        NetContext.getRouter().send(session, response, gatewayAttachment);
    }

    @PacketReceiver
    public void atVARequest(Session session, VARequest request, GatewayAttachment gatewayAttachment) {
        //logger.info("provider receive [packet:{}] from client", JsonUtils.object2String(request.getMessageBuilder()));

        logger.info("provider receive [protopacket:{}] from client", request.getMessage());
        var response = new VAResponse();
        response.setMessage("va test done");

        NetContext.getRouter().send(session, response, gatewayAttachment);
    }

}
