package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xj implements aaShadow.m0 {
    public yj a;

    public xj(yj yjVar) {
        this.a = yjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xj) && k71.k.b(this.a, ((xj) obj).a);
    }

    public final int hashCode() {
        yj yjVar = this.a;
        if (yjVar == null) {
            return 0;
        }
        return yjVar.hashCode();
    }

    public final String toString() {
        return "Data(lockLockable=" + this.a + ")";
    }
}
