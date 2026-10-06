package qx;

import dw.t5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final i b;
    public final t5 c;

    public h(String str, i iVar, t5 t5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = t5Var;
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
        t5 t5Var = this.c;
        return hashCode2 + (t5Var != null ? t5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", onNode=" + this.b + ", simpleRepositoryFragment=" + this.c + ")";
    }
}
