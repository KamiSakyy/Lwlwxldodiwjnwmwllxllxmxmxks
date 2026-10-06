package com.github.rudroid.discussions.navigation;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import jk.j;
import k71.k;
import k81.c1Shadow;
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
public final /* synthetic */ class RepositoryDiscussionsRoute$$serializer implements d0 {
    public static final int $stable;
    public static final RepositoryDiscussionsRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepositoryDiscussionsRoute$$serializer repositoryDiscussionsRoute$$serializer = new RepositoryDiscussionsRoute$$serializer();
        INSTANCE = repositoryDiscussionsRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.discussions.navigation.RepositoryDiscussionsRoute", repositoryDiscussionsRoute$$serializer, 1);
        e1Var.l("intentData", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private RepositoryDiscussionsRoute$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RepositoryDiscussionsRoute.f11581s[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepositoryDiscussionsRoute m31deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        h[] hVarArr = RepositoryDiscussionsRoute.f11581s;
        j jVar = null;
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
                jVar = (j) b10.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), jVar);
                i = 1;
            }
        }
        b10.g(serialDescriptor);
        return new RepositoryDiscussionsRoute(i, jVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepositoryDiscussionsRoute repositoryDiscussionsRoute) {
        k.g(encoder, "encoder");
        k.g(repositoryDiscussionsRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.I(serialDescriptor, 0, (KSerializer) RepositoryDiscussionsRoute.f11581s[0].getValue(), repositoryDiscussionsRoute.f11582r);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
