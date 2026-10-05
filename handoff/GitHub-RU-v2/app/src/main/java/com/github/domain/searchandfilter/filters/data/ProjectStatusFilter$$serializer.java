package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.rudroid.common.f0;
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
public final /* synthetic */ class ProjectStatusFilter$$serializer implements d0 {
    public static final ProjectStatusFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectStatusFilter$$serializer projectStatusFilter$$serializer = new ProjectStatusFilter$$serializer();
        INSTANCE = projectStatusFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.ProjectStatusFilter", projectStatusFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("filter", true);
        descriptor = e1Var;
    }

    private ProjectStatusFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = ProjectStatusFilter.w;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectStatusFilter m49deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = ProjectStatusFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        f0 f0Var = null;
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
                f0Var = (f0) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), f0Var);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new ProjectStatusFilter(i, lVar, str, f0Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectStatusFilter projectStatusFilter) {
        k.g(encoder, "encoder");
        k.g(projectStatusFilter, "value");
        f0 f0Var = projectStatusFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        ProjectStatusFilter.Companion companion = ProjectStatusFilter.Companion;
        d.y(projectStatusFilter, b, serialDescriptor);
        w61.h[] hVarArr = ProjectStatusFilter.w;
        if (b.X(serialDescriptor) || f0Var != ProjectStatusFilter.x) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), f0Var);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
