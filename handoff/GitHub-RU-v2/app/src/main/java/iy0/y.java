package iy0;

import pz0.bs;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y {
    public bs a;
    public String b;

    public y(bs bsVar, String str) {
        this.a = bsVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && k71.k.b(this.b, yVar.b);
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
