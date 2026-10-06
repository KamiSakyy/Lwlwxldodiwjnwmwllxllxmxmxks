package io0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements s01.m {
    public String a;
    public String b;
    public int c;

    public h(String str, int i, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repositoryName");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // s01.m
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && this.c == hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return s0.l(s0.o("DiscussionCommentsQueryParameters(owner=", this.a, ", repositoryName=", this.b, ", discussionNumber="), this.c, ")");
    }
}
