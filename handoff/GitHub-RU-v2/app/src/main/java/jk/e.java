package jk;

import java.util.ArrayList;
import java.util.List;
import k71.k;
import yz0.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final boolean a;
    public final List b;
    public final f4 c;

    public e(boolean z, List list, f4 f4Var) {
        this.a = z;
        this.b = list;
        this.c = f4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static e a(e eVar, boolean z, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = eVar.a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = eVar.b;
        }
        f4 f4Var = eVar.c;
        eVar.getClass();
        return new e(z, arrayList2, f4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && k.b(this.b, eVar.b) && k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1.e.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "DiscussionCommentsDataPage(isLoading=" + this.a + ", discussionComments=" + this.b + ", page=" + this.c + ")";
    }
}
