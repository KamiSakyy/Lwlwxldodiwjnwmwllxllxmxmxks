package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.m0;
import g81.e;
import gz.a;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentAiModelsResponse {
    public static final Companion Companion = new Companion();
    public static final h[] b = {w.s(i.r, new a(0))};
    public List a;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentAiModelsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentAiModelsResponse(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            c1Shadow.l(i, 1, AgentAiModelsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgentAiModelsResponse) && k.b(this.a, ((AgentAiModelsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m0.h("AgentAiModelsResponse(data=", ")", this.a);
    }
}
