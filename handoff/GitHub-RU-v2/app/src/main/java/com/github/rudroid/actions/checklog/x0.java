package com.github.rudroid.actions.checklog;

/* loaded from: /home/user/work/p/classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final q71.g f4907a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f4908b;

    public x0(q71.g gVar, m0 m0Var) {
        k71.k.g(gVar, "range");
        k71.k.g(m0Var, "value");
        this.f4907a = gVar;
        this.f4908b = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.f4907a, x0Var.f4907a) && k71.k.b(this.f4908b, x0Var.f4908b);
    }

    public final int hashCode() {
        return this.f4908b.hashCode() + (this.f4907a.hashCode() * 31);
    }

    public final String toString() {
        return "RangedFormattingInstruction(range=" + this.f4907a + ", value=" + this.f4908b + ")";
    }
}
