package h01;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public final p a;
    public final List b;
    public final j c;

    public o(p pVar, List list, j jVar) {
        this.a = pVar;
        this.b = list;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c);
    }

    public final int hashCode() {
        int c = f1.e.c(this.b, this.a.hashCode() * 31, 31);
        j jVar = this.c;
        return c + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "SubIssueData(subIssueProgress=" + this.a + ", issues=" + this.b + ", parentIssue=" + this.c + ")";
    }
}
