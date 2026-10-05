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
public final /* synthetic */ class AgentAiModelResponse$$serializer implements d0 {
    public static final AgentAiModelResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentAiModelResponse$$serializer agentAiModelResponse$$serializer = new AgentAiModelResponse$$serializer();
        INSTANCE = agentAiModelResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AgentAiModelResponse", agentAiModelResponse$$serializer, 12);
        e1Var.l("auto", true);
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
        e1Var.l("preview", true);
        descriptor = e1Var;
    }

    private AgentAiModelResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = AgentAiModelResponse.m;
        g gVar = g.a;
        q1 q1Var = q1.a;
        return new KSerializer[]{gVar, q1Var, q1Var, q1Var, gVar, hVarArr[5].getValue(), AiModelCapabilitiesResponse$$serializer.INSTANCE, a.z(AiModelSupportsResponse$$serializer.INSTANCE), a.z(AiModelPolicyResponse$$serializer.INSTANCE), a.z(AiModelBillingResponse$$serializer.INSTANCE), gVar, gVar};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentAiModelResponse m94deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = AgentAiModelResponse.m;
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
                    z = b.p(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.p(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    eVar = (e) b.A(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), eVar);
                    i |= 32;
                    break;
                case 6:
                    aiModelCapabilitiesResponse = (AiModelCapabilitiesResponse) b.A(serialDescriptor, 6, AiModelCapabilitiesResponse$$serializer.INSTANCE, aiModelCapabilitiesResponse);
                    i |= 64;
                    break;
                case 7:
                    aiModelSupportsResponse = (AiModelSupportsResponse) b.x(serialDescriptor, 7, AiModelSupportsResponse$$serializer.INSTANCE, aiModelSupportsResponse);
                    i |= 128;
                    break;
                case 8:
                    aiModelPolicyResponse = (AiModelPolicyResponse) b.x(serialDescriptor, 8, AiModelPolicyResponse$$serializer.INSTANCE, aiModelPolicyResponse);
                    i |= 256;
                    break;
                case 9:
                    aiModelBillingResponse = (AiModelBillingResponse) b.x(serialDescriptor, 9, AiModelBillingResponse$$serializer.INSTANCE, aiModelBillingResponse);
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
        return new AgentAiModelResponse(i, aiModelBillingResponse, aiModelCapabilitiesResponse, aiModelPolicyResponse, aiModelSupportsResponse, eVar, str, str2, str3, z, z2, z3, z4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AgentAiModelResponse agentAiModelResponse) {
        k.g(encoder, "encoder");
        k.g(agentAiModelResponse, "value");
        e eVar = agentAiModelResponse.f;
        boolean z = agentAiModelResponse.e;
        String str = agentAiModelResponse.d;
        String str2 = agentAiModelResponse.c;
        String str3 = agentAiModelResponse.b;
        boolean z2 = agentAiModelResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = AgentAiModelResponse.m;
        if (b.X(serialDescriptor) || z2) {
            b.C(serialDescriptor, 0, z2);
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
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 4, z);
        }
        if (b.X(serialDescriptor) || eVar != e.s) {
            b.I(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), eVar);
        }
        AiModelCapabilitiesResponse$$serializer aiModelCapabilitiesResponse$$serializer = AiModelCapabilitiesResponse$$serializer.INSTANCE;
        AiModelCapabilitiesResponse aiModelCapabilitiesResponse = agentAiModelResponse.g;
        boolean z3 = agentAiModelResponse.l;
        AiModelBillingResponse aiModelBillingResponse = agentAiModelResponse.j;
        AiModelPolicyResponse aiModelPolicyResponse = agentAiModelResponse.i;
        AiModelSupportsResponse aiModelSupportsResponse = agentAiModelResponse.h;
        b.I(serialDescriptor, 6, aiModelCapabilitiesResponse$$serializer, aiModelCapabilitiesResponse);
        if (b.X(serialDescriptor) || aiModelSupportsResponse != null) {
            b.H(serialDescriptor, 7, AiModelSupportsResponse$$serializer.INSTANCE, aiModelSupportsResponse);
        }
        if (b.X(serialDescriptor) || aiModelPolicyResponse != null) {
            b.H(serialDescriptor, 8, AiModelPolicyResponse$$serializer.INSTANCE, aiModelPolicyResponse);
        }
        if (b.X(serialDescriptor) || aiModelBillingResponse != null) {
            b.H(serialDescriptor, 9, AiModelBillingResponse$$serializer.INSTANCE, aiModelBillingResponse);
        }
        b.C(serialDescriptor, 10, agentAiModelResponse.k);
        if (b.X(serialDescriptor) || z3) {
            b.C(serialDescriptor, 11, z3);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
