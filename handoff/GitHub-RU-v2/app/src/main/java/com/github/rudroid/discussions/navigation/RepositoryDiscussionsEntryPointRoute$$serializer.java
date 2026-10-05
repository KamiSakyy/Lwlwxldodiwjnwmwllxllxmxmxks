package com.github.rudroid.discussions.navigation;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import jk.j;
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
public final /* synthetic */ class RepositoryDiscussionsEntryPointRoute$$serializer implements d0 {
    public static final int $stable;
    public static final RepositoryDiscussionsEntryPointRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepositoryDiscussionsEntryPointRoute$$serializer repositoryDiscussionsEntryPointRoute$$serializer = new RepositoryDiscussionsEntryPointRoute$$serializer();
        INSTANCE = repositoryDiscussionsEntryPointRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.discussions.navigation.RepositoryDiscussionsEntryPointRoute", repositoryDiscussionsEntryPointRoute$$serializer, 1);
        e1Var.l("intentData", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private RepositoryDiscussionsEntryPointRoute$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RepositoryDiscussionsEntryPointRoute.f11579s[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepositoryDiscussionsEntryPointRoute m30deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        h[] hVarArr = RepositoryDiscussionsEntryPointRoute.f11579s;
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
        return new RepositoryDiscussionsEntryPointRoute(i, jVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepositoryDiscussionsEntryPointRoute repositoryDiscussionsEntryPointRoute) {
        k.g(encoder, "encoder");
        k.g(repositoryDiscussionsEntryPointRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.I(serialDescriptor, 0, (KSerializer) RepositoryDiscussionsEntryPointRoute.f11579s[0].getValue(), repositoryDiscussionsEntryPointRoute.f11580r);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
