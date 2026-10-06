package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ib0 {
    public final String a;
    public final boolean b;
    public final List c;
    public final fb0 d;
    public final String e;

    public ib0(String str, boolean z, List list, fb0 fb0Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = fb0Var;
        this.e = str2;
    }

    public static ib0 a(ib0 ib0Var, fb0 fb0Var) {
        String str = ib0Var.a;
        boolean z = ib0Var.b;
        List list = ib0Var.c;
        String str2 = ib0Var.e;
        ib0Var.getClass();
        return new ib0(str, z, list, fb0Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        return k71.k.b(this.a, ib0Var.a) && this.b == ib0Var.b && k71.k.b(this.c, ib0Var.c) && k71.k.b(this.d, ib0Var.d) && k71.k.b(this.e, ib0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + f1.e.c(this.c, x.i.e(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("User(id=", this.a, ", hasCreatedLists=", ", suggestedListNames=", this.b);
        o.append(this.c);
        o.append(", lists=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
