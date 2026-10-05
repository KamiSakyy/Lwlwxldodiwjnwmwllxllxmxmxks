package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class od {
    public final String a;
    public final int b;
    public final String c;
    public final uu0.k3 d;

    public od(String str, int i, String str2, uu0.k3 k3Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = k3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return k71.k.b(this.a, odVar.a) && this.b == odVar.b && k71.k.b(this.c, odVar.c) && k71.k.b(this.d, odVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Node(__typename=", this.a, ", contributorsCount=", ", id=");
        n.append(this.c);
        n.append(", repositoryListItemFragment=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
