package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter;
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
public final /* synthetic */ class ReviewRequestedFilter$$serializer implements d0 {
    public static final ReviewRequestedFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReviewRequestedFilter$$serializer reviewRequestedFilter$$serializer = new ReviewRequestedFilter$$serializer();
        INSTANCE = reviewRequestedFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter", reviewRequestedFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("enabled", true);
        descriptor = e1Var;
    }

    private ReviewRequestedFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ReviewRequestedFilter.w[0].getValue(), q1.a, k81.g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ReviewRequestedFilter m57deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = ReviewRequestedFilter.w;
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
        return new ReviewRequestedFilter(i, lVar, str, z2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ReviewRequestedFilter reviewRequestedFilter) {
        k.g(encoder, "encoder");
        k.g(reviewRequestedFilter, "value");
        boolean z = reviewRequestedFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        ReviewRequestedFilter.Companion companion = ReviewRequestedFilter.Companion;
        d.y(reviewRequestedFilter, b, serialDescriptor);
        if (b.X(serialDescriptor) || z) {
            b.C(serialDescriptor, 2, z);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
