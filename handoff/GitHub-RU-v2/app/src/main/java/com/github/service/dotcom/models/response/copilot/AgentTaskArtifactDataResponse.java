package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTaskArtifactDataResponse {
    public static final Companion Companion = new Companion();
    public final String a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTaskArtifactDataResponse$$serializer.INSTANCE;
        }
    }

    public AgentTaskArtifactDataResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentTaskArtifactDataResponse)) {
            return false;
        }
        AgentTaskArtifactDataResponse agentTaskArtifactDataResponse = (AgentTaskArtifactDataResponse) obj;
        return k.b(this.a, agentTaskArtifactDataResponse.a) && k.b(this.b, agentTaskArtifactDataResponse.b) && k.b(this.c, agentTaskArtifactDataResponse.c) && k.b(this.d, agentTaskArtifactDataResponse.d) && k.b(this.e, agentTaskArtifactDataResponse.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentTaskArtifactDataResponse(globalId=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", type=");
        f1.e.x(sb, this.c, ", baseRef=", this.d, ", headRef=");
        return h1.p(sb, this.e, ")");
    }

    public /* synthetic */ AgentTaskArtifactDataResponse(int i, String str, Long l, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }
}
