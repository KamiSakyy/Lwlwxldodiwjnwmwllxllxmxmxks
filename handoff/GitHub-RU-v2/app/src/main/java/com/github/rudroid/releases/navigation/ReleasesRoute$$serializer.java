package com.github.rudroid.releases.navigation;

import com.google.android.gms.internal.measurement.d5;
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

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class ReleasesRoute$$serializer implements d0 {
    public static final int $stable;
    public static final ReleasesRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReleasesRoute$$serializer releasesRoute$$serializer = new ReleasesRoute$$serializer();
        INSTANCE = releasesRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.releases.navigation.ReleasesRoute", releasesRoute$$serializer, 2);
        e1Var.l("repositoryOwner", false);
        e1Var.l("repositoryName", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private ReleasesRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ReleasesRoute m60deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        String str2 = null;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                str = b10.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t10 != 1) {
                    throw new UnknownFieldException(t10);
                }
                str2 = b10.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        b10.g(serialDescriptor);
        return new ReleasesRoute(str, i, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ReleasesRoute releasesRoute) {
        k.g(encoder, "encoder");
        k.g(releasesRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, releasesRoute.f18933r);
        b10.J(serialDescriptor, 1, releasesRoute.f18934s);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
