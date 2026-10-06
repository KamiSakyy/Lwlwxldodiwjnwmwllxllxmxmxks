package com.github.service.dotcom.models.response.copilot;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTaskSessionErrorResponse {
    public static final Companion Companion = new Companion();
    public final String a;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTaskSessionErrorResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentTaskSessionErrorResponse(String str, int i) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgentTaskSessionErrorResponse) && k.b(this.a, ((AgentTaskSessionErrorResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("AgentTaskSessionErrorResponse(message=", this.a, ")");
    }
}
