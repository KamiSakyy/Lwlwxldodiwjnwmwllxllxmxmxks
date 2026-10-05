package com.github.rudroid.widget.contribution;

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
public final /* synthetic */ class ContributionWidgetModel$$serializer implements d0 {
    public static final int $stable;
    public static final ContributionWidgetModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ContributionWidgetModel$$serializer contributionWidgetModel$$serializer = new ContributionWidgetModel$$serializer();
        INSTANCE = contributionWidgetModel$$serializer;
        e1 e1Var = new e1("com.github.rudroid.widget.contribution.ContributionWidgetModel", contributionWidgetModel$$serializer, 2);
        e1Var.l("grids", false);
        e1Var.l("uiState", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private ContributionWidgetModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = ContributionWidgetModel.c;
        return new KSerializer[]{hVarArr[0].getValue(), hVarArr[1].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ContributionWidgetModel m87deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = ContributionWidgetModel.c;
        Map map = null;
        boolean z = true;
        int i = 0;
        WidgetUIState widgetUIState = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                map = (Map) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), map);
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
        return new ContributionWidgetModel(i, map, widgetUIState);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ContributionWidgetModel contributionWidgetModel) {
        k71.k.g(encoder, "encoder");
        k71.k.g(contributionWidgetModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        w61.h[] hVarArr = ContributionWidgetModel.c;
        b.I(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), contributionWidgetModel.a);
        b.I(serialDescriptor, 1, (KSerializer) hVarArr[1].getValue(), contributionWidgetModel.b);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
