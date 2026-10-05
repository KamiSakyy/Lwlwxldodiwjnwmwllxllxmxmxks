package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements aa.h0 {
    public final String a;
    public final g0 b;
    public final h0 c;

    public i0(String str, g0 g0Var, h0 h0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = g0Var;
        this.c = h0Var;
    }

    public static i0 a(i0 i0Var, g0 g0Var, h0 h0Var) {
        String str = i0Var.a;
        i0Var.getClass();
        k71.k.g(str, "__typename");
        return new i0(str, g0Var, h0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g0 g0Var = this.b;
        int hashCode2 = (hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        h0 h0Var = this.c;
        return hashCode2 + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DiscussionVotableFragment(__typename=" + this.a + ", onDiscussion=" + this.b + ", onDiscussionComment=" + this.c + ")";
    }
}
