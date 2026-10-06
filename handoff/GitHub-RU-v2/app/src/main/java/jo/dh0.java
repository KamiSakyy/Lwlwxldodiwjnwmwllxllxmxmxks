package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dh0 {
    public String a;
    public String b;
    public String c;
    public eq.c d;

    public dh0(String str, String str2, String str3, eq.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh0)) {
            return false;
        }
        dh0 dh0Var = (dh0) obj;
        return k71.k.b(this.a, dh0Var.a) && k71.k.b(this.b, dh0Var.b) && k71.k.b(this.c, dh0Var.c) && k71.k.b(this.d, dh0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", name=", this.b, ", id=");
        o.append(this.c);
        o.append(", actorFields=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
