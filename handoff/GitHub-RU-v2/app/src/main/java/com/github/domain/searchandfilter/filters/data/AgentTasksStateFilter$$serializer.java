package com.github.domain.searchandfilter.filters.data;

import bm.l;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
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

@w61.c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentTasksStateFilter$$serializer implements d0 {
    public static final AgentTasksStateFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentTasksStateFilter$$serializer agentTasksStateFilter$$serializer = new AgentTasksStateFilter$$serializer();
        INSTANCE = agentTasksStateFilter$$serializer;
        e1 e1Var = new e1("com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter", agentTasksStateFilter$$serializer, 4);
        e1Var.l("filterType", false);
        e1Var.l("id", true);
        e1Var.l("filter", true);
        e1Var.l("filterStates", true);
        descriptor = e1Var;
    }

    private AgentTasksStateFilter$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        w61.h[] hVarArr = AgentTasksStateFilter.x;
        return new KSerializer[]{hVarArr[0].getValue(), q1.a, hVarArr[2].getValue(), hVarArr[3].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentTasksStateFilter m24deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        w61.h[] hVarArr = AgentTasksStateFilter.x;
        int i = 0;
        l lVar = null;
        String str = null;
        cm.a aVar = null;
        List list = null;
        boolean z = true;
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
            } else if (t == 2) {
                aVar = (cm.a) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), aVar);
                i |= 4;
            } else {
                if (t != 3) {
                    throw new UnknownFieldException(t);
                }
                list = (List) b.A(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.g(serialDescriptor);
        return new AgentTasksStateFilter(i, lVar, str, aVar, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, AgentTasksStateFilter agentTasksStateFilter) {
        k.g(encoder, "encoder");
        k.g(agentTasksStateFilter, "value");
        List list = agentTasksStateFilter.w;
        cm.a aVar = agentTasksStateFilter.v;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        AgentTasksStateFilter.Companion companion = AgentTasksStateFilter.Companion;
        d.y(agentTasksStateFilter, b, serialDescriptor);
        w61.h[] hVarArr = AgentTasksStateFilter.x;
        if (b.X(serialDescriptor) || aVar != AgentTasksStateFilter.y) {
            b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), aVar);
        }
        if (b.X(serialDescriptor) || !k.b(list, aVar.r)) {
            b.I(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), list);
        }
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
