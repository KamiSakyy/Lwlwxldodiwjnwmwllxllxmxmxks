package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zj {
    public String a;
    public m10.kk b;
    public tt.e c;

    public zj(String str, m10.kk kkVar, tt.e eVar) {
        this.a = str;
        this.b = kkVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj)) {
            return false;
        }
        zj zjVar = (zj) obj;
        return k71.k.b(this.a, zjVar.a) && this.b == zjVar.b && k71.k.b(this.c, zjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10.kk kkVar = this.b;
        return this.c.hashCode() + ((hashCode + (kkVar == null ? 0 : kkVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LockedRecord(__typename=" + this.a + ", activeLockReason=" + this.b + ", lockableFragment=" + this.c + ")";
    }
}
