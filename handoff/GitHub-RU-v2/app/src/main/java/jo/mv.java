package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mv {
    public final lv a;
    public final String b;
    public final String c;

    public mv(lv lvVar, String str, String str2) {
        this.a = lvVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv)) {
            return false;
        }
        mv mvVar = (mv) obj;
        return k71.k.b(this.a, mvVar.a) && k71.k.b(this.b, mvVar.b) && k71.k.b(this.c, mvVar.c);
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
