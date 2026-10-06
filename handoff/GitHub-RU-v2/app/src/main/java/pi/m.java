package pi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public q71.g a;
    public p b;

    public m(q71.g gVar, p pVar) {
        k71.k.g(gVar, "range");
        this.a = gVar;
        this.b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RangedToken(range=" + this.a + ", token=" + this.b + ")";
    }
}
