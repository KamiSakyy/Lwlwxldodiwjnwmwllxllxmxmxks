package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yj {
    public vj a;
    public zj b;

    public yj(vj vjVar, zj zjVar) {
        this.a = vjVar;
        this.b = zjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj)) {
            return false;
        }
        yj yjVar = (yj) obj;
        return k71.k.b(this.a, yjVar.a) && k71.k.b(this.b, yjVar.b);
    }

    public final int hashCode() {
        vj vjVar = this.a;
        int hashCode = (vjVar == null ? 0 : vjVar.hashCode()) * 31;
        zj zjVar = this.b;
        return hashCode + (zjVar != null ? zjVar.hashCode() : 0);
    }

    public final String toString() {
        return "LockLockable(actor=" + this.a + ", lockedRecord=" + this.b + ")";
    }
}
