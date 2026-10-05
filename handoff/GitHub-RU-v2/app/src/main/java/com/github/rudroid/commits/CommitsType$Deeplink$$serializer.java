package com.github.rudroid.commits;

import com.github.rudroid.commits.CommitsType;
import com.google.android.gms.internal.measurement.d5;
import k81.c1;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class CommitsType$Deeplink$$serializer implements k81.d0 {
    public static final int $stable;
    public static final CommitsType$Deeplink$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommitsType$Deeplink$$serializer commitsType$Deeplink$$serializer = new CommitsType$Deeplink$$serializer();
        INSTANCE = commitsType$Deeplink$$serializer;
        e1 e1Var = new e1("com.github.rudroid.commits.CommitsType.Deeplink", commitsType$Deeplink$$serializer, 3);
        e1Var.l("owner", false);
        e1Var.l("name", false);
        e1Var.l("pullRequestNumber", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private CommitsType$Deeplink$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, k81.l0.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CommitsType.Deeplink m18deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        int i10 = 0;
        String str2 = null;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                str = b10.r(serialDescriptor, 0);
                i |= 1;
            } else if (t10 == 1) {
                str2 = b10.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t10 != 2) {
                    throw new UnknownFieldException(t10);
                }
                i10 = b10.m(serialDescriptor, 2);
                i |= 4;
            }
        }
        b10.g(serialDescriptor);
        return new CommitsType.Deeplink(i, i10, str, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CommitsType.Deeplink deeplink) {
        k71.k.g(encoder, "encoder");
        k71.k.g(deeplink, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, deeplink.f9157s);
        b10.J(serialDescriptor, 1, deeplink.f9158t);
        b10.F(2, deeplink.f9159u, serialDescriptor);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
