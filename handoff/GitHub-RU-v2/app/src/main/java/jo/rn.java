package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rn {
    public nnShadow a;
    public tn b;

    public rn(nnShadow nnVar, tn tnVar) {
        this.a = nnVar;
        this.b = tnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn)) {
            return false;
        }
        rn rnVar = (rn) obj;
        return k71.k.b(this.a, rnVar.a) && k71.k.b(this.b, rnVar.b);
    }

    public final int hashCode() {
        nnShadow nnVar = this.a;
        int hashCode = (nnVar == null ? 0 : nnVar.hashCode()) * 31;
        tn tnVar = this.b;
        return hashCode + (tnVar != null ? tnVar.hashCode() : 0);
    }

    public final String toString() {
        return "MergePullRequest(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
    public Object b = null;
}
