package b01;

import com.github.rudroid.m0;
import java.util.ArrayList;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public final String a;
    public final ArrayList b;
    public final x01.i c;

    public o(String str, ArrayList arrayList, x01.i iVar) {
        this.a = str;
        this.b = arrayList;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!k71.k.b(this.a, oVar.a) || !this.b.equals(oVar.b)) {
            return false;
        }
        r rVar = r.r;
        return rVar.equals(rVar) && this.c.equals(oVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31) + 1) * 31);
    }

    public final String toString() {
        StringBuilder p = m0.p("DiscussionsList(repoName=", this.a, ", discussions=", this.b, ", pinnedDiscussions=");
        p.append(r.r);
        p.append(", page=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
