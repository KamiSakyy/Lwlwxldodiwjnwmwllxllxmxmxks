package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ib {
    public final String a;
    public final String b;
    public final jb c;
    public final er0.d0 d;

    public ib(String str, String str2, jb jbVar, er0.d0 d0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = jbVar;
        this.d = d0Var;
    }

    public static ib a(ib ibVar, er0.d0 d0Var) {
        String str = ibVar.a;
        String str2 = ibVar.b;
        jb jbVar = ibVar.c;
        ibVar.getClass();
        k71.k.g(str, "__typename");
        return new ib(str, str2, jbVar, d0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return k71.k.b(this.a, ibVar.a) && k71.k.b(this.b, ibVar.b) && k71.k.b(this.c, ibVar.c) && k71.k.b(this.d, ibVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        jb jbVar = this.c;
        int hashCode = (i + (jbVar == null ? 0 : jbVar.hashCode())) * 31;
        er0.d0 d0Var = this.d;
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
