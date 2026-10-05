package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.g;
import k81.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AiModelBillingResponse$$serializer implements d0 {
    public static final AiModelBillingResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AiModelBillingResponse$$serializer aiModelBillingResponse$$serializer = new AiModelBillingResponse$$serializer();
        INSTANCE = aiModelBillingResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AiModelBillingResponse", aiModelBillingResponse$$serializer, 2);
        e1Var.l("is_premium", true);
        e1Var.l("multiplier", true);
        descriptor = e1Var;
    }

    private AiModelBillingResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{g.a, v.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AiModelBillingResponse m103deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        double d = 0.0d;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                z2 = b.p(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                d = b.z(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new AiModelBillingResponse(i, z2, d);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AiModelBillingResponse aiModelBillingResponse) {
        k.g(encoder, "encoder");
        k.g(aiModelBillingResponse, "value");
        double d = aiModelBillingResponse.b;
        boolean z = aiModelBillingResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 0, z);
        }
        if (b.X(serialDescriptor) || Double.compare(d, 0.0d) != 0) {
            b.D(serialDescriptor, 1);
            b.d(d);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
