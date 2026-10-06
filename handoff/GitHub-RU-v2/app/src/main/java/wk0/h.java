package wk0;

import oj0.v3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public i b;
    public v3 c;

    public h(String str, i iVar, v3 v3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.a.hashCode())) * 31;
        v3 v3Var = this.c;
        return hashCode2 + (v3Var != null ? v3Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", onNode=" + this.b + ", simpleRepositoryFragment=" + this.c + ")";
    }
}
