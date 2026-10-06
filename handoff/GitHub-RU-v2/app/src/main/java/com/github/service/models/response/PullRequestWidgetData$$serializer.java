package com.github.service.models.response;

import com.google.android.gms.internal.measurement.d5;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.l0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class PullRequestWidgetData$$serializer implements d0 {
    public static final PullRequestWidgetData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PullRequestWidgetData$$serializer pullRequestWidgetData$$serializer = new PullRequestWidgetData$$serializer();
        INSTANCE = pullRequestWidgetData$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.PullRequestWidgetData", pullRequestWidgetData$$serializer, 3);
        e1Var.l("filterMode", false);
        e1Var.l("pullsCount", false);
        e1Var.l("pullsList", false);
        descriptor = e1Var;
    }

    private PullRequestWidgetData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = PullRequestWidgetData.d;
        return new KSerializer[]{hVarArr[0].getValue(), l0.a, hVarArr[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final PullRequestWidgetData m5deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = PullRequestWidgetData.d;
        PullsWidgetFilter pullsWidgetFilter = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        List list = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                pullsWidgetFilter = (PullsWidgetFilter) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), pullsWidgetFilter);
                i |= 1;
            } else if (t == 1) {
                i2 = b.m(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                list = (List) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new PullRequestWidgetData(i, pullsWidgetFilter, i2, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, PullRequestWidgetData pullRequestWidgetData) {
        k.g(encoder, "encoder");
        k.g(pullRequestWidgetData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = PullRequestWidgetData.d;
        b.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), pullRequestWidgetData.a);
        b.F(1, pullRequestWidgetData.b, serialDescriptor);
        b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), pullRequestWidgetData.c);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
