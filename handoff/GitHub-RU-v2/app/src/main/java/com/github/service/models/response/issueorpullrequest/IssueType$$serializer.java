package com.github.service.models.response.issueorpullrequest;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.g;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m71.a;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class IssueType$$serializer implements d0 {
    public static final IssueType$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IssueType$$serializer issueType$$serializer = new IssueType$$serializer();
        INSTANCE = issueType$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.issueorpullrequest.IssueType", issueType$$serializer, 5);
        e1Var.l("id", false);
        e1Var.l("name", false);
        e1Var.l("description", false);
        e1Var.l("isEnabled", false);
        e1Var.l("color", false);
        descriptor = e1Var;
    }

    private IssueType$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = IssueType.w;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, a.z(q1Var), g.a, hVarArr[4].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final IssueType m10deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = IssueType.w;
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        IssueTypeColor issueTypeColor = null;
        boolean z2 = true;
        while (z2) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z2 = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str3 = (String) b.x(serialDescriptor, 2, q1.a, str3);
                i |= 4;
            } else if (t == 3) {
                z = b.p(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                issueTypeColor = (IssueTypeColor) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), issueTypeColor);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new IssueType(i, str, str2, str3, z, issueTypeColor);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, IssueType issueType) {
        k.g(encoder, "encoder");
        k.g(issueType, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = IssueType.w;
        b.J(serialDescriptor, 0, issueType.r);
        b.J(serialDescriptor, 1, issueType.s);
        b.H(serialDescriptor, 2, q1.a, issueType.t);
        b.C(serialDescriptor, 3, issueType.u);
        b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), issueType.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
