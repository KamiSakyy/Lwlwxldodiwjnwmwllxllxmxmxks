package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTaskArtifactResponse {
    public static final Companion Companion = new Companion();
    public AgentTaskArtifactDataResponse a;
    public String b;
    public String c;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTaskArtifactResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentTaskArtifactResponse(int i, AgentTaskArtifactDataResponse agentTaskArtifactDataResponse, String str, String str2) {
        this.a = (i & 1) == 0 ? new AgentTaskArtifactDataResponse() : agentTaskArtifactDataResponse;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentTaskArtifactResponse)) {
            return false;
        }
        AgentTaskArtifactResponse agentTaskArtifactResponse = (AgentTaskArtifactResponse) obj;
        return k.b(this.a, agentTaskArtifactResponse.a) && k.b(this.b, agentTaskArtifactResponse.b) && k.b(this.c, agentTaskArtifactResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentTaskArtifactResponse(data=");
        sb.append(this.a);
        sb.append(", provider=");
        sb.append(this.b);
        sb.append(", type=");
        return h1.p(sb, this.c, ")");
    }
}
