package com.github.service.dotcom.models.response.copilot;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import java.util.List;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentAiModelsResponse$$serializer implements d0 {
    public static final AgentAiModelsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentAiModelsResponse$$serializer agentAiModelsResponse$$serializer = new AgentAiModelsResponse$$serializer();
        INSTANCE = agentAiModelsResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AgentAiModelsResponse", agentAiModelsResponse$$serializer, 1);
        e1Var.l("data", false);
        descriptor = e1Var;
    }

    private AgentAiModelsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AgentAiModelsResponse.b[0].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentAiModelsResponse m95deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        h[] hVarArr = AgentAiModelsResponse.b;
        List list = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else {
                if (t != 0) {
                    throw new UnknownFieldException(t);
                }
                list = (List) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), list);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        return new AgentAiModelsResponse(i, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AgentAiModelsResponse agentAiModelsResponse) {
        k.g(encoder, "encoder");
        k.g(agentAiModelsResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.I(serialDescriptor, 0, (KSerializer) AgentAiModelsResponse.b[0].getValue(), agentAiModelsResponse.a);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
