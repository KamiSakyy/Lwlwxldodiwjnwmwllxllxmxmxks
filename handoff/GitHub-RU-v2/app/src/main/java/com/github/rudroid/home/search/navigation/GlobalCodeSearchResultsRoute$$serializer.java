package com.github.rudroid.home.search.navigation;

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
public final /* synthetic */ class GlobalCodeSearchResultsRoute$$serializer implements d0 {
    public static final int $stable;
    public static final GlobalCodeSearchResultsRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GlobalCodeSearchResultsRoute$$serializer globalCodeSearchResultsRoute$$serializer = new GlobalCodeSearchResultsRoute$$serializer();
        INSTANCE = globalCodeSearchResultsRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.home.search.navigation.GlobalCodeSearchResultsRoute", globalCodeSearchResultsRoute$$serializer, 1);
        e1Var.l("query", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private GlobalCodeSearchResultsRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final GlobalCodeSearchResultsRoute m39deserialize(Decoder decoder) {
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
        return new GlobalCodeSearchResultsRoute(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, GlobalCodeSearchResultsRoute globalCodeSearchResultsRoute) {
        k.g(encoder, "encoder");
        k.g(globalCodeSearchResultsRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.J(serialDescriptor, 0, globalCodeSearchResultsRoute.f15051a);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
