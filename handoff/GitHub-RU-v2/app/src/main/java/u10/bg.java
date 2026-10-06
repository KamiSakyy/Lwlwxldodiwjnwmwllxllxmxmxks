package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bg {
    public yf a;
    public cg b;

    public bg(yf yfVar, cg cgVar) {
        this.a = yfVar;
        this.b = cgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return k71.k.b(this.a, bgVar.a) && k71.k.b(this.b, bgVar.b);
    }

    public final int hashCode() {
        yf yfVar = this.a;
        int hashCode = (yfVar == null ? 0 : yfVar.hashCode()) * 31;
        cg cgVar = this.b;
        return hashCode + (cgVar != null ? cgVar.hashCode() : 0);
    }

    public final String toString() {
        return "LockLockable(actor=" + this.a + ", lockedRecord=" + this.b + ")";
    }
}
