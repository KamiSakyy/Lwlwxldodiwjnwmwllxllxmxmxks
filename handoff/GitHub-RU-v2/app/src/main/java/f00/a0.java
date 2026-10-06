package f00;

import m10.mx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    public mx a;
    public String b;

    public a0(mx mxVar, String str) {
        this.a = mxVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && k71.k.b(this.b, a0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SortValue(type=" + this.a + ", value=" + this.b + ")";
    }
}
