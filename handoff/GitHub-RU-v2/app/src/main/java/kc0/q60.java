package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q60 {
    public final String a;
    public final String b;
    public final gn0.dl c;
    public final String d;

    public q60(String str, String str2, gn0.dl dlVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dlVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q60)) {
            return false;
        }
        q60 q60Var = (q60) obj;
        return k71.k.b(this.a, q60Var.a) && k71.k.b(this.b, q60Var.b) && this.c == q60Var.c && k71.k.b(this.d, q60Var.d);
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
