package iy0;

import wx0.j4;
import wx0.r4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 {
    public String a;
    public wx0.o b;
    public r4 c;
    public j4 d;

    public o0(String str, wx0.o oVar, r4 r4Var, j4 j4Var) {
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
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b) && k71.k.b(this.c, o0Var.c) && k71.k.b(this.d, o0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wx0.o oVar = this.b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        r4 r4Var = this.c;
        int hashCode3 = (hashCode2 + (r4Var == null ? 0 : r4Var.hashCode())) * 31;
        j4 j4Var = this.d;
        return hashCode3 + (j4Var != null ? j4Var.hashCode() : 0);
    }

    public final String toString() {
        return "Field(__typename=" + this.a + ", projectV2FieldFragment=" + this.b + ", projectV2SingleSelectFieldFragment=" + this.c + ", projectV2IterationFieldFragment=" + this.d + ")";
    }
}
