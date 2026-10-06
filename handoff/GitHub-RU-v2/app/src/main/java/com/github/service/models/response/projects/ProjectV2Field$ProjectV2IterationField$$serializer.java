package com.github.service.models.response.projects;

import com.google.android.gms.internal.measurement.d5;
import java.util.List;
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
public final /* synthetic */ class ProjectV2Field$ProjectV2IterationField$$serializer implements d0 {
    public static final ProjectV2Field$ProjectV2IterationField$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProjectV2Field$ProjectV2IterationField$$serializer projectV2Field$ProjectV2IterationField$$serializer = new ProjectV2Field$ProjectV2IterationField$$serializer();
        INSTANCE = projectV2Field$ProjectV2IterationField$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.projects.ProjectV2Field.ProjectV2IterationField", projectV2Field$ProjectV2IterationField$$serializer, 7);
        e1Var.l("id", false);
        e1Var.l("databaseId", false);
        e1Var.l("name", false);
        e1Var.l("dataType", false);
        e1Var.l("completedIterations", false);
        e1Var.l("availableIterations", false);
        e1Var.l("durationInDays", false);
        descriptor = e1Var;
    }

    private ProjectV2Field$ProjectV2IterationField$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ProjectV2Field$ProjectV2IterationField.y;
        q1 q1Var = q1.a;
        l0 l0Var = l0.a;
        return new KSerializer[]{q1Var, l0Var, q1Var, hVarArr[3].getValue(), hVarArr[4].getValue(), hVarArr[5].getValue(), l0Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ProjectV2Field$ProjectV2IterationField m15deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ProjectV2Field$ProjectV2IterationField.y;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        ProjectFieldType projectFieldType = null;
        List list = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = b.m(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    projectFieldType = (ProjectFieldType) b.A(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), projectFieldType);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    i3 = b.m(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new ProjectV2Field$ProjectV2IterationField(i, str, i2, str2, projectFieldType, list, list2, i3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ProjectV2Field$ProjectV2IterationField projectV2Field$ProjectV2IterationField) {
        k.g(encoder, "encoder");
        k.g(projectV2Field$ProjectV2IterationField, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ProjectV2Field$ProjectV2IterationField.y;
        b.J(serialDescriptor, 0, projectV2Field$ProjectV2IterationField.r);
        b.F(1, projectV2Field$ProjectV2IterationField.s, serialDescriptor);
        b.J(serialDescriptor, 2, projectV2Field$ProjectV2IterationField.t);
        b.I(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), projectV2Field$ProjectV2IterationField.u);
        b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), projectV2Field$ProjectV2IterationField.v);
        b.I(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), projectV2Field$ProjectV2IterationField.w);
        b.F(6, projectV2Field$ProjectV2IterationField.x, serialDescriptor);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
