package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.google.android.gms.internal.measurement.d5;
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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AuthorFilter$$serializer implements d0 {
    public static final AuthorFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AuthorFilter$$serializer authorFilter$$serializer = new AuthorFilter$$serializer();
        INSTANCE = authorFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.AuthorFilter", authorFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("author", true);
        descriptor = e1Var;
    }

    private AuthorFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = AuthorFilter.w;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, m71.a.z((KSerializer) hVarArr[2].getValue())};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AuthorFilter m26deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = AuthorFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        yz0.f fVar = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                lVar = (l) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), lVar);
                i |= 1;
            } else if (t == 1) {
                str = b.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                fVar = (yz0.f) b.x(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), fVar);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new AuthorFilter(i, lVar, str, fVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AuthorFilter authorFilter) {
        k.g(encoder, "encoder");
        k.g(authorFilter, "value");
        yz0.f fVar = authorFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        AuthorFilter.Companion companion = AuthorFilter.Companion;
        d.y(authorFilter, b, serialDescriptor);
        w61.h[] hVarArr = AuthorFilter.w;
        if (b.X(serialDescriptor) || fVar != null) {
            b.H(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), fVar);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
