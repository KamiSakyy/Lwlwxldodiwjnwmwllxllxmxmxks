package com.github.service.dotcom.models.response.copilot.serialization;

import com.google.android.gms.internal.measurement.d5;
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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SkillExecutionResponse$$serializer implements d0 {
    public static final SkillExecutionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SkillExecutionResponse$$serializer skillExecutionResponse$$serializer = new SkillExecutionResponse$$serializer();
        INSTANCE = skillExecutionResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.serialization.SkillExecutionResponse", skillExecutionResponse$$serializer, 1);
        e1Var.l("slug", false);
        descriptor = e1Var;
    }

    private SkillExecutionResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SkillExecutionResponse m141deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
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
                str = b.r(serialDescriptor, 0);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        return new SkillExecutionResponse(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SkillExecutionResponse skillExecutionResponse) {
        k.g(encoder, "encoder");
        k.g(skillExecutionResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, skillExecutionResponse.a);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
