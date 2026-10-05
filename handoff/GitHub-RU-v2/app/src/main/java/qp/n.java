package qp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public final String a;
    public final m b;

    public n(String str, m mVar) {
        this.a = str;
        this.b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        m mVar = this.b;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateProjectV2DraftIssue(clientMutationId=" + this.a + ", draftIssue=" + this.b + ")";
    }
}
