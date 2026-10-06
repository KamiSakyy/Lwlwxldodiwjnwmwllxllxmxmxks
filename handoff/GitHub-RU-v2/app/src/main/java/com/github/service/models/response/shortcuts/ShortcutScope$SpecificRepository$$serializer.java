package com.github.service.models.response.shortcuts;

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
public final /* synthetic */ class ShortcutScope$SpecificRepository$$serializer implements d0 {
    public static final ShortcutScope$SpecificRepository$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ShortcutScope$SpecificRepository$$serializer shortcutScope$SpecificRepository$$serializer = new ShortcutScope$SpecificRepository$$serializer();
        INSTANCE = shortcutScope$SpecificRepository$$serializer;
        e1 e1Var = new e1("Specific_repository", shortcutScope$SpecificRepository$$serializer, 2);
        e1Var.l("owner", false);
        e1Var.l("name", false);
        descriptor = e1Var;
    }

    private ShortcutScope$SpecificRepository$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ShortcutScope$SpecificRepository m20deserialize(Decoder decoder) {
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
        return new ShortcutScope$SpecificRepository(str, i, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ShortcutScope$SpecificRepository shortcutScope$SpecificRepository) {
        k.g(encoder, "encoder");
        k.g(shortcutScope$SpecificRepository, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, shortcutScope$SpecificRepository.s);
        b.J(serialDescriptor, 1, shortcutScope$SpecificRepository.t);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
