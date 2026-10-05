package fw0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final String a;
    public final s b;
    public final r c;

    public p(String str, s sVar, r rVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = sVar;
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s sVar = this.b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        r rVar = this.c;
        return hashCode2 + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "Interactable(__typename=" + this.a + ", onPullRequest=" + this.b + ", onIssue=" + this.c + ")";
    }
}
