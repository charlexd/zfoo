#ifndef ZFOO_SIMPLEOBJECT_H
#define ZFOO_SIMPLEOBJECT_H

#include "cppProtocol/ByteBuffer.h"

namespace zfoo {

    // @author jaysunxiao
    // @version 3.0
    class SimpleObject : public IPacket {
    public:
        int32_t c;
        bool g;

        ~SimpleObject() override = default;

        static SimpleObject valueOf(int32_t c, bool g) {
            auto packet = SimpleObject();
            packet.c = c;
            packet.g = g;
            return packet;
        }

        int16_t protocolId() override {
            return 104;
        }

        bool operator<(const SimpleObject &_) const {
            if (c < _.c) { return true; }
            if (_.c < c) { return false; }
            if (g < _.g) { return true; }
            if (_.g < g) { return false; }
            return false;
        }
    };


    class SimpleObjectRegistration : public IProtocolRegistration {
    public:
        int16_t protocolId() override {
            return 104;
        }

        void write(ByteBuffer &buffer, IPacket *packet) override {
            if (buffer.writePacketFlag(packet)) {
                return;
            }
            auto *message = (SimpleObject *) packet;
            buffer.writeInt(message->c);
            buffer.writeBool(message->g);
        }

        IPacket *read(ByteBuffer &buffer) override {
            auto *packet = new SimpleObject();
            if (!buffer.readBool()) {
                return packet;
            }
            int32_t result0 = buffer.readInt();
            packet->c = result0;
            bool result1 = buffer.readBool();
            packet->g = result1;
            return packet;
        }
    };
}

#endif
