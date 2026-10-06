package k01;

import java.util.ArrayList;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public ArrayList a;
    public i b;

    public a(ArrayList arrayList, i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrganizationsPaged(organizations=" + this.a + ", page=" + this.b + ")";
    }
}
