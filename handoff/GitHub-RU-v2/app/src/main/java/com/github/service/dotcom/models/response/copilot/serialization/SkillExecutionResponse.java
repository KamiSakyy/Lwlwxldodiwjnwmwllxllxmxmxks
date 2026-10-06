package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SkillExecutionResponse {
    public static final Companion Companion = new Companion();
    public String a;

    public static final class Companion {
        public final KSerializer serializer() {
            return SkillExecutionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SkillExecutionResponse(String str, int i) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            c1.l(i, 1, SkillExecutionResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkillExecutionResponse) && k.b(this.a, ((SkillExecutionResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("SkillExecutionResponse(slug=", this.a, ")");
    }
}
