package o01;

import a0.s0;
import java.util.ArrayList;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public int b;
    public ArrayList c;
    public int d;

    public d(int i, int i2, String str, ArrayList arrayList) {
        k.g(str, "id");
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && this.b == dVar.b && this.c.equals(dVar.c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + no.a.b(this.c, s0.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "ReleaseDiscussion(id=", this.a, ", number=", ", comments=");
        n.append(this.c);
        n.append(", commentCount=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
