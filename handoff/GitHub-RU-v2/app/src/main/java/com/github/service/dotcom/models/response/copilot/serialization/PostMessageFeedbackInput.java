package com.github.service.dotcom.models.response.copilot.serialization;

import com.github.rudroid.copilot.h1;
import g81.e;
import hz.k;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.r;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class PostMessageFeedbackInput {
    public static final Companion Companion = new Companion();
    public static final h[] f;
    public final hz.b a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;

    public static final class Companion {
        public final KSerializer serializer() {
            return PostMessageFeedbackInput$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        f = new h[]{w.s(iVar, new k(5)), w.s(iVar, new k(6)), null, null, null};
    }

    public PostMessageFeedbackInput(hz.b bVar, ArrayList arrayList, String str, String str2) {
        k71.k.g(str, "messageId");
        this.a = bVar;
        this.b = arrayList;
        this.c = "";
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostMessageFeedbackInput)) {
            return false;
        }
        PostMessageFeedbackInput postMessageFeedbackInput = (PostMessageFeedbackInput) obj;
        return this.a == postMessageFeedbackInput.a && k71.k.b(this.b, postMessageFeedbackInput.b) && k71.k.b(this.c, postMessageFeedbackInput.c) && k71.k.b(this.d, postMessageFeedbackInput.d) && k71.k.b(this.e, postMessageFeedbackInput.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        return this.e.hashCode() + h1.i((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostMessageFeedbackInput(type=");
        sb.append(this.a);
        sb.append(", feedbackChoice=");
        sb.append(this.b);
        sb.append(", textResponse=");
        f1.e.x(sb, this.c, ", messageId=", this.d, ", threadId=");
        return h1.p(sb, this.e, ")");
    }

    public /* synthetic */ PostMessageFeedbackInput(int i, hz.b bVar, List list, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? hz.b.t : bVar;
        if ((i & 2) == 0) {
            this.b = r.r;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
    }
}
