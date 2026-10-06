package gn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m00 {
    public final aa1.b a = aa.t0.d;
    public String b;
    public List c;
    public aa1.b d;

    public m00(String str, List list, aa.u0 u0Var) {
        this.b = str;
        this.c = list;
        this.d = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return k71.k.b(this.a, m00Var.a) && k71.k.b(this.b, m00Var.b) && k71.k.b(this.c, m00Var.c) && k71.k.b(this.d, m00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1.e.c(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "UpdateUserListsForItemInput(clientMutationId=" + this.a + ", itemId=" + this.b + ", listIds=" + this.c + ", suggestedListIds=" + this.d + ")";
    }
}
