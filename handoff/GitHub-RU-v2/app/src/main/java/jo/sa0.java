package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sa0 {
    public String a;
    public m10.kk b;
    public tt.e c;

    public sa0(String str, m10.kk kkVar, tt.e eVar) {
        this.a = str;
        this.b = kkVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa0)) {
            return false;
        }
        sa0 sa0Var = (sa0) obj;
        return k71.k.b(this.a, sa0Var.a) && this.b == sa0Var.b && k71.k.b(this.c, sa0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10.kk kkVar = this.b;
        return this.c.hashCode() + ((hashCode + (kkVar == null ? 0 : kkVar.hashCode())) * 31);
    }

    public final String toString() {
        return "UnlockedRecord(__typename=" + this.a + ", activeLockReason=" + this.b + ", lockableFragment=" + this.c + ")";
    }
    public sa0(String p1, Object p2, Object p3) {
    }
}
