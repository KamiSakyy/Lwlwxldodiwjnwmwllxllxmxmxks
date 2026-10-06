package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.google.android.gms.internal.measurement.d5;
import java.util.List;
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
import x61.rShadow;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class DiscussionCategoryFilter$$serializer implements d0 {
    public static final DiscussionCategoryFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DiscussionCategoryFilter$$serializer discussionCategoryFilter$$serializer = new DiscussionCategoryFilter$$serializer();
        INSTANCE = discussionCategoryFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter", discussionCategoryFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("categories", true);
        descriptor = e1Var;
    }

    private DiscussionCategoryFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = DiscussionCategoryFilter.w;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final DiscussionCategoryFilter m29deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = DiscussionCategoryFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
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
                list = (List) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new DiscussionCategoryFilter(i, lVar, str, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, DiscussionCategoryFilter discussionCategoryFilter) {
        k.g(encoder, "encoder");
        k.g(discussionCategoryFilter, "value");
        List list = discussionCategoryFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        DiscussionCategoryFilter.Companion companion = DiscussionCategoryFilter.Companion;
        d.y(discussionCategoryFilter, b, serialDescriptor);
        w61.h[] hVarArr = DiscussionCategoryFilter.w;
        if (b.X(serialDescriptor) || !k.b(list, rShadow.r)) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
