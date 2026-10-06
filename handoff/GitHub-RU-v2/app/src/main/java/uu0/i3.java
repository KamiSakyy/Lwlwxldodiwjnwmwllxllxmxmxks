package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i3 {
    public final String a;
    public final g3 b;
    public final String c;
    public final String d;

    public i3(String str, g3 g3Var, String str2, String str3) {
        this.a = str;
        this.b = g3Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return k71.k.b(this.a, i3Var.a) && k71.k.b(this.b, i3Var.b) && k71.k.b(this.c, i3Var.c) && k71.k.b(this.d, i3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parent(name=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
