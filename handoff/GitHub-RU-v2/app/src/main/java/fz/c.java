package fz;

import dw.j3;
import dw.k3;
import dw.l3;
import dw.m3;
import w8.s;
import yz0.u1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements u1 {
    public m3 a;
    public String b;
    public String c;
    public boolean d;
    public com.github.service.models.response.a e;
    public String f;
    public String g;
    public String h;
    public int i;
    public boolean j;
    public String k;

    public c(m3 m3Var) {
        k71.k.g(m3Var, "fragment");
        this.a = m3Var;
        this.b = m3Var.c;
        this.c = m3Var.d;
        this.d = m3Var.f;
        j3 j3Var = m3Var.h;
        this.e = new com.github.service.models.response.a(j3Var.c, s.A(j3Var.d), (String) null, false, (String) null, 60);
        l3 l3Var = m3Var.i;
        this.f = l3Var != null ? l3Var.b : null;
        this.g = l3Var != null ? l3Var.a : null;
        this.h = m3Var.b;
        this.i = m3Var.r.c;
        this.j = m3Var.o;
        k3 k3Var = m3Var.p;
        this.k = k3Var != null ? f1.e.h(k3Var.b.b, "/", k3Var.a) : null;
    }

    public final com.github.service.models.response.a a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final boolean d() {
        return this.d;
    }

    public final int e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
    }

    public final boolean f() {
        return this.j;
    }

    public final String g() {
        return this.h;
    }

    public final String getId() {
        return this.b;
    }

    public final String getName() {
        return this.c;
    }

    public final String getParent() {
        return this.k;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ApolloSearchRepo(fragment=" + this.a + ")";
    }
}
