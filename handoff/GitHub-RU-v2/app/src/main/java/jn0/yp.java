package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yp {
    public String a;
    public dq b;
    public cq c;

    public yp(String str, dq dqVar, cq cqVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dqVar;
        this.c = cqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp)) {
            return false;
        }
        yp ypVar = (yp) obj;
        return k71.k.b(this.a, ypVar.a) && k71.k.b(this.b, ypVar.b) && k71.k.b(this.c, ypVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dq dqVar = this.b;
        int hashCode2 = (hashCode + (dqVar == null ? 0 : dqVar.hashCode())) * 31;
        cq cqVar = this.c;
        return hashCode2 + (cqVar != null ? cqVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onPullRequestReviewThread=" + this.b + ", onPullRequestReviewComment=" + this.c + ")";
    }
}
