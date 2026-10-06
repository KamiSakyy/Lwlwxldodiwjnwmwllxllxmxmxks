package qx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public final String a;
    public final boolean b;
    public final c1 c;

    public s0(String str, boolean z, c1 c1Var) {
        this.a = str;
        this.b = z;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && this.b == s0Var.b && k71.k.b(this.c, s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("OnUser(__typename=", this.a, ", viewerCanUnblock=", ", userListItemFragment=", this.b);
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
