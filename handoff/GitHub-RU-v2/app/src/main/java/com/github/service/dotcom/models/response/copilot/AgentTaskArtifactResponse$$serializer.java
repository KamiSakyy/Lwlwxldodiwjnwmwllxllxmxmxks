package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
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
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentTaskArtifactResponse$$serializer implements d0 {
    public static final AgentTaskArtifactResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentTaskArtifactResponse$$serializer agentTaskArtifactResponse$$serializer = new AgentTaskArtifactResponse$$serializer();
        INSTANCE = agentTaskArtifactResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AgentTaskArtifactResponse", agentTaskArtifactResponse$$serializer, 3);
        e1Var.l("data", true);
        e1Var.l("provider", true);
        e1Var.l("type", true);
        descriptor = e1Var;
    }

    private AgentTaskArtifactResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{AgentTaskArtifactDataResponse$$serializer.INSTANCE, q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentTaskArtifactResponse m97deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        AgentTaskArtifactDataResponse agentTaskArtifactDataResponse = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                agentTaskArtifactDataResponse = (AgentTaskArtifactDataResponse) b.A(serialDescriptor, 0, AgentTaskArtifactDataResponse$$serializer.INSTANCE, agentTaskArtifactDataResponse);
                i |= 1;
            } else if (t == 1) {
                str = b.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                str2 = b.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new AgentTaskArtifactResponse(i, agentTaskArtifactDataResponse, str, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AgentTaskArtifactResponse agentTaskArtifactResponse) {
        k.g(encoder, "encoder");
        k.g(agentTaskArtifactResponse, "value");
        String str = agentTaskArtifactResponse.c;
        String str2 = agentTaskArtifactResponse.b;
        AgentTaskArtifactDataResponse agentTaskArtifactDataResponse = agentTaskArtifactResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        if (b.X(serialDescriptor) || !k.b(agentTaskArtifactDataResponse, new AgentTaskArtifactDataResponse())) {
            b.I(serialDescriptor, 0, AgentTaskArtifactDataResponse$$serializer.INSTANCE, agentTaskArtifactDataResponse);
        }
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 1, str2);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 2, str);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
