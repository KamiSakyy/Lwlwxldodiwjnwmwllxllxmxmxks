package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class PatchThreadNameResponse {
    public static final Companion Companion = new Companion();
    public final String a;

    public static final class Companion {
        public final KSerializer serializer() {
            return PatchThreadNameResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PatchThreadNameResponse(String str, int i) {
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
        return (obj instanceof PatchThreadNameResponse) && k.b(this.a, ((PatchThreadNameResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("PatchThreadNameResponse(name=", this.a, ")");
    }
}
