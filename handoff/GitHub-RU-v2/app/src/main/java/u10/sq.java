package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sq {
    public final tq a;

    public sq(tq tqVar) {
        this.a = tqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq) && k71.k.b(this.a, ((sq) obj).a);
    }

    public final int hashCode() {
        tq tqVar = this.a;
        if (tqVar == null) {
            return 0;
        }
        return tqVar.hashCode();
    }

    public final String toString() {
        return "RemoveStar(starrable=" + this.a + ")";
    }
}
