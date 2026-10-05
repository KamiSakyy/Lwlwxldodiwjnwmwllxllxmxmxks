package y40;

import aa.h0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements h0 {
    public final boolean a;
    public final a b;
    public final e c;

    public f(boolean z, a aVar, e eVar) {
        this.a = z;
        this.b = aVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DeploymentReviewApprovalRequest(currentUserCanApprove=" + this.a + ", environment=" + this.b + ", reviewers=" + this.c + ")";
    }
}
