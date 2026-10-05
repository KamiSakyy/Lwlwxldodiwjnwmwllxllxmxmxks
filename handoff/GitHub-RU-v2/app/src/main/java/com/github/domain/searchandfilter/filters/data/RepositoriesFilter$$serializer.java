package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter;
import com.github.rudroid.common.i0;
import com.google.android.gms.internal.measurement.d5;
import java.util.List;
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
import x61.r;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class RepositoriesFilter$$serializer implements d0 {
    public static final RepositoriesFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RepositoriesFilter$$serializer repositoriesFilter$$serializer = new RepositoriesFilter$$serializer();
        INSTANCE = repositoriesFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.RepositoriesFilter", repositoriesFilter$$serializer, 4);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("repositories", true);
        e1Var.l("repositoryFilter", true);
        descriptor = e1Var;
    }

    private RepositoriesFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = RepositoriesFilter.x;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue(), hVarArr[3].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final RepositoriesFilter m52deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = RepositoriesFilter.x;
        int i = 0;
        l lVar = null;
        String str = null;
        List list = null;
        i0 i0Var = null;
        boolean z = true;
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
            } else if (t == 2) {
                list = (List) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                i0Var = (i0) b.A(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), i0Var);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new RepositoriesFilter(i, lVar, str, list, i0Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, RepositoriesFilter repositoriesFilter) {
        k.g(encoder, "encoder");
        k.g(repositoriesFilter, "value");
        i0 i0Var = repositoriesFilter.w;
        List list = repositoriesFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        RepositoriesFilter.Companion companion = RepositoriesFilter.Companion;
        d.y(repositoriesFilter, b, serialDescriptor);
        w61.h[] hVarArr = RepositoriesFilter.x;
        if (b.X(serialDescriptor) || !k.b(list, r.r)) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list);
        }
        if (b.X(serialDescriptor) || i0Var != i0.r) {
            b.I(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), i0Var);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
