package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k3 {
    public String a;
    public i3 b;
    public String c;
    public String d;

    public k3(String str, i3 i3Var, String str2, String str3) {
        this.a = str;
        this.b = i3Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return k71.k.b(this.a, k3Var.a) && k71.k.b(this.b, k3Var.b) && k71.k.b(this.c, k3Var.c) && k71.k.b(this.d, k3Var.d);
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
