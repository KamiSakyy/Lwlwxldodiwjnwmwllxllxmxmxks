package com.github.service.dotcom.models.response.copilot.serialization;

import com.google.android.gms.internal.measurement.d5;
import hz.i;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
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
public final /* synthetic */ class ChatServerSentEventDataResponse$AgentConfirmation$$serializer implements d0 {
    public static final ChatServerSentEventDataResponse$AgentConfirmation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatServerSentEventDataResponse$AgentConfirmation$$serializer chatServerSentEventDataResponse$AgentConfirmation$$serializer = new ChatServerSentEventDataResponse$AgentConfirmation$$serializer();
        INSTANCE = chatServerSentEventDataResponse$AgentConfirmation$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataResponse.AgentConfirmation", chatServerSentEventDataResponse$AgentConfirmation$$serializer, 4);
        e1Var.l("type", true);
        e1Var.l("title", true);
        e1Var.l("message", true);
        e1Var.l("confirmation", true);
        descriptor = e1Var;
    }

    private ChatServerSentEventDataResponse$AgentConfirmation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{ChatServerSentEventDataResponse$AgentConfirmation.e[0].getValue(), q1Var, q1Var, t.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatServerSentEventDataResponse$AgentConfirmation m125deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ChatServerSentEventDataResponse$AgentConfirmation.e;
        int i = 0;
        i iVar = null;
        String str = null;
        String str2 = null;
        kotlinx.serialization.json.c cVar = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                iVar = (i) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), iVar);
                i |= 1;
            } else if (t == 1) {
                str = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str2 = b.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                cVar = (kotlinx.serialization.json.c) b.A(serialDescriptor, 3, t.a, cVar);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new ChatServerSentEventDataResponse$AgentConfirmation(i, iVar, str, str2, cVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatServerSentEventDataResponse$AgentConfirmation chatServerSentEventDataResponse$AgentConfirmation) {
        k.g(encoder, "encoder");
        k.g(chatServerSentEventDataResponse$AgentConfirmation, "value");
        kotlinx.serialization.json.c cVar = chatServerSentEventDataResponse$AgentConfirmation.d;
        String str = chatServerSentEventDataResponse$AgentConfirmation.c;
        String str2 = chatServerSentEventDataResponse$AgentConfirmation.b;
        i iVar = chatServerSentEventDataResponse$AgentConfirmation.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ChatServerSentEventDataResponse$AgentConfirmation.e;
        if (b.X(serialDescriptor) || iVar != i.t) {
            b.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), iVar);
        }
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 1, str2);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 2, str);
        }
        if (b.X(serialDescriptor) || !k.b(cVar, new kotlinx.serialization.json.c(s.r))) {
            b.I(serialDescriptor, 3, t.a, cVar);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
