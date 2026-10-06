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
public final /* synthetic */ class SimpleRepository$$serializer implements d0 {
    public static final SimpleRepository$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SimpleRepository$$serializer simpleRepository$$serializer = new SimpleRepository$$serializer();
        INSTANCE = simpleRepository$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.SimpleRepository", simpleRepository$$serializer, 5);
        e1Var.l("name", false);
        e1Var.l("id", false);
        e1Var.l("owner", false);
        e1Var.l("avatar", false);
        e1Var.l("url", false);
        descriptor = e1Var;
    }

    private SimpleRepository$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, Avatar$$serializer.INSTANCE, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SimpleRepository m8deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Avatar avatar = null;
        String str4 = null;
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
            } else if (t == 3) {
                avatar = (Avatar) b.A(serialDescriptor, 3, Avatar$$serializer.INSTANCE, avatar);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                str4 = b.r(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new SimpleRepository(i, str, str2, str3, avatar, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SimpleRepository simpleRepository) {
        k.g(encoder, "encoder");
        k.g(simpleRepository, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, simpleRepository.r);
        b.J(serialDescriptor, 1, simpleRepository.s);
        b.J(serialDescriptor, 2, simpleRepository.t);
        b.I(serialDescriptor, 3, Avatar$$serializer.INSTANCE, simpleRepository.u);
        b.J(serialDescriptor, 4, simpleRepository.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
