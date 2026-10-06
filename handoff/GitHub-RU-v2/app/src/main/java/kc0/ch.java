package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ch implements aaShadow.m0 {
    public dh a;

    public ch(dh dhVar) {
        this.a = dhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch) && k71.k.b(this.a, ((ch) obj).a);
    }

    public final int hashCode() {
        dh dhVar = this.a;
        if (dhVar == null) {
            return 0;
        }
        return dhVar.hashCode();
    }

    public final String toString() {
        return "Data(lockLockable=" + this.a + ")";
    }
}
