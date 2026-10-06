package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ag implements aaShadow.m0 {
    public final bg a;

    public ag(bg bgVar) {
        this.a = bgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && k71.k.b(this.a, ((ag) obj).a);
    }

    public final int hashCode() {
        bg bgVar = this.a;
        if (bgVar == null) {
            return 0;
        }
        return bgVar.hashCode();
    }

    public final String toString() {
        return "Data(lockLockable=" + this.a + ")";
    }
}
