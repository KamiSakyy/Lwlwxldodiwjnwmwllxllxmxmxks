package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xa {
    public String a;
    public bb b;
    public String c;

    public xa(String str, bb bbVar, String str2) {
        this.a = str;
        this.b = bbVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return k71.k.b(this.a, xaVar.a) && k71.k.b(this.b, xaVar.b) && k71.k.b(this.c, xaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bb bbVar = this.b;
        return this.c.hashCode() + ((hashCode + (bbVar == null ? 0 : bbVar.hashCode())) * 31);
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
