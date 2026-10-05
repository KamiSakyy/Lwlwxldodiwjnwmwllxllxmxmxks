package com.github.rudroid.widget.pullrequests;

import com.github.rudroid.widget.WidgetUIState;
import com.google.android.gms.internal.measurement.d5;
import java.util.Map;
import k81.c1;
import k81.d0;
import k81.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class PullRequestsWidgetModel$$serializer implements d0 {
    public static final int $stable;
    public static final PullRequestsWidgetModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PullRequestsWidgetModel$$serializer pullRequestsWidgetModel$$serializer = new PullRequestsWidgetModel$$serializer();
        INSTANCE = pullRequestsWidgetModel$$serializer;
        e1 e1Var = new e1("com.github.rudroid.widget.pullrequests.PullRequestsWidgetModel", pullRequestsWidgetModel$$serializer, 2);
        e1Var.l("accountNameToPullsData", true);
        e1Var.l("uiState", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private PullRequestsWidgetModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = PullRequestsWidgetModel.c;
        return new KSerializer[]{m71.a.z((KSerializer) hVarArr[0].getValue()), hVarArr[1].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final PullRequestsWidgetModel m88deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = PullRequestsWidgetModel.c;
        Map map = null;
        boolean z = true;
        int i = 0;
        WidgetUIState widgetUIState = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                map = (Map) b.x(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), map);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                widgetUIState = (WidgetUIState) b.A(serialDescriptor, 1, (KSerializer) hVarArr[1].getValue(), widgetUIState);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new PullRequestsWidgetModel(i, map, widgetUIState);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, PullRequestsWidgetModel pullRequestsWidgetModel) {
        k71.k.g(encoder, "encoder");
        k71.k.g(pullRequestsWidgetModel, "value");
        Map map = pullRequestsWidgetModel.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        w61.h[] hVarArr = PullRequestsWidgetModel.c;
        if (b.X(serialDescriptor) || map != null) {
            b.H(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), map);
        }
        b.I(serialDescriptor, 1, (KSerializer) hVarArr[1].getValue(), pullRequestsWidgetModel.b);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
