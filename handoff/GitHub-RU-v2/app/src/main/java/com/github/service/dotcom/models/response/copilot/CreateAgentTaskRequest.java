package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class CreateAgentTaskRequest {
    public static final Companion Companion = new Companion();
    public boolean a;
    public String b;
    public String c;

    public static final class Companion {
        public final KSerializer serializer() {
            return CreateAgentTaskRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateAgentTaskRequest(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            c1.l(i, 7, CreateAgentTaskRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAgentTaskRequest)) {
            return false;
        }
        CreateAgentTaskRequest createAgentTaskRequest = (CreateAgentTaskRequest) obj;
        return this.a == createAgentTaskRequest.a && k.b(this.b, createAgentTaskRequest.b) && k.b(this.c, createAgentTaskRequest.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(h1.t("CreateAgentTaskRequest(createPullRequest=", ", eventContent=", this.b, ", problemStatement=", this.a), this.c, ")");
    }
}
