package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vx {
    public final int a;
    public final cy b;
    public final List c;

    public vx(int i, cy cyVar, List list) {
        this.a = i;
        this.b = cyVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx)) {
            return false;
        }
        vx vxVar = (vx) obj;
        return this.a == vxVar.a && k71.k.b(this.b, vxVar.b) && k71.k.b(this.c, vxVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entries(totalCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }
}
