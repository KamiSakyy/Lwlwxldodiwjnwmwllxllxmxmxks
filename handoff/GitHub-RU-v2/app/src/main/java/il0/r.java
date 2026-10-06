package il0;

import oj0.e2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public String a;
    public e2 b;
    public oj0.h c;

    public r(String str, e2 e2Var, oj0.h hVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = e2Var;
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
        e2 e2Var = this.b;
        int hashCode2 = (hashCode + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        oj0.h hVar = this.c;
        return hashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", repositoryListItemFragment=" + this.b + ", issueTemplateFragment=" + this.c + ")";
    }
}
