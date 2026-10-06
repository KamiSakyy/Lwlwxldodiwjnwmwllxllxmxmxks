package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTaskCollaboratorResponse {
    public static final Companion Companion = new Companion();
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTaskCollaboratorResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentTaskCollaboratorResponse(int i, long j, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentTaskCollaboratorResponse)) {
            return false;
        }
        AgentTaskCollaboratorResponse agentTaskCollaboratorResponse = (AgentTaskCollaboratorResponse) obj;
        return this.a == agentTaskCollaboratorResponse.a && k.b(this.b, agentTaskCollaboratorResponse.b) && k.b(this.c, agentTaskCollaboratorResponse.c) && k.b(this.d, agentTaskCollaboratorResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i(h1.i(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentTaskCollaboratorResponse(agentId=");
        sb.append(this.a);
        sb.append(", agentTaskId=");
        sb.append(this.b);
        f1.e.x(sb, ", agentType=", this.c, ", slug=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
