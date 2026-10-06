package hc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ez {
    public final aa1.b a = aa.t0.d;
    public final String b;
    public final List c;
    public final aa1.b d;

    public ez(String str, List list, aa.u0 u0Var) {
        this.b = str;
        this.c = list;
        this.d = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        return k71.k.b(this.a, ezVar.a) && k71.k.b(this.b, ezVar.b) && k71.k.b(this.c, ezVar.c) && k71.k.b(this.d, ezVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1.e.c(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "UpdateUserListsForItemInput(clientMutationId=" + this.a + ", itemId=" + this.b + ", listIds=" + this.c + ", suggestedListIds=" + this.d + ")";
    }
}
