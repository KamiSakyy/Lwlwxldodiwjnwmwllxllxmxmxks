package xn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 extends sy.r {
    public ArrayList a;
    public Integer b;
    public Integer c;
    public Object d;

    public i1(ArrayList arrayList, Integer num, Integer num2, List list) {
        this.a = arrayList;
        this.b = num;
        this.c = num2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.a.equals(i1Var.a) && k71.k.b(this.b, i1Var.b) && k71.k.b(this.c, i1Var.c) && this.d.equals(i1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ArrayAnyOf(options=" + this.a + ", minItems=" + this.b + ", maxItems=" + this.c + ", default=" + this.d + ")";
    }
}
