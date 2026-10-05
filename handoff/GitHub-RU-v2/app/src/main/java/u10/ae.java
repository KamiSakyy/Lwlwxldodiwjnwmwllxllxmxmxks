package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ae implements aa.v0 {
    public final fe a;

    public ae(fe feVar) {
        this.a = feVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && k71.k.b(this.a, ((ae) obj).a);
    }

    public final int hashCode() {
        fe feVar = this.a;
        if (feVar == null) {
            return 0;
        }
        return feVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
