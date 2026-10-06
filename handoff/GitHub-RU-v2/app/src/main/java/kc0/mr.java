package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mr {
    public lr a;
    public String b;
    public String c;

    public mr(lr lrVar, String str, String str2) {
        this.a = lrVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr)) {
            return false;
        }
        mr mrVar = (mr) obj;
        return k71.k.b(this.a, mrVar.a) && k71.k.b(this.b, mrVar.b) && k71.k.b(this.c, mrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reaction(reactable=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
