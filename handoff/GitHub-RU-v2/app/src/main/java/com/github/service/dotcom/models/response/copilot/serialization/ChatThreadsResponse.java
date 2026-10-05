package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.m0;
import g81.e;
import hz.k;
import java.util.List;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.r;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatThreadsResponse {
    public static final Companion Companion = new Companion();
    public static final h[] b = {w.s(i.r, new k(4))};
    public final List a;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatThreadsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatThreadsResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = r.r;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatThreadsResponse) && k71.k.b(this.a, ((ChatThreadsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m0.h("ChatThreadsResponse(threads=", ")", this.a);
    }
}
