package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 {
    public final String a;
    public final String b;
    public final String c;
    public final cp0.g d;

    public j5(String str, String str2, String str3, cp0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return k71.k.b(this.a, j5Var.a) && k71.k.b(this.b, j5Var.b) && k71.k.b(this.c, j5Var.c) && k71.k.b(this.d, j5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnUser(__typename=", this.a, ", id=", this.b, ", login=");
        o.append(this.c);
        o.append(", avatarFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
