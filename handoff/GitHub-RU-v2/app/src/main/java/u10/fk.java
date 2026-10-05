package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fk {
    public final gk a;

    public fk(gk gkVar) {
        this.a = gkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk) && k71.k.b(this.a, ((fk) obj).a);
    }

    public final int hashCode() {
        gk gkVar = this.a;
        if (gkVar == null) {
            return 0;
        }
        return gkVar.hashCode();
    }

    public final String toString() {
        return "MinimizeComment(minimizedComment=" + this.a + ")";
    }
}
