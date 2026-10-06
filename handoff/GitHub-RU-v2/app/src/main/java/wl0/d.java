package wl0;

import com.github.service.models.response.Avatar;
import wk0.c1;
import yz0.v1;

/* loaded from: /home/user/work/p/classes4.dex */
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
        this.c = b41.b.O(c1Var.g);
        this.d = c1Var.e;
        this.e = c1Var.d;
        this.f = c1Var.c;
    }

    @Override // yz0.v1
    public final String d() {
        return this.e;
    }

    @Override // yz0.v1
    public final Avatar e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.a, ((d) obj).a);
    }

    @Override // yz0.v1
    public final String f() {
        return this.d;
    }

    @Override // yz0.v1
    public final String getId() {
        return this.b;
    }

    @Override // yz0.v1
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
