package jk;

import com.github.rudroid.m0;
import java.util.ArrayList;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final x01.i d;

    public h(String str, ArrayList arrayList, ArrayList arrayList2, x01.i iVar) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.a, hVar.a) && this.b.equals(hVar.b) && this.c.equals(hVar.c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + no.a.b(this.c, no.a.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder p = m0.p("DiscussionsDataPage(repoName=", this.a, ", discussions=", this.b, ", pinnedDiscussions=");
        p.append(this.c);
        p.append(", page=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
