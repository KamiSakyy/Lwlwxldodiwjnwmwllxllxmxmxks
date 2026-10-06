package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.m0;
import g81.e;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AiModelSupportsResponse {
    public static final Companion Companion = new Companion();
    public final boolean a;

    public static final class Companion {
        public final KSerializer serializer() {
            return AiModelSupportsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiModelSupportsResponse(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AiModelSupportsResponse) && this.a == ((AiModelSupportsResponse) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return m0.i("AiModelSupportsResponse(toolCalls=", ")", this.a);
    }
}
