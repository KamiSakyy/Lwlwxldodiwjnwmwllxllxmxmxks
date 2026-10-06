package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
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
public final /* synthetic */ class DiscussionStatusFilter$$serializer implements d0 {
    public static final DiscussionStatusFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DiscussionStatusFilter$$serializer discussionStatusFilter$$serializer = new DiscussionStatusFilter$$serializer();
        INSTANCE = discussionStatusFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter", discussionStatusFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("filter", true);
        descriptor = e1Var;
    }

    private DiscussionStatusFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = DiscussionStatusFilter.w;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final DiscussionStatusFilter m30deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = DiscussionStatusFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        com.github.rudroid.common.h hVar = null;
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
                hVar = (com.github.rudroid.common.h) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), hVar);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new DiscussionStatusFilter(i, lVar, str, hVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, DiscussionStatusFilter discussionStatusFilter) {
        k.g(encoder, "encoder");
        k.g(discussionStatusFilter, "value");
        com.github.rudroid.common.h hVar = discussionStatusFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        DiscussionStatusFilter.Companion companion = DiscussionStatusFilter.Companion;
        d.y(discussionStatusFilter, b, serialDescriptor);
        w61.h[] hVarArr = DiscussionStatusFilter.w;
        if (b.X(serialDescriptor) || hVar != DiscussionStatusFilter.x) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), hVar);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
