package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c2 {
    public String a;
    public a2 b;
    public String c;
    public String d;

    public c2(String str, a2 a2Var, String str2, String str3) {
        this.a = str;
        this.b = a2Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return k71.k.b(this.a, c2Var.a) && k71.k.b(this.b, c2Var.b) && k71.k.b(this.c, c2Var.c) && k71.k.b(this.d, c2Var.d);
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
