package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter;
import com.github.service.agents.AgentAssignment;
import com.github.service.agents.AgentAssignment$$serializer;
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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class CustomInstructionsFilter$$serializer implements d0 {
    public static final CustomInstructionsFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CustomInstructionsFilter$$serializer customInstructionsFilter$$serializer = new CustomInstructionsFilter$$serializer();
        INSTANCE = customInstructionsFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter", customInstructionsFilter$$serializer, 3);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("agentAssignment", true);
        descriptor = e1Var;
    }

    private CustomInstructionsFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CustomInstructionsFilter.w[0].getValue(), q1.a, m71.a.z(AgentAssignment$$serializer.INSTANCE)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final CustomInstructionsFilter m28deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = CustomInstructionsFilter.w;
        l lVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        AgentAssignment agentAssignment = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else if (t == 0) {
                lVar = (l) b.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), lVar);
                i |= 1;
            } else if (t == 1) {
                str = b.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t != 2) {
                    throw new UnknownFieldException(t);
                }
                agentAssignment = (AgentAssignment) b.x(serialDescriptor, 2, AgentAssignment$$serializer.INSTANCE, agentAssignment);
                i |= 4;
            }
        }
        b.g(serialDescriptor);
        return new CustomInstructionsFilter(i, lVar, str, agentAssignment);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, CustomInstructionsFilter customInstructionsFilter) {
        k.g(encoder, "encoder");
        k.g(customInstructionsFilter, "value");
        AgentAssignment agentAssignment = customInstructionsFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        CustomInstructionsFilter.Companion companion = CustomInstructionsFilter.Companion;
        d.y(customInstructionsFilter, b, serialDescriptor);
        if (b.X(serialDescriptor) || agentAssignment != null) {
            b.H(serialDescriptor, 2, AgentAssignment$$serializer.INSTANCE, agentAssignment);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
