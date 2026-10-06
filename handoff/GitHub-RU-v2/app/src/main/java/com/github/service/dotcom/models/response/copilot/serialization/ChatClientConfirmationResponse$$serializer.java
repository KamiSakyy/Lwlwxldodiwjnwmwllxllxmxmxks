package com.github.service.dotcom.models.response.copilot.serialization;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l81.t;
import w61.h;
import x61.s;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ChatClientConfirmationResponse$$serializer implements d0 {
    public static final ChatClientConfirmationResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatClientConfirmationResponse$$serializer chatClientConfirmationResponse$$serializer = new ChatClientConfirmationResponse$$serializer();
        INSTANCE = chatClientConfirmationResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.serialization.ChatClientConfirmationResponse", chatClientConfirmationResponse$$serializer, 2);
        e1Var.l("state", true);
        e1Var.l("confirmation", true);
        descriptor = e1Var;
    }

    private ChatClientConfirmationResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ChatClientConfirmationResponse.c[0].getValue(), t.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatClientConfirmationResponse m116deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ChatClientConfirmationResponse.c;
        hz.a aVar = null;
        boolean z = true;
        int i = 0;
        kotlinx.serialization.json.c cVar = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                aVar = (hz.a) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), aVar);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                cVar = (kotlinx.serialization.json.c) b.A(serialDescriptor, 1, t.a, cVar);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new ChatClientConfirmationResponse(i, aVar, cVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatClientConfirmationResponse chatClientConfirmationResponse) {
        k.g(encoder, "encoder");
        k.g(chatClientConfirmationResponse, "value");
        kotlinx.serialization.json.c cVar = chatClientConfirmationResponse.b;
        hz.a aVar = chatClientConfirmationResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ChatClientConfirmationResponse.c;
        if (b.X(serialDescriptor) || aVar != hz.a.t) {
            b.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), aVar);
        }
        if (b.X(serialDescriptor) || !k.b(cVar, new kotlinx.serialization.json.c(s.r))) {
            b.I(serialDescriptor, 1, t.a, cVar);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
