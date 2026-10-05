package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import hz.f;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatMessageReferenceResponse$FileReferenceResponse extends a {
    public static final Companion Companion = new Companion();
    public static final h[] i = {null, null, null, null, null, null, null, w.s(i.r, new hz.e(0))};
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final f h;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatMessageReferenceResponse$FileReferenceResponse$$serializer.INSTANCE;
        }
    }

    public ChatMessageReferenceResponse$FileReferenceResponse(int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, f fVar) {
        this.a = (i2 & 1) == 0 ? 0 : i3;
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
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i2 & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i2 & 128) == 0) {
            this.h = f.t;
        } else {
            this.h = fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessageReferenceResponse$FileReferenceResponse)) {
            return false;
        }
        ChatMessageReferenceResponse$FileReferenceResponse chatMessageReferenceResponse$FileReferenceResponse = (ChatMessageReferenceResponse$FileReferenceResponse) obj;
        return this.a == chatMessageReferenceResponse$FileReferenceResponse.a && k.b(this.b, chatMessageReferenceResponse$FileReferenceResponse.b) && k.b(this.c, chatMessageReferenceResponse$FileReferenceResponse.c) && k.b(this.d, chatMessageReferenceResponse$FileReferenceResponse.d) && k.b(this.e, chatMessageReferenceResponse$FileReferenceResponse.e) && k.b(this.f, chatMessageReferenceResponse$FileReferenceResponse.f) && k.b(this.g, chatMessageReferenceResponse$FileReferenceResponse.g) && this.h == chatMessageReferenceResponse$FileReferenceResponse.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + h1.i(h1.i(h1.i(h1.i(h1.i(h1.i(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "FileReferenceResponse(repoId=", ", repoOwner=", this.b, ", repoName=");
        f1.e.x(n, this.c, ", url=", this.d, ", path=");
        f1.e.x(n, this.e, ", commitOid=", this.f, ", ref=");
        n.append(this.g);
        n.append(", type=");
        n.append(this.h);
        n.append(")");
        return n.toString();
    }

    public ChatMessageReferenceResponse$FileReferenceResponse(int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        f fVar = f.t;
        k.g(str, "repoOwner");
        k.g(str2, "repoName");
        k.g(str3, "url");
        k.g(str4, "path");
        k.g(str5, "commitOid");
        k.g(str6, "ref");
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = fVar;
    }
}
