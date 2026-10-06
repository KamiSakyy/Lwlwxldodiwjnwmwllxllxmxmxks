package com.github.service.dotcom.models.response.copilot.serialization;

import com.google.android.gms.internal.measurement.d5;
import java.util.List;
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
import w61.h;
import x61.rShadow;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ChatMessageResponse$$serializer implements d0 {
    public static final ChatMessageResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatMessageResponse$$serializer chatMessageResponse$$serializer = new ChatMessageResponse$$serializer();
        INSTANCE = chatMessageResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageResponse", chatMessageResponse$$serializer, 10);
        e1Var.l("id", true);
        e1Var.l("threadID", true);
        e1Var.l("content", true);
        e1Var.l("role", true);
        e1Var.l("references", true);
        e1Var.l("copilotAnnotations", true);
        e1Var.l("createdAt", true);
        e1Var.l("confirmations", true);
        e1Var.l("clientConfirmations", true);
        e1Var.l("skillExecutions", true);
        descriptor = e1Var;
    }

    private ChatMessageResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ChatMessageResponse.k;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, hVarArr[3].getValue(), hVarArr[4].getValue(), ChatMessageAnnotationsResponse$$serializer.INSTANCE, q1Var, hVarArr[7].getValue(), hVarArr[8].getValue(), hVarArr[9].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatMessageResponse m124deserialize(Decoder decoder) {
        h[] hVarArr;
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr2 = ChatMessageResponse.k;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        hz.h hVar = null;
        List list3 = null;
        ChatMessageAnnotationsResponse chatMessageAnnotationsResponse = null;
        String str4 = null;
        List list4 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    hVarArr = hVarArr2;
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    hVarArr = hVarArr2;
                    str2 = b.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    hVarArr = hVarArr2;
                    str3 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    hVarArr = hVarArr2;
                    hVar = (hz.h) b.A(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), hVar);
                    i |= 8;
                    break;
                case 4:
                    hVarArr = hVarArr2;
                    list3 = (List) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    hVarArr = hVarArr2;
                    chatMessageAnnotationsResponse = (ChatMessageAnnotationsResponse) b.A(serialDescriptor, 5, ChatMessageAnnotationsResponse$$serializer.INSTANCE, chatMessageAnnotationsResponse);
                    i |= 32;
                    break;
                case 6:
                    hVarArr = hVarArr2;
                    str4 = b.r(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    hVarArr = hVarArr2;
                    list4 = (List) b.A(serialDescriptor, 7, (KSerializer) hVarArr[7].getValue(), list4);
                    i |= 128;
                    break;
                case 8:
                    hVarArr = hVarArr2;
                    list = (List) b.A(serialDescriptor, 8, (KSerializer) hVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    hVarArr = hVarArr2;
                    list2 = (List) b.A(serialDescriptor, 9, (KSerializer) hVarArr2[9].getValue(), list2);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
            hVarArr2 = hVarArr;
        }
        b.g(serialDescriptor);
        return new ChatMessageResponse(i, str, str2, str3, hVar, list3, chatMessageAnnotationsResponse, str4, list4, list, list2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatMessageResponse chatMessageResponse) {
        k.g(encoder, "encoder");
        k.g(chatMessageResponse, "value");
        List list = chatMessageResponse.j;
        List list2 = chatMessageResponse.i;
        List list3 = chatMessageResponse.h;
        String str = chatMessageResponse.g;
        ChatMessageAnnotationsResponse chatMessageAnnotationsResponse = chatMessageResponse.f;
        List list4 = chatMessageResponse.e;
        hz.h hVar = chatMessageResponse.d;
        String str2 = chatMessageResponse.c;
        String str3 = chatMessageResponse.b;
        String str4 = chatMessageResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ChatMessageResponse.k;
        if (b.X(serialDescriptor) || !k.b(str4, "")) {
            b.J(serialDescriptor, 0, str4);
        }
        if (b.X(serialDescriptor) || !k.b(str3, "")) {
            b.J(serialDescriptor, 1, str3);
        }
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 2, str2);
        }
        if (b.X(serialDescriptor) || hVar != hz.h.t) {
            b.I(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), hVar);
        }
        boolean X = b.X(serialDescriptor);
        rShadow rVar = rShadow.r;
        if (X || !k.b(list4, rVar)) {
            b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), list4);
        }
        if (b.X(serialDescriptor) || !k.b(chatMessageAnnotationsResponse, new ChatMessageAnnotationsResponse())) {
            b.I(serialDescriptor, 5, ChatMessageAnnotationsResponse$$serializer.INSTANCE, chatMessageAnnotationsResponse);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 6, str);
        }
        if (b.X(serialDescriptor) || !k.b(list3, rVar)) {
            b.I(serialDescriptor, 7, (KSerializer) hVarArr[7].getValue(), list3);
        }
        if (b.X(serialDescriptor) || !k.b(list2, rVar)) {
            b.I(serialDescriptor, 8, (KSerializer) hVarArr[8].getValue(), list2);
        }
        if (b.X(serialDescriptor) || !k.b(list, rVar)) {
            b.I(serialDescriptor, 9, (KSerializer) hVarArr[9].getValue(), list);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
