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
public final /* synthetic */ class OwnerProjectsEntryPointRoute$$serializer implements d0 {
    public static final int $stable;
    public static final OwnerProjectsEntryPointRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OwnerProjectsEntryPointRoute$$serializer ownerProjectsEntryPointRoute$$serializer = new OwnerProjectsEntryPointRoute$$serializer();
        INSTANCE = ownerProjectsEntryPointRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.projects.navigation.OwnerProjectsEntryPointRoute", ownerProjectsEntryPointRoute$$serializer, 1);
        e1Var.l("userOrOrgLogin", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private OwnerProjectsEntryPointRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final OwnerProjectsEntryPointRoute m49deserialize(Decoder decoder) {
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
        return new OwnerProjectsEntryPointRoute(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, OwnerProjectsEntryPointRoute ownerProjectsEntryPointRoute) {
        k.g(encoder, "encoder");
        k.g(ownerProjectsEntryPointRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, ownerProjectsEntryPointRoute.f17753r);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
