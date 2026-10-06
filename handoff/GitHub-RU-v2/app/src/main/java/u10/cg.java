package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cg {
    public final String a;
    public final hc0.jd b;
    public final k60.e c;

    public cg(String str, hc0.jd jdVar, k60.e eVar) {
        this.a = str;
        this.b = jdVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return k71.k.b(this.a, cgVar.a) && this.b == cgVar.b && k71.k.b(this.c, cgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hc0.jd jdVar = this.b;
        return this.c.hashCode() + ((hashCode + (jdVar == null ? 0 : jdVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LockedRecord(__typename=" + this.a + ", activeLockReason=" + this.b + ", lockableFragment=" + this.c + ")";
    }
}
