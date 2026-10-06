package com.github.service.dotcom.models.response.copilot;

import g81.e;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AiModelBillingResponse {
    public static final Companion Companion = new Companion();
    public boolean a;
    public double b;

    public static final class Companion {
        public final KSerializer serializer() {
            return AiModelBillingResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AiModelBillingResponse(int i, boolean z, double d) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiModelBillingResponse)) {
            return false;
        }
        AiModelBillingResponse aiModelBillingResponse = (AiModelBillingResponse) obj;
        return this.a == aiModelBillingResponse.a && Double.compare(this.b, aiModelBillingResponse.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AiModelBillingResponse(isPremium=" + this.a + ", multiplier=" + this.b + ")";
    }
}
