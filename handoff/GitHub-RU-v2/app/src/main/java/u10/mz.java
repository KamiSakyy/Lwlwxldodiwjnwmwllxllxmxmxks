package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mz {
    public lz a;
    public List b;

    public mz(lz lzVar, List list) {
        this.a = lzVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz)) {
            return false;
        }
        mz mzVar = (mz) obj;
        return k71.k.b(this.a, mzVar.a) && k71.k.b(this.b, mzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "TopRepositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
