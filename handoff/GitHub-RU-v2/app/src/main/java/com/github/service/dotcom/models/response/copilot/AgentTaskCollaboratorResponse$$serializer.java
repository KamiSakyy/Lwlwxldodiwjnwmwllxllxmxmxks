package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.q1;
import k81.r0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentTaskCollaboratorResponse$$serializer implements d0 {
    public static final AgentTaskCollaboratorResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentTaskCollaboratorResponse$$serializer agentTaskCollaboratorResponse$$serializer = new AgentTaskCollaboratorResponse$$serializer();
        INSTANCE = agentTaskCollaboratorResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AgentTaskCollaboratorResponse", agentTaskCollaboratorResponse$$serializer, 4);
        e1Var.l("agent_id", true);
        e1Var.l("agent_task_id", true);
        e1Var.l("agent_type", true);
        e1Var.l("slug", true);
        descriptor = e1Var;
    }

    private AgentTaskCollaboratorResponse$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{r0.a, q1Var, q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentTaskCollaboratorResponse m98deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else if (t == 1) {
                str = b.r(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                str2 = b.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                str3 = b.r(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new AgentTaskCollaboratorResponse(i, j, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AgentTaskCollaboratorResponse agentTaskCollaboratorResponse) {
        k.g(encoder, "encoder");
        k.g(agentTaskCollaboratorResponse, "value");
        String str = agentTaskCollaboratorResponse.d;
        String str2 = agentTaskCollaboratorResponse.c;
        String str3 = agentTaskCollaboratorResponse.b;
        long j = agentTaskCollaboratorResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        if (b.X(serialDescriptor) || j != 0) {
            b.G(serialDescriptor, 0, j);
        }
        if (b.X(serialDescriptor) || !k.b(str3, "")) {
            b.J(serialDescriptor, 1, str3);
        }
        if (b.X(serialDescriptor) || !k.b(str2, "")) {
            b.J(serialDescriptor, 2, str2);
        }
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 3, str);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
