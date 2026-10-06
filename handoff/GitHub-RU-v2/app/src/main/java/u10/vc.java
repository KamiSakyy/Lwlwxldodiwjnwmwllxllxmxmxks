package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vc implements aaShadow.v0 {
    public wc a;

    public vc(wc wcVar) {
        this.a = wcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc) && k71.k.b(this.a, ((vc) obj).a);
    }

    public final int hashCode() {
        wc wcVar = this.a;
        if (wcVar == null) {
            return 0;
        }
        return wcVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
