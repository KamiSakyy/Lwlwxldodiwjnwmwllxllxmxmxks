package b01;

import java.util.ArrayList;
import yz0.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public ArrayList a;
    public f4 b;

    public i(ArrayList arrayList, f4 f4Var) {
        this.a = arrayList;
        this.b = f4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiscussionCommentsPage(comments=" + this.a + ", page=" + this.b + ")";
    }
}
