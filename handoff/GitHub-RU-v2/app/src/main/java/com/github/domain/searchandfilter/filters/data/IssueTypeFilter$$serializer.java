package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.issueorpullrequest.IssueType$;
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
public final /* synthetic */ class IssueTypeFilter$$serializer implements d0 {
    public static final IssueTypeFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IssueTypeFilter$$serializer issueTypeFilter$$serializer = new IssueTypeFilter$$serializer();
        INSTANCE = issueTypeFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.IssueTypeFilter", issueTypeFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("issueType", true);
        descriptor = e1Var;
    }

    private IssueTypeFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{IssueTypeFilter.w[0].getValue(), q1.a, m71.a.z(IssueType$.serializer.INSTANCE)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final IssueTypeFilter m36deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = IssueTypeFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        IssueType issueType = null;
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
                issueType = (IssueType) b.x(serialDescriptor, 2, IssueType$.serializer.INSTANCE, issueType);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new IssueTypeFilter(i, lVar, str, issueType);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, IssueTypeFilter issueTypeFilter) {
        k.g(encoder, "encoder");
        k.g(issueTypeFilter, "value");
        IssueType issueType = issueTypeFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        IssueTypeFilter.Companion companion = IssueTypeFilter.Companion;
        d.y(issueTypeFilter, b, serialDescriptor);
        if (b.X(serialDescriptor) || issueType != null) {
            b.H(serialDescriptor, 2, IssueType$.serializer.INSTANCE, issueType);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
