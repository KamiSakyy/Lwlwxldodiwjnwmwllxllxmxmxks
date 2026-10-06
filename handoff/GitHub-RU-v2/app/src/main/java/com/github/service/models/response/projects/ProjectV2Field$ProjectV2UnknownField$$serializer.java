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
import w61.h;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class ProjectV2Field$ProjectV2UnknownField$$serializer implements d0 {
    public static final ProjectV2Field$ProjectV2UnknownField$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectV2Field$ProjectV2UnknownField$$serializer projectV2Field$ProjectV2UnknownField$$serializer = new ProjectV2Field$ProjectV2UnknownField$$serializer();
        INSTANCE = projectV2Field$ProjectV2UnknownField$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.projects.ProjectV2Field.ProjectV2UnknownField", projectV2Field$ProjectV2UnknownField$$serializer, 4);
        e1Var.l("id", true);
        e1Var.l("databaseId", true);
        e1Var.l("name", true);
        e1Var.l("dataType", true);
        descriptor = e1Var;
    }

    private ProjectV2Field$ProjectV2UnknownField$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ProjectV2Field$ProjectV2UnknownField.v;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, l0.a, q1Var, hVarArr[3].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectV2Field$ProjectV2UnknownField m18deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ProjectV2Field$ProjectV2UnknownField.v;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        ProjectFieldType projectFieldType = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                i2 = b.m(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str2 = b.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                projectFieldType = (ProjectFieldType) b.A(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), projectFieldType);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new ProjectV2Field$ProjectV2UnknownField(i, str, i2, str2, projectFieldType);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectV2Field$ProjectV2UnknownField projectV2Field$ProjectV2UnknownField) {
        k.g(encoder, "encoder");
        k.g(projectV2Field$ProjectV2UnknownField, "value");
        ProjectFieldType projectFieldType = projectV2Field$ProjectV2UnknownField.u;
        String str = projectV2Field$ProjectV2UnknownField.t;
        int i = projectV2Field$ProjectV2UnknownField.s;
        String str2 = projectV2Field$ProjectV2UnknownField.r;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ProjectV2Field$ProjectV2UnknownField.v;
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 0, str2);
        }
        if (b.X(serialDescriptor) || i != 0) {
            b.F(1, i, serialDescriptor);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 2, str);
        }
        if (b.X(serialDescriptor) || projectFieldType != ProjectFieldType.UNKNOWN) {
            b.I(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), projectFieldType);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
