package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ga {
    public String a;
    public String b;
    public ha c;
    public i50.c0 d;

    public ga(String str, String str2, ha haVar, i50.c0 c0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = haVar;
        this.d = c0Var;
    }

    public static ga a(ga gaVar, i50.c0 c0Var) {
        String str = gaVar.a;
        String str2 = gaVar.b;
        ha haVar = gaVar.c;
        gaVar.getClass();
        k71.k.g(str, "__typename");
        return new ga(str, str2, haVar, c0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return k71.k.b(this.a, gaVar.a) && k71.k.b(this.b, gaVar.b) && k71.k.b(this.c, gaVar.c) && k71.k.b(this.d, gaVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ha haVar = this.c;
        int hashCode = (i + (haVar == null ? 0 : haVar.hashCode())) * 31;
        i50.c0 c0Var = this.d;
        return hashCode + (c0Var != null ? c0Var.hashCode() : 0);
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
