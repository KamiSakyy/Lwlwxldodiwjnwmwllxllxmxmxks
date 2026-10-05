package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
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
public final /* synthetic */ class CustomFilter$$serializer implements d0 {
    public static final CustomFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CustomFilter$$serializer customFilter$$serializer = new CustomFilter$$serializer();
        INSTANCE = customFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.CustomFilter", customFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("text", false);
        descriptor = e1Var;
    }

    private CustomFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{CustomFilter.w[0].getValue(), q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CustomFilter m27deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = CustomFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
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
                str2 = b.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new CustomFilter(i, lVar, str, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CustomFilter customFilter) {
        k.g(encoder, "encoder");
        k.g(customFilter, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        CustomFilter.Companion companion = CustomFilter.Companion;
        d.y(customFilter, b, serialDescriptor);
        b.J(serialDescriptor, 2, customFilter.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
