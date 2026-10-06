package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yo implements aaShadow.m0 {
    public final zo a;

    public yo(zo zoVar) {
        this.a = zoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo) && k71.k.b(this.a, ((yo) obj).a);
    }

    public final int hashCode() {
        zo zoVar = this.a;
        if (zoVar == null) {
            return 0;
        }
        return zoVar.hashCode();
    }

    public final String toString() {
        return "Data(mobileEventsUpdate=" + this.a + ")";
    }
}
