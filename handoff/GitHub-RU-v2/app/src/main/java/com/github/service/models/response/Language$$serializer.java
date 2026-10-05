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

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class Language$$serializer implements d0 {
    public static final Language$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Language$$serializer language$$serializer = new Language$$serializer();
        INSTANCE = language$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.Language", language$$serializer, 2);
        e1Var.l("name", false);
        e1Var.l("colorHex", false);
        descriptor = e1Var;
    }

    private Language$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        return new KSerializer[]{kSerializer, m71.a.z(kSerializer)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final Language m3deserialize(Decoder decoder) {
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
                str2 = (String) b.x(serialDescriptor, 1, q1.a, str2);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new Language(str, i, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Language language) {
        k.g(encoder, "encoder");
        k.g(language, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, language.r);
        b.H(serialDescriptor, 1, q1.a, language.s);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
