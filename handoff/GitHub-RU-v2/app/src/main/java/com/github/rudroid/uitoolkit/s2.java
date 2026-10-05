package com.github.rudroid.uitoolkit;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s2 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;

    public s2(int i, String str, String str2, String str3, boolean z) {
        k71.k.g(str2, "subjectId");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return k71.k.b(this.a, s2Var.a) && this.b == s2Var.b && k71.k.b(this.c, s2Var.c) && k71.k.b(this.d, s2Var.d) && this.e == s2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "SimpleReaction(emoji=", this.a, ", count=", ", subjectId=");
        f1.e.x(n, this.c, ", contentType=", this.d, ", viewerHasReacted=");
        return f4.s(n, this.e, ")");
    }
}
