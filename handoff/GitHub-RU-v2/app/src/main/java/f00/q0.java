package f00;

import tz.j4;
import tz.r4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public String a;
    public tz.o b;
    public r4 c;
    public j4 d;

    public q0(String str, tz.o oVar, r4 r4Var, j4 j4Var) {
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
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && k71.k.b(this.c, q0Var.c) && k71.k.b(this.d, q0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tz.o oVar = this.b;
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
