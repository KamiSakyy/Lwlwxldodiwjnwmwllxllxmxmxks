package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xc {
    public final String a;
    public final wc b;
    public final String c;

    public xc(String str, wc wcVar, String str2) {
        this.a = str;
        this.b = wcVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return k71.k.b(this.a, xcVar.a) && k71.k.b(this.b, xcVar.b) && k71.k.b(this.c, xcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Topic(id=");
        sb.append(this.a);
        sb.append(", repositories=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
