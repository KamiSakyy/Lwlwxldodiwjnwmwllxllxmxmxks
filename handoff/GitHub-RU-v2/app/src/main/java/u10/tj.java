package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tj {
    public final pj a;
    public final vj b;

    public tj(pj pjVar, vj vjVar) {
        this.a = pjVar;
        this.b = vjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return k71.k.b(this.a, tjVar.a) && k71.k.b(this.b, tjVar.b);
    }

    public final int hashCode() {
        pj pjVar = this.a;
        int hashCode = (pjVar == null ? 0 : pjVar.hashCode()) * 31;
        vj vjVar = this.b;
        return hashCode + (vjVar != null ? vjVar.hashCode() : 0);
    }

    public final String toString() {
        return "MergePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
    public Object b = null;
}
