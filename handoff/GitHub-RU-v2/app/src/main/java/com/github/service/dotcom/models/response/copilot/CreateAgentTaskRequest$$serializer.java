package com.github.service.dotcom.models.response.copilot;

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

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class CreateAgentTaskRequest$$serializer implements d0 {
    public static final CreateAgentTaskRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CreateAgentTaskRequest$$serializer createAgentTaskRequest$$serializer = new CreateAgentTaskRequest$$serializer();
        INSTANCE = createAgentTaskRequest$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.CreateAgentTaskRequest", createAgentTaskRequest$$serializer, 3);
        e1Var.l("create_pull_request", false);
        e1Var.l("event_content", false);
        e1Var.l("problem_statement", false);
        descriptor = e1Var;
    }

    private CreateAgentTaskRequest$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{g.a, q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CreateAgentTaskRequest m112deserialize(Decoder decoder) {
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
                z2 = b.p(serialDescriptor, 0);
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
        return new CreateAgentTaskRequest(i, str, str2, z2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CreateAgentTaskRequest createAgentTaskRequest) {
        k.g(encoder, "encoder");
        k.g(createAgentTaskRequest, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.C(serialDescriptor, 0, createAgentTaskRequest.a);
        b.J(serialDescriptor, 1, createAgentTaskRequest.b);
        b.J(serialDescriptor, 2, createAgentTaskRequest.c);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
