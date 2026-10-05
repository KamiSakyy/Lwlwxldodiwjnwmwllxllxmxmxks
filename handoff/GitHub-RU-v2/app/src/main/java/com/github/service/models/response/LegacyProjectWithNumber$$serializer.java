package com.github.service.models.response;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.l0;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class LegacyProjectWithNumber$$serializer implements d0 {
    public static final LegacyProjectWithNumber$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LegacyProjectWithNumber$$serializer legacyProjectWithNumber$$serializer = new LegacyProjectWithNumber$$serializer();
        INSTANCE = legacyProjectWithNumber$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.LegacyProjectWithNumber", legacyProjectWithNumber$$serializer, 4);
        e1Var.l("simpleLegacyProject", false);
        e1Var.l("number", false);
        e1Var.l("owner", false);
        e1Var.l("repository", true);
        descriptor = e1Var;
    }

    private LegacyProjectWithNumber$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        return new KSerializer[]{SimpleLegacyProject$$serializer.INSTANCE, l0.a, kSerializer, m71.a.z(kSerializer)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final LegacyProjectWithNumber m4deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        SimpleLegacyProject simpleLegacyProject = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                simpleLegacyProject = (SimpleLegacyProject) b.A(serialDescriptor, 0, SimpleLegacyProject$$serializer.INSTANCE, simpleLegacyProject);
                i |= 1;
            } else if (t == 1) {
                i2 = b.m(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str = b.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                str2 = (String) b.x(serialDescriptor, 3, q1.a, str2);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new LegacyProjectWithNumber(i, simpleLegacyProject, i2, str, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, LegacyProjectWithNumber legacyProjectWithNumber) {
        k.g(encoder, "encoder");
        k.g(legacyProjectWithNumber, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        SimpleLegacyProject$$serializer simpleLegacyProject$$serializer = SimpleLegacyProject$$serializer.INSTANCE;
        SimpleLegacyProject simpleLegacyProject = legacyProjectWithNumber.r;
        String str = legacyProjectWithNumber.u;
        b.I(serialDescriptor, 0, simpleLegacyProject$$serializer, simpleLegacyProject);
        b.F(1, legacyProjectWithNumber.s, serialDescriptor);
        b.J(serialDescriptor, 2, legacyProjectWithNumber.t);
        if (b.X(serialDescriptor) || str != null) {
            b.H(serialDescriptor, 3, q1.a, str);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
