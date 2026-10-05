package com.github.rudroid.releases.navigation;

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

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class ReleaseRoute$$serializer implements d0 {
    public static final int $stable;
    public static final ReleaseRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReleaseRoute$$serializer releaseRoute$$serializer = new ReleaseRoute$$serializer();
        INSTANCE = releaseRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.releases.navigation.ReleaseRoute", releaseRoute$$serializer, 3);
        e1Var.l("repositoryOwner", false);
        e1Var.l("repositoryName", false);
        e1Var.l("tagName", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private ReleaseRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ReleaseRoute m59deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
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
                str3 = b10.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        b10.g(serialDescriptor);
        return new ReleaseRoute(i, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ReleaseRoute releaseRoute) {
        k.g(encoder, "encoder");
        k.g(releaseRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, releaseRoute.f18930r);
        b10.J(serialDescriptor, 1, releaseRoute.f18931s);
        b10.J(serialDescriptor, 2, releaseRoute.f18932t);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
