package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
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
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AiModelPolicyResponse$$serializer implements d0 {
    public static final AiModelPolicyResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AiModelPolicyResponse$$serializer aiModelPolicyResponse$$serializer = new AiModelPolicyResponse$$serializer();
        INSTANCE = aiModelPolicyResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AiModelPolicyResponse", aiModelPolicyResponse$$serializer, 2);
        e1Var.l("state", true);
        e1Var.l("terms", true);
        descriptor = e1Var;
    }

    private AiModelPolicyResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AiModelPolicyResponse.c[0].getValue(), q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AiModelPolicyResponse m105deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        h[] hVarArr = AiModelPolicyResponse.c;
        gz.c cVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                cVar = (gz.c) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), cVar);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                str = b.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new AiModelPolicyResponse(i, cVar, str);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AiModelPolicyResponse aiModelPolicyResponse) {
        k.g(encoder, "encoder");
        k.g(aiModelPolicyResponse, "value");
        String str = aiModelPolicyResponse.b;
        gz.c cVar = aiModelPolicyResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = AiModelPolicyResponse.c;
        if (b.X(serialDescriptor) || cVar != gz.c.r) {
            b.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), cVar);
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
