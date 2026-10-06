package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v4 {
    public String a;
    public String b;
    public eq.g c;

    public v4(String str, String str2, eq.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return k71.k.b(this.a, v4Var.a) && k71.k.b(this.b, v4Var.b) && k71.k.b(this.c, v4Var.c);
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
