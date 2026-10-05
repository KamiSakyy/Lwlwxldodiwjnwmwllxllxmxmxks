package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.h0 {
    public final String a;
    public final i b;
    public final j c;

    public k(String str, i iVar, j jVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = jVar;
    }

    public static k a(k kVar, i iVar, j jVar) {
        String str = kVar.a;
        kVar.getClass();
        k71.k.g(str, "__typename");
        return new k(str, iVar, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.c;
        return hashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "DiscussionVotableFragment(__typename=" + this.a + ", onDiscussion=" + this.b + ", onDiscussionComment=" + this.c + ")";
    }
}
