package com.github.service.dotcom.models.response.copilot;

import a0.s0;
import g81.e;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class CreateAgentTaskPullsResponse {
    public static final Companion Companion = new Companion();
    public final long a;
    public final int b;
    public final long c;

    public static final class Companion {
        public final KSerializer serializer() {
            return CreateAgentTaskPullsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateAgentTaskPullsResponse(int i, int i2, long j, long j2) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        this.b = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAgentTaskPullsResponse)) {
            return false;
        }
        CreateAgentTaskPullsResponse createAgentTaskPullsResponse = (CreateAgentTaskPullsResponse) obj;
        return this.a == createAgentTaskPullsResponse.a && this.b == createAgentTaskPullsResponse.b && this.c == createAgentTaskPullsResponse.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + s0.b(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "CreateAgentTaskPullsResponse(id=" + this.a + ", number=" + this.b + ", repositoryId=" + this.c + ")";
    }
}
