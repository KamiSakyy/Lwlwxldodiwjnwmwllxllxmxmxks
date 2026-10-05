package com.github.service.dotcom.models.response.copilot.serialization;

import com.google.android.gms.internal.measurement.d5;
import java.util.List;
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
import w61.h;
import x61.r;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ChatThreadResponse$$serializer implements d0 {
    public static final ChatThreadResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatThreadResponse$$serializer chatThreadResponse$$serializer = new ChatThreadResponse$$serializer();
        INSTANCE = chatThreadResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.serialization.ChatThreadResponse", chatThreadResponse$$serializer, 5);
        e1Var.l("id", true);
        e1Var.l("name", true);
        e1Var.l("updatedAt", true);
        e1Var.l("createdAt", true);
        e1Var.l("currentReferences", true);
        descriptor = e1Var;
    }

    private ChatThreadResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ChatThreadResponse.f;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, q1Var, hVarArr[4].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatThreadResponse m132deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ChatThreadResponse.f;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str3 = b.r(serialDescriptor, 2);
                i |= 4;
            } else if (t == 3) {
                str4 = b.r(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                list = (List) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new ChatThreadResponse(i, str, str2, str3, str4, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatThreadResponse chatThreadResponse) {
        k.g(encoder, "encoder");
        k.g(chatThreadResponse, "value");
        List list = chatThreadResponse.e;
        String str = chatThreadResponse.d;
        String str2 = chatThreadResponse.c;
        String str3 = chatThreadResponse.b;
        String str4 = chatThreadResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ChatThreadResponse.f;
        if (b.X(serialDescriptor) || !k.b(str4, "")) {
            b.J(serialDescriptor, 0, str4);
        }
        if (b.X(serialDescriptor) || !k.b(str3, "")) {
            b.J(serialDescriptor, 1, str3);
        }
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 2, str2);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 3, str);
        }
        if (b.X(serialDescriptor) || !k.b(list, r.r)) {
            b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), list);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
