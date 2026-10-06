package e50;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 {
    public String a;
    public String b;
    public w0 c;
    public boolean d;
    public String e;

    public x0(String str, String str2, w0 w0Var, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = w0Var;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c) && this.d == x0Var.d && k71.k.b(this.e, x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x.i.e((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", isOrganizationDiscussionRepository=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
