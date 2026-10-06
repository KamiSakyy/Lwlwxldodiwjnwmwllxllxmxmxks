package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jp {
    public gp a;
    public String b;
    public String c;

    public jp(gp gpVar, String str, String str2) {
        this.a = gpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        return k71.k.b(this.a, jpVar.a) && k71.k.b(this.b, jpVar.b) && k71.k.b(this.c, jpVar.c);
    }

    public final int hashCode() {
        gp gpVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((gpVar == null ? 0 : gpVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Discussion(comment=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
