package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AiModelSupportsResponse$$serializer implements d0 {
    public static final AiModelSupportsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AiModelSupportsResponse$$serializer aiModelSupportsResponse$$serializer = new AiModelSupportsResponse$$serializer();
        INSTANCE = aiModelSupportsResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AiModelSupportsResponse", aiModelSupportsResponse$$serializer, 1);
        e1Var.l("tool_calls", true);
        descriptor = e1Var;
    }

    private AiModelSupportsResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AiModelSupportsResponse m106deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else {
                if (t != 0) {
                    throw new UnknownFieldException(t);
                }
                z2 = b.p(serialDescriptor, 0);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        return new AiModelSupportsResponse(i, z2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AiModelSupportsResponse aiModelSupportsResponse) {
        k.g(encoder, "encoder");
        k.g(aiModelSupportsResponse, "value");
        boolean z = aiModelSupportsResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 0, z);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
