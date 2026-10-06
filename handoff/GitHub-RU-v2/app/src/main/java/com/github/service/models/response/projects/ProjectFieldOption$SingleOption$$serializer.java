package com.github.service.models.response.projects;

import com.google.android.gms.internal.measurement.d5;
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
import w61.c;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class ProjectFieldOption$SingleOption$$serializer implements d0 {
    public static final ProjectFieldOption$SingleOption$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectFieldOption$SingleOption$$serializer projectFieldOption$SingleOption$$serializer = new ProjectFieldOption$SingleOption$$serializer();
        INSTANCE = projectFieldOption$SingleOption$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.projects.ProjectFieldOption.SingleOption", projectFieldOption$SingleOption$$serializer, 4);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("nameHtml", false);
        e1Var.l("position", false);
        descriptor = e1Var;
    }

    private ProjectFieldOption$SingleOption$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        return new KSerializer[]{kSerializer, m71.a.z(kSerializer), m71.a.z(kSerializer), l0.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectFieldOption$SingleOption m14deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = (String) b.x(serialDescriptor, 1, q1.a, str2);
                i |= 2;
            } else if (t == 2) {
                str3 = (String) b.x(serialDescriptor, 2, q1.a, str3);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                i2 = b.m(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new ProjectFieldOption$SingleOption(i, i2, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectFieldOption$SingleOption projectFieldOption$SingleOption) {
        k.g(encoder, "encoder");
        k.g(projectFieldOption$SingleOption, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, projectFieldOption$SingleOption.r);
        q1 q1Var = q1.a;
        b.H(serialDescriptor, 1, q1Var, projectFieldOption$SingleOption.s);
        b.H(serialDescriptor, 2, q1Var, projectFieldOption$SingleOption.t);
        b.F(3, projectFieldOption$SingleOption.u, serialDescriptor);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
