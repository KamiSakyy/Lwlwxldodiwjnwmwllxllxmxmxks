package com.github.service.dotcom.models.response.copilot;

import g81.e;
import gz.a;
import gz.c;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AiModelPolicyResponse {
    public static final Companion Companion = new Companion();
    public static final h[] c = {w.s(i.r, new a(12)), null};
    public final c a;
    public final String b;

    public static final class Companion {
        public final KSerializer serializer() {
            return AiModelPolicyResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiModelPolicyResponse(int i, c cVar, String str) {
        this.a = (i & 1) == 0 ? c.r : cVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiModelPolicyResponse)) {
            return false;
        }
        AiModelPolicyResponse aiModelPolicyResponse = (AiModelPolicyResponse) obj;
        return this.a == aiModelPolicyResponse.a && k.b(this.b, aiModelPolicyResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AiModelPolicyResponse(state=" + this.a + ", terms=" + this.b + ")";
    }
}
