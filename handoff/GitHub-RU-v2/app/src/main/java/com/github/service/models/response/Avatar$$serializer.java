package com.github.service.models.response;

import com.github.service.models.response.Avatar;
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
import w61.h;

@c
/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class Avatar$$serializer implements d0 {
    public static final Avatar$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Avatar$$serializer avatar$$serializer = new Avatar$$serializer();
        INSTANCE = avatar$$serializer;
        e1 e1Var = new e1("com.github.service.models.response.Avatar", avatar$$serializer, 2);
        e1Var.l("url", false);
        e1Var.l("type", false);
        descriptor = e1Var;
    }

    private Avatar$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a, Avatar.t[1].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final Avatar m2deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = Avatar.t;
        String str = null;
        boolean z = true;
        int i = 0;
        Avatar.Type type = null;
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
                type = (Avatar.Type) b.A(serialDescriptor, 1, (KSerializer) hVarArr[1].getValue(), type);
                i |= 2;
            }
        }
        b.g(serialDescriptor);
        return new Avatar(i, str, type);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Avatar avatar) {
        k.g(encoder, "encoder");
        k.g(avatar, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = Avatar.t;
        b.J(serialDescriptor, 0, avatar.r);
        b.I(serialDescriptor, 1, (KSerializer) hVarArr[1].getValue(), avatar.s);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
