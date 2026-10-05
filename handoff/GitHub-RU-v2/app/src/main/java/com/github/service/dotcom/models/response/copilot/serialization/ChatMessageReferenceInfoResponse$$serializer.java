package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceInfoResponse;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ChatMessageReferenceInfoResponse$$serializer implements d0 {
    public static final ChatMessageReferenceInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatMessageReferenceInfoResponse$$serializer chatMessageReferenceInfoResponse$$serializer = new ChatMessageReferenceInfoResponse$$serializer();
        INSTANCE = chatMessageReferenceInfoResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceInfoResponse", chatMessageReferenceInfoResponse$$serializer, 2);
        e1Var.l("name", true);
        e1Var.l("type", true);
        descriptor = e1Var;
    }

    private ChatMessageReferenceInfoResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatMessageReferenceInfoResponse m119deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new ChatMessageReferenceInfoResponse(str, i, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatMessageReferenceInfoResponse chatMessageReferenceInfoResponse) {
        k.g(encoder, "encoder");
        k.g(chatMessageReferenceInfoResponse, "value");
        String str = chatMessageReferenceInfoResponse.b;
        String str2 = chatMessageReferenceInfoResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        ChatMessageReferenceInfoResponse.Companion companion = ChatMessageReferenceInfoResponse.Companion;
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 0, str2);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 1, str);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
