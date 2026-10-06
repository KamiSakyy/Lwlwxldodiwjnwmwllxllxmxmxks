package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter;
import com.google.android.gms.internal.measurement.d5;
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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class DiscussionsIsUnansweredFilter$$serializer implements d0 {
    public static final DiscussionsIsUnansweredFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DiscussionsIsUnansweredFilter$$serializer discussionsIsUnansweredFilter$$serializer = new DiscussionsIsUnansweredFilter$$serializer();
        INSTANCE = discussionsIsUnansweredFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter", discussionsIsUnansweredFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("active", true);
        descriptor = e1Var;
    }

    private DiscussionsIsUnansweredFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DiscussionsIsUnansweredFilter.w[0].getValue(), q1.a, k81.g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final DiscussionsIsUnansweredFilter m32deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = DiscussionsIsUnansweredFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
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
                z2 = b.p(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new DiscussionsIsUnansweredFilter(i, lVar, str, z2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, DiscussionsIsUnansweredFilter discussionsIsUnansweredFilter) {
        k.g(encoder, "encoder");
        k.g(discussionsIsUnansweredFilter, "value");
        boolean z = discussionsIsUnansweredFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        DiscussionsIsUnansweredFilter.Companion companion = DiscussionsIsUnansweredFilter.Companion;
        d.y(discussionsIsUnansweredFilter, b, serialDescriptor);
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 2, z);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
