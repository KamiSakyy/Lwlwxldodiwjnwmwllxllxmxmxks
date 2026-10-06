package hz0;

import a0.s0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public double e;

    public d(double d, int i, int i2, int i3, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && Double.compare(this.e, dVar.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + s0.b(this.d, s0.b(this.c, s0.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Snippet(lines=");
        sb.append(this.a);
        sb.append(", startingLineNumber=");
        sb.append(this.b);
        sb.append(", endingLineNumber=");
        s0.z(sb, this.c, ", jumpToLineNumber=", this.d, ", score=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
