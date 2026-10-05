package ra0;

import w80.a2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public final String a;
    public final a2 b;
    public final w80.h c;

    public r(String str, a2 a2Var, w80.h hVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = a2Var;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a2 a2Var = this.b;
        int hashCode2 = (hashCode + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        w80.h hVar = this.c;
        return hashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", repositoryListItemFragment=" + this.b + ", issueTemplateFragment=" + this.c + ")";
    }
}
