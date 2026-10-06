package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fz {
    public dz a;
    public List b;

    public fz(dz dzVar, List list) {
        this.a = dzVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        return k71.k.b(this.a, fzVar.a) && k71.k.b(this.b, fzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories1(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
