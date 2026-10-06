package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.m0;
import g81.e;
import gz.a;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatAiModelsResponse {
    public static final Companion Companion = new Companion();
    public static final h[] b = {w.s(i.r, new a(15))};
    public final List a;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatAiModelsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatAiModelsResponse(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            c1.l(i, 1, ChatAiModelsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatAiModelsResponse) && k.b(this.a, ((ChatAiModelsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m0.h("ChatAiModelsResponse(data=", ")", this.a);
    }
}
