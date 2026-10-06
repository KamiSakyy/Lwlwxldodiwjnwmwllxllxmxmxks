package com.github.service.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1Shadow;
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
import w61.h;
import xn.z2;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SteerCommand$PermissionResponse$$serializer implements d0 {
    public static final SteerCommand$PermissionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SteerCommand$PermissionResponse$$serializer steerCommand$PermissionResponse$$serializer = new SteerCommand$PermissionResponse$$serializer();
        INSTANCE = steerCommand$PermissionResponse$$serializer;
        e1 e1Var = new e1("com.github.service.copilot.SteerCommand.PermissionResponse", steerCommand$PermissionResponse$$serializer, 3);
        e1Var.l("promptId", false);
        e1Var.l("approved", false);
        e1Var.l("scope", false);
        descriptor = e1Var;
    }

    private SteerCommand$PermissionResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a, g.a, SteerCommand$PermissionResponse.d[2].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SteerCommand$PermissionResponse m92deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        h[] hVarArr = SteerCommand$PermissionResponse.d;
        String str = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        z2 z2Var = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                z2 = b.p(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                z2Var = (z2) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), z2Var);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new SteerCommand$PermissionResponse(i, str, z2, z2Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SteerCommand$PermissionResponse steerCommand$PermissionResponse) {
        k.g(encoder, "encoder");
        k.g(steerCommand$PermissionResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = SteerCommand$PermissionResponse.d;
        b.J(serialDescriptor, 0, steerCommand$PermissionResponse.a);
        b.C(serialDescriptor, 1, steerCommand$PermissionResponse.b);
        b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), steerCommand$PermissionResponse.c);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
