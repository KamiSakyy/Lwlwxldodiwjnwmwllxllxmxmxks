package bb0;

import t.q;
import w80.a2;
import w80.x1;
import w80.y1;
import w80.z1;
import yz0.u1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements u1 {
    public a2 a;
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

    public c(a2 a2Var) {
        k71.k.g(a2Var, "fragment");
        this.a = a2Var;
        this.b = a2Var.c;
        this.c = a2Var.d;
        this.d = a2Var.f;
        x1 x1Var = a2Var.h;
        this.e = new com.github.service.models.response.a(x1Var.c, q.q(x1Var.d), (String) null, false, (String) null, 60);
        z1 z1Var = a2Var.i;
        this.f = z1Var != null ? z1Var.b : null;
        this.g = z1Var != null ? z1Var.a : null;
        this.h = a2Var.b;
        this.i = a2Var.r.c;
        this.j = a2Var.o;
        y1 y1Var = a2Var.p;
        this.k = y1Var != null ? f1.e.h(y1Var.b.b, "/", y1Var.a) : null;
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
