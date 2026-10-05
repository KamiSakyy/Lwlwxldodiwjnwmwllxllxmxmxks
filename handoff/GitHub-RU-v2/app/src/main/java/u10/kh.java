package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kh implements aa.m0 {
    public final lh a;

    public kh(lh lhVar) {
        this.a = lhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh) && k71.k.b(this.a, ((kh) obj).a);
    }

    public final int hashCode() {
        lh lhVar = this.a;
        if (lhVar == null) {
            return 0;
        }
        return lhVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsUnread=" + this.a + ")";
    }
}
