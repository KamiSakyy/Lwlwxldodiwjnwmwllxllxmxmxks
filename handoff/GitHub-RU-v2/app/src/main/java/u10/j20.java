package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j20 {
    public final String a;
    public final hc0.jd b;
    public final k60.e c;

    public j20(String str, hc0.jd jdVar, k60.e eVar) {
        this.a = str;
        this.b = jdVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        return k71.k.b(this.a, j20Var.a) && this.b == j20Var.b && k71.k.b(this.c, j20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hc0.jd jdVar = this.b;
        return this.c.hashCode() + ((hashCode + (jdVar == null ? 0 : jdVar.hashCode())) * 31);
    }

    public final String toString() {
        return "UnlockedRecord(__typename=" + this.a + ", activeLockReason=" + this.b + ", lockableFragment=" + this.c + ")";
    }
}
