package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import hz.f;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatMessageReferenceResponse$UnknownReferenceResponse extends a {
    public static final Companion Companion = new Companion();
    public static final h[] b = {w.s(i.r, new hz.e(4))};
    public final f a;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatMessageReferenceResponse$UnknownReferenceResponse$$serializer.INSTANCE;
        }
    }

    public ChatMessageReferenceResponse$UnknownReferenceResponse(int i, f fVar) {
        if ((i & 1) == 0) {
            this.a = f.v;
        } else {
            this.a = fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatMessageReferenceResponse$UnknownReferenceResponse) && this.a == ((ChatMessageReferenceResponse$UnknownReferenceResponse) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnknownReferenceResponse(type=" + this.a + ")";
    }
}
