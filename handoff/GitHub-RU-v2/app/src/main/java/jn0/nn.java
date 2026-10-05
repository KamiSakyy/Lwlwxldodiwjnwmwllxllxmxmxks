package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nn {
    public final String a;
    public final tn b;
    public final String c;

    public nn(String str, tn tnVar, String str2) {
        this.a = str;
        this.b = tnVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        return k71.k.b(this.a, nnVar.a) && k71.k.b(this.b, nnVar.b) && k71.k.b(this.c, nnVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tn tnVar = this.b;
        return this.c.hashCode() + ((hashCode + (tnVar == null ? 0 : tnVar.hashCode())) * 31);
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
