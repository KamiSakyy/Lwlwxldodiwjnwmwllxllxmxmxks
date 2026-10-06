package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class da {
    public final String a;
    public final ha b;
    public final String c;

    public da(String str, ha haVar, String str2) {
        this.a = str;
        this.b = haVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return k71.k.b(this.a, daVar.a) && k71.k.b(this.b, daVar.b) && k71.k.b(this.c, daVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ha haVar = this.b;
        return this.c.hashCode() + ((hashCode + (haVar == null ? 0 : haVar.hashCode())) * 31);
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
