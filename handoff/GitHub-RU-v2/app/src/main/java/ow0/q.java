package ow0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.m0 {
    public r a;

    public q(r rVar) {
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && k71.k.b(this.a, ((q) obj).a);
    }

    public final int hashCode() {
        r rVar = this.a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "Data(linkIssueOrPullRequest=" + this.a + ")";
    }
}
