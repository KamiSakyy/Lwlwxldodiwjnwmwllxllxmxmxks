package com.github.service.dotcom.models.response.copilot;

import g81.e;
import gz.a;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.r;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTasksResponse {
    public static final Companion Companion = new Companion();
    public static final h[] c = {null, w.s(i.r, new a(9))};
    public boolean a;
    public List b;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTasksResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentTasksResponse(int i, List list, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = r.r;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentTasksResponse)) {
            return false;
        }
        AgentTasksResponse agentTasksResponse = (AgentTasksResponse) obj;
        return this.a == agentTasksResponse.a && k.b(this.b, agentTasksResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AgentTasksResponse(hasNextPage=" + this.a + ", tasks=" + this.b + ")";
    }
}
