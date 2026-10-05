package com.github.service.copilot;

import com.google.android.gms.internal.measurement.d5;
import java.util.Map;
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
import m71.a;
import w61.c;
import w61.h;
import xn.g1;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SteerCommand$ElicitationResponse$$serializer implements d0 {
    public static final SteerCommand$ElicitationResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SteerCommand$ElicitationResponse$$serializer steerCommand$ElicitationResponse$$serializer = new SteerCommand$ElicitationResponse$$serializer();
        INSTANCE = steerCommand$ElicitationResponse$$serializer;
        e1 e1Var = new e1("com.github.service.copilot.SteerCommand.ElicitationResponse", steerCommand$ElicitationResponse$$serializer, 3);
        e1Var.l("promptId", false);
        e1Var.l("action", false);
        e1Var.l("content", true);
        descriptor = e1Var;
    }

    private SteerCommand$ElicitationResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = SteerCommand$ElicitationResponse.d;
        return new KSerializer[]{q1.a, hVarArr[1].getValue(), a.z((KSerializer) hVarArr[2].getValue())};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SteerCommand$ElicitationResponse m91deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = SteerCommand$ElicitationResponse.d;
        String str = null;
        boolean z = true;
        int i = 0;
        g1 g1Var = null;
        Map map = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                g1Var = (g1) b.A(serialDescriptor, 1, (KSerializer) hVarArr[1].getValue(), g1Var);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                map = (Map) b.x(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new SteerCommand$ElicitationResponse(i, str, g1Var, map);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SteerCommand$ElicitationResponse steerCommand$ElicitationResponse) {
        k.g(encoder, "encoder");
        k.g(steerCommand$ElicitationResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = SteerCommand$ElicitationResponse.d;
        String str = steerCommand$ElicitationResponse.a;
        Map map = steerCommand$ElicitationResponse.c;
        b.J(serialDescriptor, 0, str);
        b.I(serialDescriptor, 1, (KSerializer) hVarArr[1].getValue(), steerCommand$ElicitationResponse.b);
        if (b.X(serialDescriptor) || map != null) {
            b.H(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), map);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
