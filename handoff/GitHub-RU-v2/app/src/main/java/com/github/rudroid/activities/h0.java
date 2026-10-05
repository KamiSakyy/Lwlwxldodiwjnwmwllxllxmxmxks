package com.github.rudroid.activities;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5819a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5820b;

    public h0(String str, boolean z10) {
        k71.k.g(str, "message");
        this.f5819a = str;
        this.f5820b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.f5819a, h0Var.f5819a) && this.f5820b == h0Var.f5820b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5820b) + (this.f5819a.hashCode() * 31);
    }

    public final String toString() {
        return this.f5819a;
    }
}
