package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ol implements aa.v0 {
    public final ql a;

    public ol(ql qlVar) {
        this.a = qlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol) && k71.k.b(this.a, ((ol) obj).a);
    }

    public final int hashCode() {
        ql qlVar = this.a;
        if (qlVar == null) {
            return 0;
        }
        return qlVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
