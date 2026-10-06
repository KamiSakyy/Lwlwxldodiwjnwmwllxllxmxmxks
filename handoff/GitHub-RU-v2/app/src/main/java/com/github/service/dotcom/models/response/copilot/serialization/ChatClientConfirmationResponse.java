package com.github.service.dotcom.models.response.copilot.serialization;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.s;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatClientConfirmationResponse {
    public static final Companion Companion = new Companion();
    public static final h[] c = {w.s(i.r, new gz.a(24)), null};
    public final hz.a a;
    public final kotlinx.serialization.json.c b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatClientConfirmationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatClientConfirmationResponse(int i, hz.a aVar, kotlinx.serialization.json.c cVar) {
        this.a = (i & 1) == 0 ? hz.a.t : aVar;
        if ((i & 2) == 0) {
            this.b = new kotlinx.serialization.json.c(s.r);
        } else {
            this.b = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatClientConfirmationResponse)) {
            return false;
        }
        ChatClientConfirmationResponse chatClientConfirmationResponse = (ChatClientConfirmationResponse) obj;
        return this.a == chatClientConfirmationResponse.a && k.b(this.b, chatClientConfirmationResponse.b);
    }

    public final int hashCode() {
        return this.b.r.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatClientConfirmationResponse(state=" + this.a + ", confirmation=" + this.b + ")";
    }

    public ChatClientConfirmationResponse(hz.a aVar, kotlinx.serialization.json.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }
}
