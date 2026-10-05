package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ej implements aa.v0 {
    public final hj a;

    public ej(hj hjVar) {
        this.a = hjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej) && k71.k.b(this.a, ((ej) obj).a);
    }

    public final int hashCode() {
        hj hjVar = this.a;
        if (hjVar == null) {
            return 0;
        }
        return hjVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
