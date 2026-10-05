package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jy {
    public final int a;
    public final iy b;
    public final List c;

    public jy(int i, iy iyVar, List list) {
        this.a = i;
        this.b = iyVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        return this.a == jyVar.a && k71.k.b(this.b, jyVar.b) && k71.k.b(this.c, jyVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(repositoryCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}
