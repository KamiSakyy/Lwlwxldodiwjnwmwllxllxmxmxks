package pz0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q80 {
    public final aa1.b a = aa.t0.d;
    public String b;
    public List c;
    public aa1.b d;

    public q80(String str, List list, aa.u0 u0Var) {
        this.b = str;
        this.c = list;
        this.d = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q80)) {
            return false;
        }
        q80 q80Var = (q80) obj;
        return k71.k.b(this.a, q80Var.a) && k71.k.b(this.b, q80Var.b) && k71.k.b(this.c, q80Var.c) && k71.k.b(this.d, q80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1.e.c(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "UpdateUserListsForItemInput(clientMutationId=" + this.a + ", itemId=" + this.b + ", listIds=" + this.c + ", suggestedListIds=" + this.d + ")";
    }
}
