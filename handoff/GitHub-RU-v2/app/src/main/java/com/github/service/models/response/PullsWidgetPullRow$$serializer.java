package com.github.service.models.response;

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
public final /* synthetic */ class PullsWidgetPullRow$$serializer implements d0 {
    public static final PullsWidgetPullRow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PullsWidgetPullRow$$serializer pullsWidgetPullRow$$serializer = new PullsWidgetPullRow$$serializer();
        INSTANCE = pullsWidgetPullRow$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.PullsWidgetPullRow", pullsWidgetPullRow$$serializer, 6);
        e1Var.l("title", false);
        e1Var.l("number", false);
        e1Var.l("url", false);
        e1Var.l("repoOwner", false);
        e1Var.l("repoName", false);
        e1Var.l("state", false);
        descriptor = e1Var;
    }

    private PullsWidgetPullRow$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = PullsWidgetPullRow.g;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, l0.a, q1Var, q1Var, q1Var, hVarArr[5].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final PullsWidgetPullRow m6deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = PullsWidgetPullRow.g;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        CheckStatusState checkStatusState = null;
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
                    str3 = b.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    checkStatusState = (CheckStatusState) b.A(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), checkStatusState);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new PullsWidgetPullRow(i, str, i2, str2, str3, str4, checkStatusState);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, PullsWidgetPullRow pullsWidgetPullRow) {
        k.g(encoder, "encoder");
        k.g(pullsWidgetPullRow, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = PullsWidgetPullRow.g;
        b.J(serialDescriptor, 0, pullsWidgetPullRow.a);
        b.F(1, pullsWidgetPullRow.b, serialDescriptor);
        b.J(serialDescriptor, 2, pullsWidgetPullRow.c);
        b.J(serialDescriptor, 3, pullsWidgetPullRow.d);
        b.J(serialDescriptor, 4, pullsWidgetPullRow.e);
        b.I(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), pullsWidgetPullRow.f);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
