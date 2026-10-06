package com.github.rudroid.repository.file.navigation;

import com.google.android.gms.internal.measurement.d5;
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

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class LineSelection$$serializer implements d0 {
    public static final int $stable;
    public static final LineSelection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LineSelection$$serializer lineSelection$$serializer = new LineSelection$$serializer();
        INSTANCE = lineSelection$$serializer;
        e1 e1Var = new e1("com.github.rudroid.repository.file.navigation.LineSelection", lineSelection$$serializer, 2);
        e1Var.l("start", false);
        e1Var.l("end", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private LineSelection$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        l0 l0Var = l0.a;
        return new KSerializer[]{l0Var, l0Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final LineSelection m61deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b10 = decoder.b(serialDescriptor);
        boolean z10 = true;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                i10 = b10.m(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t10 != 1) {
                    throw new UnknownFieldException(t10);
                }
                i11 = b10.m(serialDescriptor, 1);
                i |= 2;
            }
        }
        b10.g(serialDescriptor);
        return new LineSelection(i, i10, i11);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, LineSelection lineSelection) {
        k.g(encoder, "encoder");
        k.g(lineSelection, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.F(0, lineSelection.f19431r, serialDescriptor);
        b10.F(1, lineSelection.f19432s, serialDescriptor);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
