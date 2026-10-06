package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v9 {
    public String a;
    public String b;
    public wf0.b c;

    public v9(String str, String str2, wf0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        return k71.k.b(this.a, v9Var.a) && k71.k.b(this.b, v9Var.b) && k71.k.b(this.c, v9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", discussionCategoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
