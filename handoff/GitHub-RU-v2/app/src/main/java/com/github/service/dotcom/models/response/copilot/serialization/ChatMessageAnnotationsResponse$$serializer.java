package com.github.service.dotcom.models.response.copilot.serialization;

import com.google.android.gms.internal.measurement.d5;
import java.util.List;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.h;
import x61.r;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ChatMessageAnnotationsResponse$$serializer implements d0 {
    public static final ChatMessageAnnotationsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatMessageAnnotationsResponse$$serializer chatMessageAnnotationsResponse$$serializer = new ChatMessageAnnotationsResponse$$serializer();
        INSTANCE = chatMessageAnnotationsResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageAnnotationsResponse", chatMessageAnnotationsResponse$$serializer, 1);
        e1Var.l("CodeVulnerability", true);
        descriptor = e1Var;
    }

    private ChatMessageAnnotationsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ChatMessageAnnotationsResponse.b[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatMessageAnnotationsResponse m117deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ChatMessageAnnotationsResponse.b;
        List list = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else {
                if (t != 0) {
                    throw new UnknownFieldException(t);
                }
                list = (List) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), list);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        return new ChatMessageAnnotationsResponse(i, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatMessageAnnotationsResponse chatMessageAnnotationsResponse) {
        k.g(encoder, "encoder");
        k.g(chatMessageAnnotationsResponse, "value");
        List list = chatMessageAnnotationsResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ChatMessageAnnotationsResponse.b;
        if (b.X(serialDescriptor) || !k.b(list, r.r)) {
            b.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), list);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
