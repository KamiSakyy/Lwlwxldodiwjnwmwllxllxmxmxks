package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rf implements aa.v0 {
    public final sf a;

    public rf(sf sfVar) {
        this.a = sfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf) && k71.k.b(this.a, ((rf) obj).a);
    }

    public final int hashCode() {
        sf sfVar = this.a;
        if (sfVar == null) {
            return 0;
        }
        return sfVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
