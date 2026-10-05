package com.github.service.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.g;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SteerCommand$AskUserResponse$$serializer implements d0 {
    public static final SteerCommand$AskUserResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SteerCommand$AskUserResponse$$serializer steerCommand$AskUserResponse$$serializer = new SteerCommand$AskUserResponse$$serializer();
        INSTANCE = steerCommand$AskUserResponse$$serializer;
        e1 e1Var = new e1("com.github.service.copilot.SteerCommand.AskUserResponse", steerCommand$AskUserResponse$$serializer, 3);
        e1Var.l("promptId", false);
        e1Var.l("answer", false);
        e1Var.l("wasFreeform", false);
        descriptor = e1Var;
    }

    private SteerCommand$AskUserResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, g.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SteerCommand$AskUserResponse m90deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str2 = null;
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
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                z2 = b.p(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new SteerCommand$AskUserResponse(i, str, str2, z2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SteerCommand$AskUserResponse steerCommand$AskUserResponse) {
        k.g(encoder, "encoder");
        k.g(steerCommand$AskUserResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, steerCommand$AskUserResponse.a);
        b.J(serialDescriptor, 1, steerCommand$AskUserResponse.b);
        b.C(serialDescriptor, 2, steerCommand$AskUserResponse.c);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
