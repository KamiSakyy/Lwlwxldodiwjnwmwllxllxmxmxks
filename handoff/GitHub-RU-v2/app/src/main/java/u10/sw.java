package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sw implements aa.m0 {
    public final tw a;

    public sw(tw twVar) {
        this.a = twVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw) && k71.k.b(this.a, ((sw) obj).a);
    }

    public final int hashCode() {
        tw twVar = this.a;
        if (twVar == null) {
            return 0;
        }
        return twVar.hashCode();
    }

    public final String toString() {
        return "Data(resolveReviewThread=" + this.a + ")";
    }
}
