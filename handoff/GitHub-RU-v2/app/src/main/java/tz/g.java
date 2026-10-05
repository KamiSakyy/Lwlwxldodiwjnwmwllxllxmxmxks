package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final o b;
    public final r4 c;
    public final j4 d;

    public g(String str, o oVar, r4 r4Var, j4 j4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = oVar;
        this.c = r4Var;
        this.d = j4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o oVar = this.b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        r4 r4Var = this.c;
        int hashCode3 = (hashCode2 + (r4Var == null ? 0 : r4Var.hashCode())) * 31;
        j4 j4Var = this.d;
        return hashCode3 + (j4Var != null ? j4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", projectV2FieldFragment=" + this.b + ", projectV2SingleSelectFieldFragment=" + this.c + ", projectV2IterationFieldFragment=" + this.d + ")";
    }
}
