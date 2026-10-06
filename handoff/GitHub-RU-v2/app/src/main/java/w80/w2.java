package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w2 {
    public String a;
    public String b;
    public e30.c c;

    public w2(String str, String str2, e30.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return k71.k.b(this.a, w2Var.a) && k71.k.b(this.b, w2Var.b) && k71.k.b(this.c, w2Var.c);
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
