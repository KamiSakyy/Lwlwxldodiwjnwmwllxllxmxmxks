package com.github.rudroid.repository.model;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.g;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class PendingRepositoryInfo$$serializer implements d0 {
    public static final int $stable;
    public static final PendingRepositoryInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PendingRepositoryInfo$$serializer pendingRepositoryInfo$$serializer = new PendingRepositoryInfo$$serializer();
        INSTANCE = pendingRepositoryInfo$$serializer;
        e1 e1Var = new e1("com.github.rudroid.repository.model.PendingRepositoryInfo", pendingRepositoryInfo$$serializer, 3);
        e1Var.l("sourceRepositoryOwnerLogin", false);
        e1Var.l("sourceRepositoryName", false);
        e1Var.l("isTemplateClone", true);
        descriptor = e1Var;
        $stable = 8;
    }

    private PendingRepositoryInfo$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final PendingRepositoryInfo m66deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        String str = null;
        boolean z10 = true;
        int i = 0;
        boolean z11 = false;
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
                z11 = b10.p(serialDescriptor, 2);
                i |= 4;
            }
        }
        b10.g(serialDescriptor);
        return new PendingRepositoryInfo(i, str, str2, z11);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, PendingRepositoryInfo pendingRepositoryInfo) {
        k.g(encoder, "encoder");
        k.g(pendingRepositoryInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        String str = pendingRepositoryInfo.f19994r;
        boolean z10 = pendingRepositoryInfo.f19996t;
        b10.J(serialDescriptor, 0, str);
        b10.J(serialDescriptor, 1, pendingRepositoryInfo.f19995s);
        if (b10.X(serialDescriptor) || z10) {
            b10.C(serialDescriptor, 2, z10);
        }
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
