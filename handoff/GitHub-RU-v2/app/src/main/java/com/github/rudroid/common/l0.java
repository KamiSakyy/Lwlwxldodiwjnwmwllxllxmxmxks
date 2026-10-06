package com.github.rudroid.common;

/* loaded from: /home/user/work/p/classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9346b;

    public l0(String str, String str2) {
        k71.k.g(str, "message");
        this.f9345a = str;
        this.f9346b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.f9345a, l0Var.f9345a) && k71.k.b(this.f9346b, l0Var.f9346b);
    }

    public final int hashCode() {
        return this.f9346b.hashCode() + (this.f9345a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("SafeStringMessage(message=", this.f9345a, ", justification=", this.f9346b, ")");
    }
    public Object t(Object p1) { return null; }
}
