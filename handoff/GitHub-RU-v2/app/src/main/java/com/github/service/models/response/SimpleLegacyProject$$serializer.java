package com.github.service.models.response;

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
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class SimpleLegacyProject$$serializer implements d0 {
    public static final SimpleLegacyProject$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SimpleLegacyProject$$serializer simpleLegacyProject$$serializer = new SimpleLegacyProject$$serializer();
        INSTANCE = simpleLegacyProject$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.SimpleLegacyProject", simpleLegacyProject$$serializer, 4);
        e1Var.l("name", false);
        e1Var.l("id", false);
        e1Var.l("state", false);
        e1Var.l("column", false);
        descriptor = e1Var;
    }

    private SimpleLegacyProject$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = SimpleLegacyProject.v;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, hVarArr[2].getValue(), m71.a.z(q1Var)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SimpleLegacyProject m7deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = SimpleLegacyProject.v;
        int i = 0;
        String str = null;
        String str2 = null;
        ProjectState projectState = null;
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
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                projectState = (ProjectState) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), projectState);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                str3 = (String) b.x(serialDescriptor, 3, q1.a, str3);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new SimpleLegacyProject(i, str, str2, projectState, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SimpleLegacyProject simpleLegacyProject) {
        k.g(encoder, "encoder");
        k.g(simpleLegacyProject, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = SimpleLegacyProject.v;
        b.J(serialDescriptor, 0, simpleLegacyProject.r);
        b.J(serialDescriptor, 1, simpleLegacyProject.s);
        b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), simpleLegacyProject.t);
        b.H(serialDescriptor, 3, q1.a, simpleLegacyProject.u);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
