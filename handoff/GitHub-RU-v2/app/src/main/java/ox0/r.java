package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public String a;
    public h0 b;
    public String c;

    public r(String str, h0 h0Var, String str2) {
        this.a = str;
        this.b = h0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnRepository(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", name=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
