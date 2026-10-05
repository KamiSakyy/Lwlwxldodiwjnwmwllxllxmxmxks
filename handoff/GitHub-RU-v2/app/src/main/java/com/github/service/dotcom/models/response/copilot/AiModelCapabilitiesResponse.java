package com.github.service.dotcom.models.response.copilot;

import g81.e;
import gz.a;
import gz.b;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AiModelCapabilitiesResponse {
    public static final Companion Companion = new Companion();
    public static final h[] c = {w.s(i.r, new a(10)), null};
    public final b a;
    public final String b;

    public static final class Companion {
        public final KSerializer serializer() {
            return AiModelCapabilitiesResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiModelCapabilitiesResponse(int i, b bVar, String str) {
        this.a = (i & 1) == 0 ? b.s : bVar;
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
        if (!(obj instanceof AiModelCapabilitiesResponse)) {
            return false;
        }
        AiModelCapabilitiesResponse aiModelCapabilitiesResponse = (AiModelCapabilitiesResponse) obj;
        return this.a == aiModelCapabilitiesResponse.a && k.b(this.b, aiModelCapabilitiesResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AiModelCapabilitiesResponse(type=" + this.a + ", family=" + this.b + ")";
    }
}
