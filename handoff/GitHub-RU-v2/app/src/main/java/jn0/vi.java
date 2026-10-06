package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vi {
    public final String a;
    public final pz0.ig b;
    public final ks0.e c;

    public vi(String str, pz0.ig igVar, ks0.e eVar) {
        this.a = str;
        this.b = igVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi)) {
            return false;
        }
        vi viVar = (vi) obj;
        return k71.k.b(this.a, viVar.a) && this.b == viVar.b && k71.k.b(this.c, viVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pz0.ig igVar = this.b;
        return this.c.hashCode() + ((hashCode + (igVar == null ? 0 : igVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LockedRecord(__typename=" + this.a + ", activeLockReason=" + this.b + ", lockableFragment=" + this.c + ")";
    }
}
