package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.OrganizationFilter;
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
public final /* synthetic */ class OrganizationFilter$$serializer implements d0 {
    public static final OrganizationFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrganizationFilter$$serializer organizationFilter$$serializer = new OrganizationFilter$$serializer();
        INSTANCE = organizationFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.OrganizationFilter", organizationFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("organizations", true);
        descriptor = e1Var;
    }

    private OrganizationFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = OrganizationFilter.w;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final OrganizationFilter m45deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = OrganizationFilter.w;
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
        return new OrganizationFilter(i, lVar, str, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, OrganizationFilter organizationFilter) {
        k.g(encoder, "encoder");
        k.g(organizationFilter, "value");
        List list = organizationFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        OrganizationFilter.Companion companion = OrganizationFilter.Companion;
        d.y(organizationFilter, b, serialDescriptor);
        w61.h[] hVarArr = OrganizationFilter.w;
        if (b.X(serialDescriptor) || !k.b(list, r.r)) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
