package com.github.rudroid.widget;

import com.github.rudroid.widget.WidgetUIState;
import com.google.android.gms.internal.measurement.d5;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class WidgetUIState$Error$$serializer implements d0 {
    public static final int $stable;
    public static final WidgetUIState$Error$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WidgetUIState$Error$$serializer widgetUIState$Error$$serializer = new WidgetUIState$Error$$serializer();
        INSTANCE = widgetUIState$Error$$serializer;
        e1 e1Var = new e1("com.github.rudroid.widget.WidgetUIState.Error", widgetUIState$Error$$serializer, 1);
        e1Var.l("message", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private WidgetUIState$Error$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{m71.a.z(q1.a)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final WidgetUIState.Error m86deserialize(Decoder decoder) {
        k71.k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else {
                if (t != 0) {
                    throw new UnknownFieldException(t);
                }
                str = (String) b.x(serialDescriptor, 0, q1.a, str);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        return new WidgetUIState.Error(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, WidgetUIState.Error error) {
        k71.k.g(encoder, "encoder");
        k71.k.g(error, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        WidgetUIState.Error.Companion companion = WidgetUIState.Error.Companion;
        b.H(serialDescriptor, 0, q1.a, error.b);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
