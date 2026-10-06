package com.github.rudroid.comment;

import yz0.x2;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f8975a;

    /* renamed from: b, reason: collision with root package name */
    public x2 f8976b;

    public p(String str, x2 x2Var) {
        k71.k.g(str, "subjectId");
        k71.k.g(x2Var, "minimizedState");
        this.f8975a = str;
        this.f8976b = x2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.f8975a, pVar.f8975a) && k71.k.b(this.f8976b, pVar.f8976b);
    }

    public final int hashCode() {
        return this.f8976b.hashCode() + (this.f8975a.hashCode() * 31);
    }

    public final String toString() {
        return "MinimizeCommentEvent(subjectId=" + this.f8975a + ", minimizedState=" + this.f8976b + ")";
    }
}
