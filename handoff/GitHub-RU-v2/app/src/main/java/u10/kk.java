package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kk implements aaShadow.m0 {
    public lk a;

    public kk(lk lkVar) {
        this.a = lkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kk) && k71.k.b(this.a, ((kk) obj).a);
    }

    public final int hashCode() {
        lk lkVar = this.a;
        if (lkVar == null) {
            return 0;
        }
        return lkVar.hashCode();
    }

    public final String toString() {
        return "Data(mobileEventsUpdate=" + this.a + ")";
    }
}
