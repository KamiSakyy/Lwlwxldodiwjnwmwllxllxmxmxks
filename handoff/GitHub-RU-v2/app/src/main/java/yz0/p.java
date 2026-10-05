package yz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final double a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;

    public p(double d, int i, int i2, int i3, ArrayList arrayList) {
        this.a = d;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Double.compare(this.a, pVar.a) == 0 && this.b.equals(pVar.b) && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + a0.s0.b(this.d, a0.s0.b(this.c, no.a.b(this.b, Double.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CodeSearchSnippet(score=" + this.a + ", lines=" + this.b + ", startingLineNumber=" + this.c + ", endingLineNumber=" + this.d + ", jumpToLineNumber=" + this.e + ")";
    }
}
