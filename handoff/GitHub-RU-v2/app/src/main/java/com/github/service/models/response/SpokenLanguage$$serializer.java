package com.github.service.models.response;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class SpokenLanguage$$serializer implements d0 {
    public static final SpokenLanguage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SpokenLanguage$$serializer spokenLanguage$$serializer = new SpokenLanguage$$serializer();
        INSTANCE = spokenLanguage$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.SpokenLanguage", spokenLanguage$$serializer, 2);
        e1Var.l("name", false);
        e1Var.l("code", false);
        descriptor = e1Var;
    }

    private SpokenLanguage$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SpokenLanguage m9deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (t != 1) {
                    throw new UnknownFieldException(t);
                }
                str2 = b.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new SpokenLanguage(str, i, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SpokenLanguage spokenLanguage) {
        k.g(encoder, "encoder");
        k.g(spokenLanguage, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, spokenLanguage.r);
        b.J(serialDescriptor, 1, spokenLanguage.s);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
