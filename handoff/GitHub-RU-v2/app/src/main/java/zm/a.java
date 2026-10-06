package zm;

import java.util.List;
import k71.k;
import yz0.f8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public List a;
    public f8 b;

    public a(List list, f8 f8Var) {
        k.g(list, "selectedUserLists");
        k.g(f8Var, "userListPayload");
        this.a = list;
        this.b = f8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListSelectionBottomSheetLoad(selectedUserLists=" + this.a + ", userListPayload=" + this.b + ")";
    }
}
