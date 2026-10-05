package mi;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final int a;
    public final ArrayList b;

    public g(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TokenizedLine(lineNumber=" + this.a + ", tokens=" + this.b + ")";
    }
}
