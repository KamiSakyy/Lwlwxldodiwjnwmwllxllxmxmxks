package com.github.service.dotcom.models.response.copilot.serialization;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class WebSearchReferenceResultResponse {
    public static final Companion Companion = new Companion();
    public String a;
    public String b;
    public String c;

    public static final class Companion {
        public final KSerializer serializer() {
            return WebSearchReferenceResultResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WebSearchReferenceResultResponse(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, WebSearchReferenceResultResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSearchReferenceResultResponse)) {
            return false;
        }
        WebSearchReferenceResultResponse webSearchReferenceResultResponse = (WebSearchReferenceResultResponse) obj;
        return k.b(this.a, webSearchReferenceResultResponse.a) && k.b(this.b, webSearchReferenceResultResponse.b) && k.b(this.c, webSearchReferenceResultResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(s0.o("WebSearchReferenceResultResponse(title=", this.a, ", url=", this.b, ", excerpt="), this.c, ")");
    }

    public WebSearchReferenceResultResponse(String str, String str2, String str3) {
        k.g(str, "title");
        k.g(str2, "url");
        k.g(str3, "excerpt");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
