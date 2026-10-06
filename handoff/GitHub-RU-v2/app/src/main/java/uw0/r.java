package uw0;

import uu0.k3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public String a;
    public k3 b;
    public uu0.o c;

    public r(String str, k3 k3Var, uu0.o oVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = k3Var;
        this.c = oVar;
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
        k3 k3Var = this.b;
        int hashCode2 = (hashCode + (k3Var == null ? 0 : k3Var.hashCode())) * 31;
        uu0.o oVar = this.c;
        return hashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", repositoryListItemFragment=" + this.b + ", issueTemplateFragment=" + this.c + ")";
    }
}
