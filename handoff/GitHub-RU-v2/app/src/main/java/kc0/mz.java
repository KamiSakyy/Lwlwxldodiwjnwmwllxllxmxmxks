package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mz {
    public final int a;
    public final lz b;
    public final List c;

    public mz(int i, lz lzVar, List list) {
        this.a = i;
        this.b = lzVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz)) {
            return false;
        }
        mz mzVar = (mz) obj;
        return this.a == mzVar.a && k71.k.b(this.b, mzVar.b) && k71.k.b(this.c, mzVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(userCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}
