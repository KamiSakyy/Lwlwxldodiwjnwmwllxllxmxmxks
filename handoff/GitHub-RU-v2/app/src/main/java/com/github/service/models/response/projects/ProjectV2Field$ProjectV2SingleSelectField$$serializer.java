package com.github.service.models.response.projects;

import com.google.android.gms.internal.measurement.d5;
import java.util.List;
import k71.k;
import k81.c1;
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
public final /* synthetic */ class ProjectV2Field$ProjectV2SingleSelectField$$serializer implements d0 {
    public static final ProjectV2Field$ProjectV2SingleSelectField$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectV2Field$ProjectV2SingleSelectField$$serializer projectV2Field$ProjectV2SingleSelectField$$serializer = new ProjectV2Field$ProjectV2SingleSelectField$$serializer();
        INSTANCE = projectV2Field$ProjectV2SingleSelectField$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.projects.ProjectV2Field.ProjectV2SingleSelectField", projectV2Field$ProjectV2SingleSelectField$$serializer, 5);
        e1Var.l("id", false);
        e1Var.l("databaseId", false);
        e1Var.l("name", false);
        e1Var.l("dataType", false);
        e1Var.l("singleOptions", false);
        descriptor = e1Var;
    }

    private ProjectV2Field$ProjectV2SingleSelectField$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ProjectV2Field$ProjectV2SingleSelectField.w;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, l0.a, q1Var, hVarArr[3].getValue(), hVarArr[4].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectV2Field$ProjectV2SingleSelectField m16deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ProjectV2Field$ProjectV2SingleSelectField.w;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        ProjectFieldType projectFieldType = null;
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
                i2 = b.m(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str2 = b.r(serialDescriptor, 2);
                i |= 4;
            } else if (t == 3) {
                projectFieldType = (ProjectFieldType) b.A(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), projectFieldType);
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
        return new ProjectV2Field$ProjectV2SingleSelectField(i, str, i2, str2, projectFieldType, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectV2Field$ProjectV2SingleSelectField projectV2Field$ProjectV2SingleSelectField) {
        k.g(encoder, "encoder");
        k.g(projectV2Field$ProjectV2SingleSelectField, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ProjectV2Field$ProjectV2SingleSelectField.w;
        b.J(serialDescriptor, 0, projectV2Field$ProjectV2SingleSelectField.r);
        b.F(1, projectV2Field$ProjectV2SingleSelectField.s, serialDescriptor);
        b.J(serialDescriptor, 2, projectV2Field$ProjectV2SingleSelectField.t);
        b.I(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), projectV2Field$ProjectV2SingleSelectField.u);
        b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), projectV2Field$ProjectV2SingleSelectField.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
