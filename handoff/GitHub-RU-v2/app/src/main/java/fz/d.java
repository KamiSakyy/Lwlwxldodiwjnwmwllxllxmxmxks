package fz;

import com.github.service.models.response.Avatar;
import qx.c1;
import w8.s;
import yz0.v1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements v1 {
    public c1 a;
    public String b;
    public Avatar c;
    public String d;
    public String e;
    public String f;

    public d(c1 c1Var) {
        k71.k.g(c1Var, "fragment");
        this.a = c1Var;
        this.b = c1Var.b;
        this.c = s.A(c1Var.g);
        this.d = c1Var.e;
        this.e = c1Var.d;
        this.f = c1Var.c;
    }

    public final String d() {
        return this.e;
    }

    public final Avatar e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.a, ((d) obj).a);
    }

    public final String f() {
        return this.d;
    }

    public final String getId() {
        return this.b;
    }

    public final String getName() {
        return this.f;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ApolloSearchUser(fragment=" + this.a + ")";
    }
}
