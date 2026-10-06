package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p60 {
    public final k60 a;
    public final q60 b;
    public final String c;
    public final String d;

    public p60(k60 k60Var, q60 q60Var, String str, String str2) {
        this.a = k60Var;
        this.b = q60Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p60)) {
            return false;
        }
        p60 p60Var = (p60) obj;
        return k71.k.b(this.a, p60Var.a) && k71.k.b(this.b, p60Var.b) && k71.k.b(this.c, p60Var.c) && k71.k.b(this.d, p60Var.d);
    }

    public final int hashCode() {
        k60 k60Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((k60Var == null ? 0 : k60Var.hashCode()) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(column=");
        sb.append(this.a);
        sb.append(", project=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
