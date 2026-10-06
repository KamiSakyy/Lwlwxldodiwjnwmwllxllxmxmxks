package xn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 extends sy.rShadow {
    public ArrayList a;
    public Integer b;
    public Integer c;
    public Object d;

    public j1(ArrayList arrayList, Integer num, Integer num2, List list) {
        this.a = arrayList;
        this.b = num;
        this.c = num2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a.equals(j1Var.a) && k71.k.b(this.b, j1Var.b) && k71.k.b(this.c, j1Var.c) && this.d.equals(j1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ArrayEnum(options=" + this.a + ", minItems=" + this.b + ", maxItems=" + this.c + ", default=" + this.d + ")";
    }
}
