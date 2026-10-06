package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o30 {
    public String a;
    public String b;
    public e50.x c;

    public o30(String str, String str2, e50.x xVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o30)) {
            return false;
        }
        o30 o30Var = (o30) obj;
        return k71.k.b(this.a, o30Var.a) && k71.k.b(this.b, o30Var.b) && k71.k.b(this.c, o30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
