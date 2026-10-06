package ly;

import dw.m3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public String a;
    public m3 b;
    public dw.o c;

    public r(String str, m3 m3Var, dw.o oVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = m3Var;
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
        m3 m3Var = this.b;
        int hashCode2 = (hashCode + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        dw.o oVar = this.c;
        return hashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", repositoryListItemFragment=" + this.b + ", issueTemplateFragment=" + this.c + ")";
    }
}
