package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jd {
    public int a;
    public hd b;
    public List c;

    public jd(int i, hd hdVar, List list) {
        this.a = i;
        this.b = hdVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        return this.a == jdVar.a && k71.k.b(this.b, jdVar.b) && k71.k.b(this.c, jdVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(discussionCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}
