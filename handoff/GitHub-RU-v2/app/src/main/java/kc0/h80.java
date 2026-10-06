package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h80 {
    public final String a;
    public final String b;
    public final gn0.dl c;
    public final String d;

    public h80(String str, String str2, gn0.dl dlVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dlVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return k71.k.b(this.a, h80Var.a) && k71.k.b(this.b, h80Var.b) && this.c == h80Var.c && k71.k.b(this.d, h80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Project(id=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
