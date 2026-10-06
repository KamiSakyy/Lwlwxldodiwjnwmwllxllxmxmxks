package l01;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public p0 a;
    public u b;
    public List c;

    public v(p0 p0Var, u uVar, List list) {
        this.a = p0Var;
        this.b = uVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u uVar = this.b;
        return this.c.hashCode() + ((hashCode + (uVar == null ? 0 : uVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProjectBoardItem(projectItem=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", sortValues=");
        return x.i.l(sb, this.c, ")");
    }
}
