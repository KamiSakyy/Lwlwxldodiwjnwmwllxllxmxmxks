package com.github.rudroid.projects.navigation;

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
public final /* synthetic */ class OwnerProjectsRoute$$serializer implements d0 {
    public static final int $stable;
    public static final OwnerProjectsRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OwnerProjectsRoute$$serializer ownerProjectsRoute$$serializer = new OwnerProjectsRoute$$serializer();
        INSTANCE = ownerProjectsRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.projects.navigation.OwnerProjectsRoute", ownerProjectsRoute$$serializer, 1);
        e1Var.l("userOrOrgLogin", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private OwnerProjectsRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final OwnerProjectsRoute m50deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else {
                if (t10 != 0) {
                    throw new UnknownFieldException(t10);
                }
                str = b10.r(serialDescriptor, 0);
                i = 1;
            }
        }
        b10.g(serialDescriptor);
        return new OwnerProjectsRoute(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, OwnerProjectsRoute ownerProjectsRoute) {
        k.g(encoder, "encoder");
        k.g(ownerProjectsRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, ownerProjectsRoute.f17754r);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
