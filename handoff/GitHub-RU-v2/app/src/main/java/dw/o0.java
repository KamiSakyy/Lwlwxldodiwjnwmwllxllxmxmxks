package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public String a;
    public String b;
    public ct.c c;

    public o0(String str, String str2, ct.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b) && k71.k.b(this.c, o0Var.c);
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
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
