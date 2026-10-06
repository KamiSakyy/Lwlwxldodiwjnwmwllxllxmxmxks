package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n4 {
    public final String a;
    public final String b;
    public final ct.c c;

    public n4(String str, String str2, ct.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return k71.k.b(this.a, n4Var.a) && k71.k.b(this.b, n4Var.b) && k71.k.b(this.c, n4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DuplicateOf(__typename=", this.a, ", id=", this.b, ", duplicateOfFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object i = null;
}
