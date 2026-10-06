package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import java.util.List;
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
import m71.a;
import w61.c;
import w61.h;
import xn.c4;
import xn.d4Shadow;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class SteerAgentTaskRequest$$serializer implements d0 {
    public static final SteerAgentTaskRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SteerAgentTaskRequest$$serializer steerAgentTaskRequest$$serializer = new SteerAgentTaskRequest$$serializer();
        INSTANCE = steerAgentTaskRequest$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.SteerAgentTaskRequest", steerAgentTaskRequest$$serializer, 7);
        e1Var.l("content", true);
        e1Var.l("problem_statement", true);
        e1Var.l("type", false);
        e1Var.l("model", true);
        e1Var.l("custom_agent", true);
        e1Var.l("event_type", true);
        e1Var.l("event_identifiers", true);
        descriptor = e1Var;
    }

    private SteerAgentTaskRequest$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        h[] hVarArr = SteerAgentTaskRequest.h;
        KSerializer z = a.z(d4Shadow.a);
        KSerializer kSerializer = q1.a;
        return new KSerializer[]{z, a.z(kSerializer), kSerializer, a.z(kSerializer), a.z(kSerializer), a.z(kSerializer), a.z((KSerializer) hVarArr[6].getValue())};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SteerAgentTaskRequest m115deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = SteerAgentTaskRequest.h;
        int i = 0;
        c4 c4Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c4Var = (c4) b.x(serialDescriptor, 0, d4Shadow.a, c4Var);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.x(serialDescriptor, 1, q1.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.x(serialDescriptor, 3, q1.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.x(serialDescriptor, 4, q1.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.x(serialDescriptor, 5, q1.a, str5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.x(serialDescriptor, 6, (KSerializer) hVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new SteerAgentTaskRequest(i, c4Var, str, str2, str3, str4, str5, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SteerAgentTaskRequest steerAgentTaskRequest) {
        k.g(encoder, "encoder");
        k.g(steerAgentTaskRequest, "value");
        String str = steerAgentTaskRequest.b;
        c4 c4Var = steerAgentTaskRequest.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = SteerAgentTaskRequest.h;
        if (b.X(serialDescriptor) || c4Var != null) {
            b.H(serialDescriptor, 0, d4Shadow.a, c4Var);
        }
        if (b.X(serialDescriptor) || str != null) {
            b.H(serialDescriptor, 1, q1.a, str);
        }
        String str2 = steerAgentTaskRequest.c;
        List list = steerAgentTaskRequest.g;
        String str3 = steerAgentTaskRequest.f;
        String str4 = steerAgentTaskRequest.e;
        String str5 = steerAgentTaskRequest.d;
        b.J(serialDescriptor, 2, str2);
        if (b.X(serialDescriptor) || str5 != null) {
            b.H(serialDescriptor, 3, q1.a, str5);
        }
        if (b.X(serialDescriptor) || str4 != null) {
            b.H(serialDescriptor, 4, q1.a, str4);
        }
        if (b.X(serialDescriptor) || str3 != null) {
            b.H(serialDescriptor, 5, q1.a, str3);
        }
        if (b.X(serialDescriptor) || list != null) {
            b.H(serialDescriptor, 6, (KSerializer) hVarArr[6].getValue(), list);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
