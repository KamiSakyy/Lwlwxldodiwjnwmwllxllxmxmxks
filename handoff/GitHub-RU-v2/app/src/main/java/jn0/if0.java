package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class if0 {
    public final String a;
    public final boolean b;
    public final List c;
    public final ff0 d;
    public final String e;

    public if0(String str, boolean z, List list, ff0 ff0Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = ff0Var;
        this.e = str2;
    }

    public static if0 a(if0 if0Var, ff0 ff0Var) {
        String str = if0Var.a;
        boolean z = if0Var.b;
        List list = if0Var.c;
        String str2 = if0Var.e;
        if0Var.getClass();
        return new if0(str, z, list, ff0Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0)) {
            return false;
        }
        if0 if0Var = (if0) obj;
        return k71.k.b(this.a, if0Var.a) && this.b == if0Var.b && k71.k.b(this.c, if0Var.c) && k71.k.b(this.d, if0Var.d) && k71.k.b(this.e, if0Var.e);
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
