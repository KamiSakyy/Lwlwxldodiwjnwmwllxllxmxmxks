package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import hz.f;
import hz.g;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatMessageReferenceResponse$RepositoryReferenceResponse extends a {
    public static final Companion Companion = new Companion();
    public static final h[] l;
    public int a;
    public String b;
    public String c;
    public hz.d d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ChatMessageReferenceInfoResponse i;
    public g j;
    public f k;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatMessageReferenceResponse$RepositoryReferenceResponse$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        l = new h[]{null, null, null, w.s(iVar, new hz.e(1)), null, null, null, null, null, w.s(iVar, new hz.e(2)), w.s(iVar, new hz.e(3))};
    }

    public ChatMessageReferenceResponse$RepositoryReferenceResponse(int i, int i2, String str, String str2, hz.d dVar, String str3, String str4, String str5, String str6, ChatMessageReferenceInfoResponse chatMessageReferenceInfoResponse, g gVar, f fVar) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = hz.d.u;
        } else {
            this.d = dVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            ChatMessageReferenceInfoResponse.Companion.getClass();
            this.i = ChatMessageReferenceInfoResponse.c;
        } else {
            this.i = chatMessageReferenceInfoResponse;
        }
        if ((i & 512) == 0) {
            this.j = g.u;
        } else {
            this.j = gVar;
        }
        if ((i & 1024) == 0) {
            this.k = f.s;
        } else {
            this.k = fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessageReferenceResponse$RepositoryReferenceResponse)) {
            return false;
        }
        ChatMessageReferenceResponse$RepositoryReferenceResponse chatMessageReferenceResponse$RepositoryReferenceResponse = (ChatMessageReferenceResponse$RepositoryReferenceResponse) obj;
        return this.a == chatMessageReferenceResponse$RepositoryReferenceResponse.a && k.b(this.b, chatMessageReferenceResponse$RepositoryReferenceResponse.b) && k.b(this.c, chatMessageReferenceResponse$RepositoryReferenceResponse.c) && this.d == chatMessageReferenceResponse$RepositoryReferenceResponse.d && k.b(this.e, chatMessageReferenceResponse$RepositoryReferenceResponse.e) && k.b(this.f, chatMessageReferenceResponse$RepositoryReferenceResponse.f) && k.b(this.g, chatMessageReferenceResponse$RepositoryReferenceResponse.g) && k.b(this.h, chatMessageReferenceResponse$RepositoryReferenceResponse.h) && k.b(this.i, chatMessageReferenceResponse$RepositoryReferenceResponse.i) && this.j == chatMessageReferenceResponse$RepositoryReferenceResponse.j && this.k == chatMessageReferenceResponse$RepositoryReferenceResponse.k;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + h1.i(h1.i(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + h1.i(h1.i((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, this.g, 31), this.h, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "RepositoryReferenceResponse(id=", ", name=", this.b, ", ownerLogin=");
        n.append(this.c);
        n.append(", ownerType=");
        n.append(this.d);
        n.append(", readmePath=");
        f1.e.x(n, this.e, ", description=", this.f, ", commitOid=");
        f1.e.x(n, this.g, ", ref=", this.h, ", chatMessageReferenceInfoResponse=");
        n.append(this.i);
        n.append(", visibility=");
        n.append(this.j);
        n.append(", type=");
        n.append(this.k);
        n.append(")");
        return n.toString();
    }

    public ChatMessageReferenceResponse$RepositoryReferenceResponse(int i, String str, String str2, hz.d dVar, String str3, String str4, String str5, String str6, ChatMessageReferenceInfoResponse chatMessageReferenceInfoResponse, g gVar) {
        f fVar = f.s;
        k.g(str, "name");
        k.g(str2, "ownerLogin");
        k.g(str5, "commitOid");
        k.g(str6, "ref");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = dVar;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = chatMessageReferenceInfoResponse;
        this.j = gVar;
        this.k = fVar;
    }
}
