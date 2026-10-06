package wx0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h4 {
    public int a;
    public ArrayList b;
    public ArrayList c;

    public h4(int i, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return this.a == h4Var.a && this.b.equals(h4Var.b) && this.c.equals(h4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(duration=");
        sb.append(this.a);
        sb.append(", completedIterations=");
        sb.append(this.b);
        sb.append(", iterations=");
        return com.github.rudroid.m0.j(")", sb, this.c);
    }
}
