package com.github.rudroid.home;

/* loaded from: /home/user/work/p/classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public fl.f f15013a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.common.collect.d f15014b;

    /* renamed from: c, reason: collision with root package name */
    public com.github.rudroid.main.g f15015c;

    public q0(fl.f fVar, com.google.common.collect.d dVar, com.github.rudroid.main.g gVar) {
        this.f15013a = fVar;
        this.f15014b = dVar;
        this.f15015c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.f15013a, q0Var.f15013a) && k71.k.b(this.f15014b, q0Var.f15014b) && k71.k.b(this.f15015c, q0Var.f15015c);
    }

    public final int hashCode() {
        return this.f15015c.hashCode() + ((this.f15014b.hashCode() + (this.f15013a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HomeUiModel(items=" + this.f15013a + ", accountsInfo=" + this.f15014b + ", activeLoggedAccount=" + this.f15015c + ")";
    }
}
