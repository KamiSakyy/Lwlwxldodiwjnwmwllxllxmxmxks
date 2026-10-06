package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h40 {
    public String a;
    public gn0.xd b;
    public ah0.e c;

    public h40(String str, gn0.xd xdVar, ah0.e eVar) {
        this.a = str;
        this.b = xdVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return k71.k.b(this.a, h40Var.a) && this.b == h40Var.b && k71.k.b(this.c, h40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gn0.xd xdVar = this.b;
        return this.c.hashCode() + ((hashCode + (xdVar == null ? 0 : xdVar.hashCode())) * 31);
    }

    public final String toString() {
        return "UnlockedRecord(__typename=" + this.a + ", activeLockReason=" + this.b + ", lockableFragment=" + this.c + ")";
    }
}
