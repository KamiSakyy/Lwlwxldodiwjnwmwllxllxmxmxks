package xn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 extends sy.r {
    public ArrayList a;
    public String b;

    public o1(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.a.equals(o1Var.a) && k71.k.b(this.b, o1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StringOneOf(options=" + this.a + ", default=" + this.b + ")";
    }
}
