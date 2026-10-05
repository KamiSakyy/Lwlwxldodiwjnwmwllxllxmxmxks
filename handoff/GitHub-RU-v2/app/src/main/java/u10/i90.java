package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i90 {
    public final String a;
    public final boolean b;
    public final List c;
    public final f90 d;
    public final String e;

    public i90(String str, boolean z, List list, f90 f90Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = f90Var;
        this.e = str2;
    }

    public static i90 a(i90 i90Var, f90 f90Var) {
        String str = i90Var.a;
        boolean z = i90Var.b;
        List list = i90Var.c;
        String str2 = i90Var.e;
        i90Var.getClass();
        return new i90(str, z, list, f90Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90Var = (i90) obj;
        return k71.k.b(this.a, i90Var.a) && this.b == i90Var.b && k71.k.b(this.c, i90Var.c) && k71.k.b(this.d, i90Var.d) && k71.k.b(this.e, i90Var.e);
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
