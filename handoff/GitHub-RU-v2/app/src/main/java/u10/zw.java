package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zw {
    public final String a;
    public final bx b;
    public final cx c;
    public final ja0.a d;

    public zw(String str, bx bxVar, cx cxVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bxVar;
        this.c = cxVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw)) {
            return false;
        }
        zw zwVar = (zw) obj;
        return k71.k.b(this.a, zwVar.a) && k71.k.b(this.b, zwVar.b) && k71.k.b(this.c, zwVar.c) && k71.k.b(this.d, zwVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bx bxVar = this.b;
        int hashCode2 = (hashCode + (bxVar == null ? 0 : bxVar.hashCode())) * 31;
        cx cxVar = this.c;
        int hashCode3 = (hashCode2 + (cxVar == null ? 0 : cxVar.hashCode())) * 31;
        ja0.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
