package wl0;

import oj0.b2;
import oj0.c2;
import oj0.d2;
import oj0.e2;
import yz0.u1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements u1 {
    public final e2 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final com.github.service.models.response.a e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;
    public final String k;

    public c(e2 e2Var) {
        k71.k.g(e2Var, "fragment");
        this.a = e2Var;
        this.b = e2Var.c;
        this.c = e2Var.d;
        this.d = e2Var.f;
        b2 b2Var = e2Var.h;
        this.e = new com.github.service.models.response.a(b2Var.c, b41.b.O(b2Var.d), (String) null, false, (String) null, 60);
        d2 d2Var = e2Var.i;
        this.f = d2Var != null ? d2Var.b : null;
        this.g = d2Var != null ? d2Var.a : null;
        this.h = e2Var.b;
        this.i = e2Var.r.c;
        this.j = e2Var.o;
        c2 c2Var = e2Var.p;
        this.k = c2Var != null ? f1.e.h(c2Var.b.b, "/", c2Var.a) : null;
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
