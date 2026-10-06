package kx0;

import m7.y;
import uu0.h3;
import uu0.i3;
import uu0.j3;
import uu0.k3;
import yz0.u1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements u1 {
    public k3 a;
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

    public c(k3 k3Var) {
        k71.k.g(k3Var, "fragment");
        this.a = k3Var;
        this.b = k3Var.c;
        this.c = k3Var.d;
        this.d = k3Var.f;
        h3 h3Var = k3Var.h;
        this.e = new com.github.service.models.response.a(h3Var.c, y.L(h3Var.d), (String) null, false, (String) null, 60);
        j3 j3Var = k3Var.i;
        this.f = j3Var != null ? j3Var.b : null;
        this.g = j3Var != null ? j3Var.a : null;
        this.h = k3Var.b;
        this.i = k3Var.r.c;
        this.j = k3Var.o;
        i3 i3Var = k3Var.p;
        this.k = i3Var != null ? f1.e.h(i3Var.b.b, "/", i3Var.a) : null;
    }

    @Override // yz0.u1
    public final com.github.service.models.response.a a() {
        return this.e;
    }

    @Override // yz0.u1
    public final String b() {
        return this.f;
    }

    @Override // yz0.u1
    public final String c() {
        return this.g;
    }

    @Override // yz0.u1
    public final boolean d() {
        return this.d;
    }

    @Override // yz0.u1
    public final int e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
    }

    @Override // yz0.u1
    public final boolean f() {
        return this.j;
    }

    @Override // yz0.u1
    public final String g() {
        return this.h;
    }

    @Override // yz0.u1
    public final String getId() {
        return this.b;
    }

    @Override // yz0.u1
    public final String getName() {
        return this.c;
    }

    @Override // yz0.u1
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
