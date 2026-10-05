package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import gz.e;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.g;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m71.a;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ChatAiModelResponse$$serializer implements d0 {
    public static final ChatAiModelResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatAiModelResponse$$serializer chatAiModelResponse$$serializer = new ChatAiModelResponse$$serializer();
        INSTANCE = chatAiModelResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.ChatAiModelResponse", chatAiModelResponse$$serializer, 12);
        e1Var.l("name", true);
        e1Var.l("id", true);
        e1Var.l("vendor", true);
        e1Var.l("model_picker_enabled", true);
        e1Var.l("model_picker_category", true);
        e1Var.l("capabilities", false);
        e1Var.l("supports", true);
        e1Var.l("policy", true);
        e1Var.l("billing", true);
        e1Var.l("is_chat_default", false);
        e1Var.l("is_chat_fallback", false);
        e1Var.l("preview", true);
        descriptor = e1Var;
    }

    private ChatAiModelResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ChatAiModelResponse.m;
        q1 q1Var = q1.a;
        g gVar = g.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, gVar, hVarArr[4].getValue(), AiModelCapabilitiesResponse$$serializer.INSTANCE, a.z(AiModelSupportsResponse$$serializer.INSTANCE), a.z(AiModelPolicyResponse$$serializer.INSTANCE), a.z(AiModelBillingResponse$$serializer.INSTANCE), gVar, gVar, gVar};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ChatAiModelResponse m109deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ChatAiModelResponse.m;
        AiModelBillingResponse aiModelBillingResponse = null;
        AiModelCapabilitiesResponse aiModelCapabilitiesResponse = null;
        AiModelPolicyResponse aiModelPolicyResponse = null;
        AiModelSupportsResponse aiModelSupportsResponse = null;
        e eVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = true;
        while (z5) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z5 = false;
                    break;
                case 0:
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z = b.p(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    eVar = (e) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), eVar);
                    i |= 16;
                    break;
                case 5:
                    aiModelCapabilitiesResponse = (AiModelCapabilitiesResponse) b.A(serialDescriptor, 5, AiModelCapabilitiesResponse$$serializer.INSTANCE, aiModelCapabilitiesResponse);
                    i |= 32;
                    break;
                case 6:
                    aiModelSupportsResponse = (AiModelSupportsResponse) b.x(serialDescriptor, 6, AiModelSupportsResponse$$serializer.INSTANCE, aiModelSupportsResponse);
                    i |= 64;
                    break;
                case 7:
                    aiModelPolicyResponse = (AiModelPolicyResponse) b.x(serialDescriptor, 7, AiModelPolicyResponse$$serializer.INSTANCE, aiModelPolicyResponse);
                    i |= 128;
                    break;
                case 8:
                    aiModelBillingResponse = (AiModelBillingResponse) b.x(serialDescriptor, 8, AiModelBillingResponse$$serializer.INSTANCE, aiModelBillingResponse);
                    i |= 256;
                    break;
                case 9:
                    z2 = b.p(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    z3 = b.p(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    z4 = b.p(serialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new ChatAiModelResponse(i, aiModelBillingResponse, aiModelCapabilitiesResponse, aiModelPolicyResponse, aiModelSupportsResponse, eVar, str, str2, str3, z, z2, z3, z4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ChatAiModelResponse chatAiModelResponse) {
        k.g(encoder, "encoder");
        k.g(chatAiModelResponse, "value");
        e eVar = chatAiModelResponse.e;
        boolean z = chatAiModelResponse.d;
        String str = chatAiModelResponse.c;
        String str2 = chatAiModelResponse.b;
        String str3 = chatAiModelResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ChatAiModelResponse.m;
        if (b.X(serialDescriptor) || !k.b(str3, "")) {
            b.J(serialDescriptor, 0, str3);
        }
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 1, str2);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 2, str);
        }
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 3, z);
        }
        if (b.X(serialDescriptor) || eVar != e.s) {
            b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), eVar);
        }
        AiModelCapabilitiesResponse$$serializer aiModelCapabilitiesResponse$$serializer = AiModelCapabilitiesResponse$$serializer.INSTANCE;
        AiModelCapabilitiesResponse aiModelCapabilitiesResponse = chatAiModelResponse.f;
        boolean z2 = chatAiModelResponse.l;
        AiModelBillingResponse aiModelBillingResponse = chatAiModelResponse.i;
        AiModelPolicyResponse aiModelPolicyResponse = chatAiModelResponse.h;
        AiModelSupportsResponse aiModelSupportsResponse = chatAiModelResponse.g;
        b.I(serialDescriptor, 5, aiModelCapabilitiesResponse$$serializer, aiModelCapabilitiesResponse);
        if (b.X(serialDescriptor) || aiModelSupportsResponse != null) {
            b.H(serialDescriptor, 6, AiModelSupportsResponse$$serializer.INSTANCE, aiModelSupportsResponse);
        }
        if (b.X(serialDescriptor) || aiModelPolicyResponse != null) {
            b.H(serialDescriptor, 7, AiModelPolicyResponse$$serializer.INSTANCE, aiModelPolicyResponse);
        }
        if (b.X(serialDescriptor) || aiModelBillingResponse != null) {
            b.H(serialDescriptor, 8, AiModelBillingResponse$$serializer.INSTANCE, aiModelBillingResponse);
        }
        b.C(serialDescriptor, 9, chatAiModelResponse.j);
        b.C(serialDescriptor, 10, chatAiModelResponse.k);
        if (b.X(serialDescriptor) || z2) {
            b.C(serialDescriptor, 11, z2);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
