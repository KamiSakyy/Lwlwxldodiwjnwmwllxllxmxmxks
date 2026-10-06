package com.github.rudroid.commits;

import com.github.rudroid.commits.CommitsType;
import com.google.android.gms.internal.measurement.d5;
import k81.c1Shadow;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class CommitsType$RefComparison$$serializer implements k81.d0 {
    public static final int $stable;
    public static final CommitsType$RefComparison$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommitsType$RefComparison$$serializer commitsType$RefComparison$$serializer = new CommitsType$RefComparison$$serializer();
        INSTANCE = commitsType$RefComparison$$serializer;
        e1 e1Var = new e1("com.github.rudroid.commits.CommitsType.RefComparison", commitsType$RefComparison$$serializer, 4);
        e1Var.l("owner", false);
        e1Var.l("name", false);
        e1Var.l("baseRefName", false);
        e1Var.l("headRefName", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private CommitsType$RefComparison$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CommitsType.RefComparison m20deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = true;
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
            } else if (t10 == 2) {
                str3 = b10.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (t10 != 3) {
                    throw new UnknownFieldException(t10);
                }
                str4 = b10.r(serialDescriptor, 3);
                i |= 8;
            }
        }
        b10.g(serialDescriptor);
        return new CommitsType.RefComparison(i, str, str2, str3, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CommitsType.RefComparison refComparison) {
        k71.k.g(encoder, "encoder");
        k71.k.g(refComparison, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, refComparison.f9164s);
        b10.J(serialDescriptor, 1, refComparison.f9165t);
        b10.J(serialDescriptor, 2, refComparison.f9166u);
        b10.J(serialDescriptor, 3, refComparison.f9167v);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
