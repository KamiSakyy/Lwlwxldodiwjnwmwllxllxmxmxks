package f00;

import m10.pt;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.h0 {
    public final pt a;
    public final String b;

    public y(pt ptVar, String str) {
        this.a = ptVar;
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectV2FieldCommonFragment(dataType=" + this.a + ", id=" + this.b + ")";
    }
}
