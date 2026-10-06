package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import hz.i;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import x61.r;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatServerSentEventDataResponse$Complete extends c {
    public static final Companion Companion = new Companion();
    public static final h[] i;
    public final i a;
    public final String b;
    public final String c;
    public final String d;
    public final ChatMessageAnnotationsResponse e;
    public final String f;
    public final List g;
    public final hz.h h;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatServerSentEventDataResponse$Complete$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        i = new h[]{w.s(iVar, new hz.e(16)), null, null, null, null, null, w.s(iVar, new hz.e(17)), w.s(iVar, new hz.e(18))};
    }

    public ChatServerSentEventDataResponse$Complete(int i2, i iVar, String str, String str2, String str3, ChatMessageAnnotationsResponse chatMessageAnnotationsResponse, String str4, List list, hz.h hVar) {
        this.a = (i2 & 1) == 0 ? i.w : iVar;
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i2 & 16) == 0) {
            this.e = new ChatMessageAnnotationsResponse();
        } else {
            this.e = chatMessageAnnotationsResponse;
        }
        if ((i2 & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i2 & 64) == 0) {
            this.g = r.r;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = hz.h.s;
        } else {
            this.h = hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatServerSentEventDataResponse$Complete)) {
            return false;
        }
        ChatServerSentEventDataResponse$Complete chatServerSentEventDataResponse$Complete = (ChatServerSentEventDataResponse$Complete) obj;
        return this.a == chatServerSentEventDataResponse$Complete.a && k.b(this.b, chatServerSentEventDataResponse$Complete.b) && k.b(this.c, chatServerSentEventDataResponse$Complete.c) && k.b(this.d, chatServerSentEventDataResponse$Complete.d) && k.b(this.e, chatServerSentEventDataResponse$Complete.e) && k.b(this.f, chatServerSentEventDataResponse$Complete.f) && k.b(this.g, chatServerSentEventDataResponse$Complete.g) && this.h == chatServerSentEventDataResponse$Complete.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + f1.e.c(this.g, h1.i(f1.e.c(this.e.a, h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31), this.f, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Complete(type=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", threadId=");
        f1.e.x(sb, this.c, ", body=", this.d, ", copilotAnnotations=");
        sb.append(this.e);
        sb.append(", createdAt=");
        sb.append(this.f);
        sb.append(", references=");
        sb.append(this.g);
        sb.append(", role=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public ChatServerSentEventDataResponse$Complete(String str) {
        i iVar = i.w;
        ChatMessageAnnotationsResponse chatMessageAnnotationsResponse = new ChatMessageAnnotationsResponse();
        hz.h hVar = hz.h.s;
        this.a = iVar;
        this.b = str;
        this.c = "";
        this.d = "";
        this.e = chatMessageAnnotationsResponse;
        this.f = "";
        this.g = r.r;
        this.h = hVar;
    }
}
