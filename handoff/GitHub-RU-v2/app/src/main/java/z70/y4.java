package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y4 {
    public final String a;
    public final String b;
    public final String c;
    public final e30.c d;

    public y4(String str, String str2, String str3, e30.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return k71.k.b(this.a, y4Var.a) && k71.k.b(this.b, y4Var.b) && k71.k.b(this.c, y4Var.c) && k71.k.b(this.d, y4Var.d);
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
