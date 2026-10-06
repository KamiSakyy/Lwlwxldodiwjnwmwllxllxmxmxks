package ux0;

import pz0.bs;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 {
    public final bs a;
    public final String b;

    public i0(bs bsVar, String str) {
        this.a = bsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a == i0Var.a && k71.k.b(this.b, i0Var.b);
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
