package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dh {
    public ah a;
    public eh b;

    public dh(ah ahVar, eh ehVar) {
        this.a = ahVar;
        this.b = ehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        return k71.k.b(this.a, dhVar.a) && k71.k.b(this.b, dhVar.b);
    }

    public final int hashCode() {
        ah ahVar = this.a;
        int hashCode = (ahVar == null ? 0 : ahVar.hashCode()) * 31;
        eh ehVar = this.b;
        return hashCode + (ehVar != null ? ehVar.hashCode() : 0);
    }

    public final String toString() {
        return "LockLockable(actor=" + this.a + ", lockedRecord=" + this.b + ")";
    }
}
