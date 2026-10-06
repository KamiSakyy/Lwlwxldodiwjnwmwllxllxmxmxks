package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
import k81.r0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m71.a;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentTaskArtifactDataResponse$$serializer implements d0 {
    public static final AgentTaskArtifactDataResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentTaskArtifactDataResponse$$serializer agentTaskArtifactDataResponse$$serializer = new AgentTaskArtifactDataResponse$$serializer();
        INSTANCE = agentTaskArtifactDataResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AgentTaskArtifactDataResponse", agentTaskArtifactDataResponse$$serializer, 5);
        e1Var.l("global_id", true);
        e1Var.l("id", true);
        e1Var.l("type", true);
        e1Var.l("base_ref", true);
        e1Var.l("head_ref", true);
        descriptor = e1Var;
    }

    private AgentTaskArtifactDataResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{a.z(q1Var), a.z(r0.a), a.z(q1Var), a.z(q1Var), a.z(q1Var)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentTaskArtifactDataResponse m96deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        int i = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                str = (String) b.x(serialDescriptor, 0, q1.a, str);
                i |= 1;
            } else if (t == 1) {
                l = (Long) b.x(serialDescriptor, 1, r0.a, l);
                i |= 2;
            } else if (t == 2) {
                str2 = (String) b.x(serialDescriptor, 2, q1.a, str2);
                i |= 4;
            } else if (t == 3) {
                str3 = (String) b.x(serialDescriptor, 3, q1.a, str3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                str4 = (String) b.x(serialDescriptor, 4, q1.a, str4);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new AgentTaskArtifactDataResponse(i, str, l, str2, str3, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AgentTaskArtifactDataResponse agentTaskArtifactDataResponse) {
        k.g(encoder, "encoder");
        k.g(agentTaskArtifactDataResponse, "value");
        String str = agentTaskArtifactDataResponse.e;
        String str2 = agentTaskArtifactDataResponse.d;
        String str3 = agentTaskArtifactDataResponse.c;
        Long l = agentTaskArtifactDataResponse.b;
        String str4 = agentTaskArtifactDataResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        if (b.X(serialDescriptor) || str4 != null) {
            b.H(serialDescriptor, 0, q1.a, str4);
        }
        if (b.X(serialDescriptor) || l != null) {
            b.H(serialDescriptor, 1, r0.a, l);
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
        return c1Shadow.b;
    }
}
