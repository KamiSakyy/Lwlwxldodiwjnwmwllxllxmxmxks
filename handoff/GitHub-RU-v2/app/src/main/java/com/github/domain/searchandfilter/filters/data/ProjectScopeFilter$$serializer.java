package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.github.rudroid.common.e0;
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
public final /* synthetic */ class ProjectScopeFilter$$serializer implements d0 {
    public static final ProjectScopeFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectScopeFilter$$serializer projectScopeFilter$$serializer = new ProjectScopeFilter$$serializer();
        INSTANCE = projectScopeFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.ProjectScopeFilter", projectScopeFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("filter", true);
        descriptor = e1Var;
    }

    private ProjectScopeFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = ProjectScopeFilter.w;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectScopeFilter m48deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = ProjectScopeFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        e0 e0Var = null;
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
                e0Var = (e0) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), e0Var);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new ProjectScopeFilter(i, lVar, str, e0Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectScopeFilter projectScopeFilter) {
        k.g(encoder, "encoder");
        k.g(projectScopeFilter, "value");
        e0 e0Var = projectScopeFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        ProjectScopeFilter.Companion companion = ProjectScopeFilter.Companion;
        d.y(projectScopeFilter, b, serialDescriptor);
        w61.h[] hVarArr = ProjectScopeFilter.w;
        if (b.X(serialDescriptor) || e0Var != ProjectScopeFilter.x) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), e0Var);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
