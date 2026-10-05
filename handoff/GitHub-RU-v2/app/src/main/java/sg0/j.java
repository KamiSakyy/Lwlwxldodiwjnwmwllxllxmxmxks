package sg0;

import aa.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements h0 {
    public final String a;
    public final h b;
    public final g c;
    public final i d;

    public j(String str, h hVar, g gVar, i iVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hVar;
        this.c = gVar;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h hVar = this.b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.d;
        return hashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "LabelsFragment(__typename=" + this.a + ", onIssue=" + this.b + ", onDiscussion=" + this.c + ", onPullRequest=" + this.d + ")";
    }
}
