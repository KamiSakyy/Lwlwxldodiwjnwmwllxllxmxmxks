package com.github.service.models.response.projects;

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
import l01.j0;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class ProjectsMetaInfo$$serializer implements d0 {
    public static final ProjectsMetaInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectsMetaInfo$$serializer projectsMetaInfo$$serializer = new ProjectsMetaInfo$$serializer();
        INSTANCE = projectsMetaInfo$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.projects.ProjectsMetaInfo", projectsMetaInfo$$serializer, 5);
        e1Var.l("viewId", false);
        e1Var.l("itemId", false);
        e1Var.l("fullDatabaseId", false);
        e1Var.l("groupedByField", false);
        e1Var.l("viewGroupedByFields", false);
        descriptor = e1Var;
    }

    private ProjectsMetaInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ProjectsMetaInfo.w;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, m71.a.z((KSerializer) hVarArr[3].getValue()), hVarArr[4].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectsMetaInfo m19deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ProjectsMetaInfo.w;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        j0 j0Var = null;
        List list = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str3 = b.r(serialDescriptor, 2);
                i |= 4;
            } else if (t == 3) {
                j0Var = (j0) b.x(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), j0Var);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                list = (List) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new ProjectsMetaInfo(i, str, str2, str3, j0Var, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectsMetaInfo projectsMetaInfo) {
        k.g(encoder, "encoder");
        k.g(projectsMetaInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ProjectsMetaInfo.w;
        b.J(serialDescriptor, 0, projectsMetaInfo.r);
        b.J(serialDescriptor, 1, projectsMetaInfo.s);
        b.J(serialDescriptor, 2, projectsMetaInfo.t);
        b.H(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), projectsMetaInfo.u);
        b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), projectsMetaInfo.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
