package sg;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public final d2.e0 a;
    public final long b;
    public final f1.o0 c;

    public z(d2.e0 e0Var, long j, f1.o0 o0Var) {
        this.a = e0Var;
        this.b = j;
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a.equals(zVar.a) && d2.t.c(this.b, zVar.b) && this.c.equals(zVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = d2.t.l;
        return this.c.hashCode() + x.i.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return "PrimaryGradientButtonColors(gradient=" + this.a + ", borderColor=" + d2.t.i(this.b) + ", buttonColors=" + this.c + ")";
    }
}
