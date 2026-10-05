package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wh0 {
    public final String a;
    public final boolean b;
    public final List c;
    public final th0 d;
    public final String e;

    public wh0(String str, boolean z, List list, th0 th0Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = th0Var;
        this.e = str2;
    }

    public static wh0 a(wh0 wh0Var, th0 th0Var) {
        String str = wh0Var.a;
        boolean z = wh0Var.b;
        List list = wh0Var.c;
        String str2 = wh0Var.e;
        wh0Var.getClass();
        return new wh0(str, z, list, th0Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        return k71.k.b(this.a, wh0Var.a) && this.b == wh0Var.b && k71.k.b(this.c, wh0Var.c) && k71.k.b(this.d, wh0Var.d) && k71.k.b(this.e, wh0Var.e);
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
