package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vr {
    public String a;
    public as b;
    public zr c;

    public vr(String str, as asVar, zr zrVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = asVar;
        this.c = zrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr)) {
            return false;
        }
        vr vrVar = (vr) obj;
        return k71.k.b(this.a, vrVar.a) && k71.k.b(this.b, vrVar.b) && k71.k.b(this.c, vrVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        as asVar = this.b;
        int hashCode2 = (hashCode + (asVar == null ? 0 : asVar.hashCode())) * 31;
        zr zrVar = this.c;
        return hashCode2 + (zrVar != null ? zrVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onPullRequestReviewThread=" + this.b + ", onPullRequestReviewComment=" + this.c + ")";
    }
}
