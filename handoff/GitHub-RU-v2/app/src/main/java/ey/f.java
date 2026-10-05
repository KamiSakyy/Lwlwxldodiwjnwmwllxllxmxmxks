package ey;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final g a;
    public final h b;

    public f(g gVar, h hVar) {
        this.a = gVar;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b);
    }

    public final int hashCode() {
        g gVar = this.a;
        return this.b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }

    public final String toString() {
        return "PullRequestStatus(statusChecks=" + this.a + ", statusRollup=" + this.b + ")";
    }
}
