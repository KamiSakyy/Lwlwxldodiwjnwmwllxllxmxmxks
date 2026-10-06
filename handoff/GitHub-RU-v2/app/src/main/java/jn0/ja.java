package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ja {
    public final fa a;
    public final ka b;

    public ja(fa faVar, ka kaVar) {
        this.a = faVar;
        this.b = kaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return k71.k.b(this.a, jaVar.a) && k71.k.b(this.b, jaVar.b);
    }

    public final int hashCode() {
        fa faVar = this.a;
        int hashCode = (faVar == null ? 0 : faVar.hashCode()) * 31;
        ka kaVar = this.b;
        return hashCode + (kaVar != null ? kaVar.hashCode() : 0);
    }

    public final String toString() {
        return "DisablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
