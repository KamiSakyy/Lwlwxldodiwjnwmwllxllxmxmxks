package ey;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public s a;
    public r b;

    public q(s sVar, r rVar) {
        this.a = sVar;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        r rVar = this.b;
        return hashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    public final String toString() {
        return "PullRequestStatus(statusRollup=" + this.a + ", statusChecks=" + this.b + ")";
    }
}
