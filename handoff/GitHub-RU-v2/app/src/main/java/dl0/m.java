package dl0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements aa.m0 {
    public n a;

    public m(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && k71.k.b(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        n nVar = this.a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        return "Data(linkIssueOrPullRequest=" + this.a + ")";
    }
}
