package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.RepositorySortFilter;
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
public final /* synthetic */ class RepositorySortFilter$$serializer implements d0 {
    public static final RepositorySortFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepositorySortFilter$$serializer repositorySortFilter$$serializer = new RepositorySortFilter$$serializer();
        INSTANCE = repositorySortFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.RepositorySortFilter", repositorySortFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("filter", true);
        descriptor = e1Var;
    }

    private RepositorySortFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = RepositorySortFilter.w;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepositorySortFilter m54deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = RepositorySortFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        v01.c cVar = null;
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
                cVar = (v01.c) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), cVar);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new RepositorySortFilter(i, lVar, str, cVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepositorySortFilter repositorySortFilter) {
        k.g(encoder, "encoder");
        k.g(repositorySortFilter, "value");
        v01.c cVar = repositorySortFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        RepositorySortFilter.Companion companion = RepositorySortFilter.Companion;
        d.y(repositorySortFilter, b, serialDescriptor);
        w61.h[] hVarArr = RepositorySortFilter.w;
        if (b.X(serialDescriptor) || cVar != RepositorySortFilter.x) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), cVar);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
