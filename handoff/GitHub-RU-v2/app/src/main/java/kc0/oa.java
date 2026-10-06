package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oa {
    public final String a;
    public final String b;
    public final pa c;
    public final yf0.d0 d;

    public oa(String str, String str2, pa paVar, yf0.d0 d0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = paVar;
        this.d = d0Var;
    }

    public static oa a(oa oaVar, yf0.d0 d0Var) {
        String str = oaVar.a;
        String str2 = oaVar.b;
        pa paVar = oaVar.c;
        oaVar.getClass();
        k71.k.g(str, "__typename");
        return new oa(str, str2, paVar, d0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return k71.k.b(this.a, oaVar.a) && k71.k.b(this.b, oaVar.b) && k71.k.b(this.c, oaVar.c) && k71.k.b(this.d, oaVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        pa paVar = this.c;
        int hashCode = (i + (paVar == null ? 0 : paVar.hashCode())) * 31;
        yf0.d0 d0Var = this.d;
        return hashCode + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onDiscussionComment=");
        o.append(this.c);
        o.append(", discussionSubThreadHeadFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
