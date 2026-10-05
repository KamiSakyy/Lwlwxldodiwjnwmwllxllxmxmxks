package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sk {
    public final String a;
    public final yk b;
    public final String c;

    public sk(String str, yk ykVar, String str2) {
        this.a = str;
        this.b = ykVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk)) {
            return false;
        }
        sk skVar = (sk) obj;
        return k71.k.b(this.a, skVar.a) && k71.k.b(this.b, skVar.b) && k71.k.b(this.c, skVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yk ykVar = this.b;
        return this.c.hashCode() + ((hashCode + (ykVar == null ? 0 : ykVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comment(id=");
        sb.append(this.a);
        sb.append(", replyTo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
