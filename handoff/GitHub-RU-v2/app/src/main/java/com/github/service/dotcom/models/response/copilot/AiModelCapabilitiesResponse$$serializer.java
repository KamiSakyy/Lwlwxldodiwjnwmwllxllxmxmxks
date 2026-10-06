package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import gz.b;
import j81.a;
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
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AiModelCapabilitiesResponse$$serializer implements d0 {
    public static final AiModelCapabilitiesResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AiModelCapabilitiesResponse$$serializer aiModelCapabilitiesResponse$$serializer = new AiModelCapabilitiesResponse$$serializer();
        INSTANCE = aiModelCapabilitiesResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AiModelCapabilitiesResponse", aiModelCapabilitiesResponse$$serializer, 2);
        e1Var.l("type", true);
        e1Var.l("family", true);
        descriptor = e1Var;
    }

    private AiModelCapabilitiesResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AiModelCapabilitiesResponse.c[0].getValue(), q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AiModelCapabilitiesResponse m104deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        h[] hVarArr = AiModelCapabilitiesResponse.c;
        b bVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                bVar = (b) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), bVar);
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
        return new AiModelCapabilitiesResponse(i, bVar, str);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AiModelCapabilitiesResponse aiModelCapabilitiesResponse) {
        k.g(encoder, "encoder");
        k.g(aiModelCapabilitiesResponse, "value");
        String str = aiModelCapabilitiesResponse.b;
        b bVar = aiModelCapabilitiesResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = AiModelCapabilitiesResponse.c;
        if (b.X(serialDescriptor) || bVar != b.s) {
            b.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), bVar);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 1, str);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
