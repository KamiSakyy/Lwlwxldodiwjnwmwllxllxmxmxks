package fw0;

import uu0.z4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public i b;
    public z4 c;

    public h(String str, i iVar, z4 z4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = z4Var;
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
        z4 z4Var = this.c;
        return hashCode2 + (z4Var != null ? z4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", onNode=" + this.b + ", simpleRepositoryFragment=" + this.c + ")";
    }
}
