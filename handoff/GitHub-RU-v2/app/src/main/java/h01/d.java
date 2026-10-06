package h01;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public ArrayList a;
    public x01.i b;

    public d(ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChecksPaged(checks=" + this.a + ", page=" + this.b + ")";
    }
}
