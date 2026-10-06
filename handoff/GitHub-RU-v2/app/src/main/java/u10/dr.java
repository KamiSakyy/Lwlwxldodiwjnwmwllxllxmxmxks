package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dr {
    public cr a;

    public dr(cr crVar) {
        this.a = crVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr) && k71.k.b(this.a, ((dr) obj).a);
    }

    public final int hashCode() {
        cr crVar = this.a;
        if (crVar == null) {
            return 0;
        }
        return crVar.hashCode();
    }

    public final String toString() {
        return "ReopenIssue(issue=" + this.a + ")";
    }
}
