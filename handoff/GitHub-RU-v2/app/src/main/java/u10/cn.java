package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cn {
    public final String a;
    public final hn b;
    public final gn c;

    public cn(String str, hn hnVar, gn gnVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hnVar;
        this.c = gnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return k71.k.b(this.a, cnVar.a) && k71.k.b(this.b, cnVar.b) && k71.k.b(this.c, cnVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hn hnVar = this.b;
        int hashCode2 = (hashCode + (hnVar == null ? 0 : hnVar.hashCode())) * 31;
        gn gnVar = this.c;
        return hashCode2 + (gnVar != null ? gnVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onPullRequestReviewThread=" + this.b + ", onPullRequestReviewComment=" + this.c + ")";
    }
}
