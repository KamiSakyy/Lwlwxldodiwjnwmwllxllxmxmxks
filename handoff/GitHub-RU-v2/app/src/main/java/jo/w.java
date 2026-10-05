package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public final String a;
    public final v b;
    public final String c;

    public w(String str, v vVar, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = vVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v vVar = this.b;
        return this.c.hashCode() + ((hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollOption(id=");
        sb.append(this.a);
        sb.append(", poll=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
