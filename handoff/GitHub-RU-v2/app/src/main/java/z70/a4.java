package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a4 {
    public String a;
    public String b;
    public e30.c c;

    public a4(String str, String str2, e30.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return k71.k.b(this.a, a4Var.a) && k71.k.b(this.b, a4Var.b) && k71.k.b(this.c, a4Var.c);
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
