package com.github.rudroid.commits.navigation;

import com.github.rudroid.commits.CommitsType;
import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class CommitsRoute$$serializer implements d0 {
    public static final int $stable;
    public static final CommitsRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommitsRoute$$serializer commitsRoute$$serializer = new CommitsRoute$$serializer();
        INSTANCE = commitsRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.commits.navigation.CommitsRoute", commitsRoute$$serializer, 1);
        e1Var.l("type", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private CommitsRoute$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CommitsRoute.f9213s[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CommitsRoute m22deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        h[] hVarArr = CommitsRoute.f9213s;
        CommitsType commitsType = null;
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
                commitsType = (CommitsType) b10.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), commitsType);
                i = 1;
            }
        }
        b10.g(serialDescriptor);
        return new CommitsRoute(i, commitsType);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CommitsRoute commitsRoute) {
        k.g(encoder, "encoder");
        k.g(commitsRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.I(serialDescriptor, 0, (KSerializer) CommitsRoute.f9213s[0].getValue(), commitsRoute.f9214r);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
