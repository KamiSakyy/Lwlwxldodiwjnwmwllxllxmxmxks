package com.github.domain.database.serialization;

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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SerializableLabel$$serializer implements d0 {
    public static final SerializableLabel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SerializableLabel$$serializer serializableLabel$$serializer = new SerializableLabel$$serializer();
        INSTANCE = serializableLabel$$serializer;
        e1 e1Var = new e1("com.github.domain.database.serialization.SerializableLabel", serializableLabel$$serializer, 4);
        e1Var.l("name", false);
        e1Var.l("id", false);
        e1Var.l("colorString", false);
        e1Var.l("color", false);
        descriptor = e1Var;
    }

    private SerializableLabel$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, l0.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SerializableLabel m13deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
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
                str3 = b.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                i2 = b.m(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new SerializableLabel(i, i2, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SerializableLabel serializableLabel) {
        k.g(encoder, "encoder");
        k.g(serializableLabel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, serializableLabel.r);
        b.J(serialDescriptor, 1, serializableLabel.s);
        b.J(serialDescriptor, 2, serializableLabel.t);
        b.F(3, serializableLabel.u, serialDescriptor);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
