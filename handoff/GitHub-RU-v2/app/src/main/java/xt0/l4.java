package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l4 {
    public final String a;
    public final String b;
    public final cp0.g c;

    public l4(String str, String str2, cp0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return k71.k.b(this.a, l4Var.a) && k71.k.b(this.b, l4Var.b) && k71.k.b(this.c, l4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", login=", this.b, ", avatarFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
