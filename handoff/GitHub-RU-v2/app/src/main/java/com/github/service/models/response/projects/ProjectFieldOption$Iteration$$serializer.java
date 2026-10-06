package com.github.service.models.response.projects;

import com.google.android.gms.internal.measurement.d5;
import java.time.LocalDate;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.l0;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l01.t;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class ProjectFieldOption$Iteration$$serializer implements d0 {
    public static final ProjectFieldOption$Iteration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectFieldOption$Iteration$$serializer projectFieldOption$Iteration$$serializer = new ProjectFieldOption$Iteration$$serializer();
        INSTANCE = projectFieldOption$Iteration$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.projects.ProjectFieldOption.Iteration", projectFieldOption$Iteration$$serializer, 5);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("nameHtml", false);
        e1Var.l("durationInDays", false);
        e1Var.l("startDate", false);
        descriptor = e1Var;
    }

    private ProjectFieldOption$Iteration$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, l0.a, t.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectFieldOption$Iteration m13deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        LocalDate localDate = null;
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
                i2 = b.m(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                localDate = (LocalDate) b.A(serialDescriptor, 4, t.a, localDate);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new ProjectFieldOption$Iteration(i, str, str2, str3, i2, localDate);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectFieldOption$Iteration projectFieldOption$Iteration) {
        k.g(encoder, "encoder");
        k.g(projectFieldOption$Iteration, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, projectFieldOption$Iteration.r);
        b.J(serialDescriptor, 1, projectFieldOption$Iteration.s);
        b.J(serialDescriptor, 2, projectFieldOption$Iteration.t);
        b.F(3, projectFieldOption$Iteration.u, serialDescriptor);
        b.I(serialDescriptor, 4, t.a, projectFieldOption$Iteration.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
