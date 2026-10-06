package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
import k81.r0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ChatAgentResponse$$serializer implements d0 {
    public static final ChatAgentResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatAgentResponse$$serializer chatAgentResponse$$serializer = new ChatAgentResponse$$serializer();
        INSTANCE = chatAgentResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.ChatAgentResponse", chatAgentResponse$$serializer, 5);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("avatar_url", false);
        e1Var.l("slug", false);
        e1Var.l("url", false);
        descriptor = e1Var;
    }

    private ChatAgentResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{r0.a, q1Var, q1Var, q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatAgentResponse m107deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str2 = b.r(serialDescriptor, 2);
                i |= 4;
            } else if (t == 3) {
                str3 = b.r(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                str4 = b.r(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new ChatAgentResponse(i, j, str, str2, str3, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatAgentResponse chatAgentResponse) {
        k.g(encoder, "encoder");
        k.g(chatAgentResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.G(serialDescriptor, 0, chatAgentResponse.a);
        b.J(serialDescriptor, 1, chatAgentResponse.b);
        b.J(serialDescriptor, 2, chatAgentResponse.c);
        b.J(serialDescriptor, 3, chatAgentResponse.d);
        b.J(serialDescriptor, 4, chatAgentResponse.e);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
