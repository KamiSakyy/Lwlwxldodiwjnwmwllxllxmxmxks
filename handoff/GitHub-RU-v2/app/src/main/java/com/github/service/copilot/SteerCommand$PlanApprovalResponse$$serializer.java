package com.github.service.copilot;

import com.google.android.gms.internal.measurement.d5;
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
import m71.a;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SteerCommand$PlanApprovalResponse$$serializer implements d0 {
    public static final SteerCommand$PlanApprovalResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SteerCommand$PlanApprovalResponse$$serializer steerCommand$PlanApprovalResponse$$serializer = new SteerCommand$PlanApprovalResponse$$serializer();
        INSTANCE = steerCommand$PlanApprovalResponse$$serializer;
        e1 e1Var = new e1("com.github.service.copilot.SteerCommand.PlanApprovalResponse", steerCommand$PlanApprovalResponse$$serializer, 5);
        e1Var.l("promptId", false);
        e1Var.l("approved", false);
        e1Var.l("selectedAction", true);
        e1Var.l("autoApproveEdits", true);
        e1Var.l("feedback", true);
        descriptor = e1Var;
    }

    private SteerCommand$PlanApprovalResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = q1.a;
        KSerializer kSerializer2 = g.a;
        return new KSerializer[]{kSerializer, kSerializer2, a.z(kSerializer), a.z(kSerializer2), a.z(kSerializer)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SteerCommand$PlanApprovalResponse m93deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        boolean z2 = true;
        while (z2) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z2 = false;
            } else if (t == 0) {
                str = b.r(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                z = b.p(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str2 = (String) b.x(serialDescriptor, 2, q1.a, str2);
                i |= 4;
            } else if (t == 3) {
                bool = (Boolean) b.x(serialDescriptor, 3, g.a, bool);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                str3 = (String) b.x(serialDescriptor, 4, q1.a, str3);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new SteerCommand$PlanApprovalResponse(i, str, z, str2, bool, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SteerCommand$PlanApprovalResponse steerCommand$PlanApprovalResponse) {
        k.g(encoder, "encoder");
        k.g(steerCommand$PlanApprovalResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        String str = steerCommand$PlanApprovalResponse.a;
        String str2 = steerCommand$PlanApprovalResponse.e;
        Boolean bool = steerCommand$PlanApprovalResponse.d;
        String str3 = steerCommand$PlanApprovalResponse.c;
        b.J(serialDescriptor, 0, str);
        b.C(serialDescriptor, 1, steerCommand$PlanApprovalResponse.b);
        if (b.X(serialDescriptor) || str3 != null) {
            b.H(serialDescriptor, 2, q1.a, str3);
        }
        if (b.X(serialDescriptor) || bool != null) {
            b.H(serialDescriptor, 3, g.a, bool);
        }
        if (b.X(serialDescriptor) || str2 != null) {
            b.H(serialDescriptor, 4, q1.a, str2);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
