package com.github.service.agents;

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
import m71.a;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentAssignment$$serializer implements d0 {
    public static final AgentAssignment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentAssignment$$serializer agentAssignment$$serializer = new AgentAssignment$$serializer();
        INSTANCE = agentAssignment$$serializer;
        e1 e1Var = new e1("com.github.service.agents.AgentAssignment", agentAssignment$$serializer, 5);
        e1Var.l("targetRepositoryId", true);
        e1Var.l("baseRef", true);
        e1Var.l("customInstructions", true);
        e1Var.l("customAgent", true);
        e1Var.l("model", true);
        descriptor = e1Var;
    }

    private AgentAssignment$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{a.z(q1Var), a.z(q1Var), a.z(q1Var), a.z(q1Var), a.z(q1Var)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentAssignment m89deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = (String) b.x(serialDescriptor, 0, q1.a, str);
                i |= 1;
            } else if (t == 1) {
                str2 = (String) b.x(serialDescriptor, 1, q1.a, str2);
                i |= 2;
            } else if (t == 2) {
                str3 = (String) b.x(serialDescriptor, 2, q1.a, str3);
                i |= 4;
            } else if (t == 3) {
                str4 = (String) b.x(serialDescriptor, 3, q1.a, str4);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                str5 = (String) b.x(serialDescriptor, 4, q1.a, str5);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new AgentAssignment(i, str, str2, str3, str4, str5);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AgentAssignment agentAssignment) {
        k.g(encoder, "encoder");
        k.g(agentAssignment, "value");
        String str = agentAssignment.v;
        String str2 = agentAssignment.u;
        String str3 = agentAssignment.t;
        String str4 = agentAssignment.s;
        String str5 = agentAssignment.r;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        if (b.X(serialDescriptor) || str5 != null) {
            b.H(serialDescriptor, 0, q1.a, str5);
        }
        if (b.X(serialDescriptor) || str4 != null) {
            b.H(serialDescriptor, 1, q1.a, str4);
        }
        if (b.X(serialDescriptor) || str3 != null) {
            b.H(serialDescriptor, 2, q1.a, str3);
        }
        if (b.X(serialDescriptor) || str2 != null) {
            b.H(serialDescriptor, 3, q1.a, str2);
        }
        if (b.X(serialDescriptor) || str != null) {
            b.H(serialDescriptor, 4, q1.a, str);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
