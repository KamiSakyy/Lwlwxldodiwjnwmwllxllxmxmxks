package com.github.rudroid.main;

import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f16846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16848c;

    public g(String str, String str2, boolean z10) {
        k71.k.g(str2, "login");
        this.f16846a = str;
        this.f16847b = str2;
        this.f16848c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.f16846a, gVar.f16846a) && k71.k.b(this.f16847b, gVar.f16847b) && this.f16848c == gVar.f16848c;
    }

    public final int hashCode() {
        String str = this.f16846a;
        return Boolean.hashCode(this.f16848c) + com.github.rudroid.copilot.h1.i((str == null ? 0 : str.hashCode()) * 31, this.f16847b, 31);
    }

    public final String toString() {
        return f4.s(a0.s0.o("LoggedAccountInfo(avatarUrl=", this.f16846a, ", login=", this.f16847b, ", isDotcomUser="), this.f16848c, ")");
    }
}
