package xn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 extends sy.r {
    public ArrayList a;
    public String b;

    public n1(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.a.equals(n1Var.a) && k71.k.b(this.b, n1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StringEnum(options=" + this.a + ", default=" + this.b + ")";
    }
}
