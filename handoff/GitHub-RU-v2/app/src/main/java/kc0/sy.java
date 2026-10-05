package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sy {
    public final ty a;

    public sy(ty tyVar) {
        this.a = tyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy) && k71.k.b(this.a, ((sy) obj).a);
    }

    public final int hashCode() {
        ty tyVar = this.a;
        if (tyVar == null) {
            return 0;
        }
        return tyVar.hashCode();
    }

    public final String toString() {
        return "ResolveReviewThread(thread=" + this.a + ")";
    }
}
