package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s1 implements Cloneable {
    public t1 r;
    public t1 s;

    public s1(t1 t1Var) {
        this.r = t1Var;
        if (t1Var.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.s = t1Var.n();
    }

    public final t1 a() {
        t1 b = b();
        b.getClass();
        if (t1.i(b, true)) {
            return b;
        }
        throw new zzia();
    }

    public final t1 b() {
        if (!this.s.h()) {
            return this.s;
        }
        t1 t1Var = this.s;
        t1Var.getClass();
        l2.c.a(t1Var.getClass()).c(t1Var);
        t1Var.e();
        return this.s;
    }

    public final void c() {
        if (this.s.h()) {
            return;
        }
        t1 n = this.r.n();
        l2.c.a(n.getClass()).h(n, this.s);
        this.s = n;
    }

    public final Object clone() {
        s1 s1Var = (s1) this.r.j(5);
        s1Var.s = b();
        return s1Var;
    }
}
