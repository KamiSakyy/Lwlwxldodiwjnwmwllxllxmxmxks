package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dc implements aa.v0 {
    public final ic a;

    public dc(ic icVar) {
        this.a = icVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc) && k71.k.b(this.a, ((dc) obj).a);
    }

    public final int hashCode() {
        ic icVar = this.a;
        if (icVar == null) {
            return 0;
        }
        return icVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
