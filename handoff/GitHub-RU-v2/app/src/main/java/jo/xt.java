package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xt {
    public String a;
    public String b;
    public eq.c c;

    public xt(String str, String str2, eq.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt)) {
            return false;
        }
        xt xtVar = (xt) obj;
        return k71.k.b(this.a, xtVar.a) && k71.k.b(this.b, xtVar.b) && k71.k.b(this.c, xtVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
