package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eh {
    public final String a;
    public final gn0.xd b;
    public final ah0.e c;

    public eh(String str, gn0.xd xdVar, ah0.e eVar) {
        this.a = str;
        this.b = xdVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        return k71.k.b(this.a, ehVar.a) && this.b == ehVar.b && k71.k.b(this.c, ehVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gn0.xd xdVar = this.b;
        return this.c.hashCode() + ((hashCode + (xdVar == null ? 0 : xdVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LockedRecord(__typename=" + this.a + ", activeLockReason=" + this.b + ", lockableFragment=" + this.c + ")";
    }
}
