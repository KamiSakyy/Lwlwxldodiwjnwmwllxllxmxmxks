package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wl {
    public String a;
    public cm b;
    public String c;

    public wl(String str, cm cmVar, String str2) {
        this.a = str;
        this.b = cmVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl)) {
            return false;
        }
        wl wlVar = (wl) obj;
        return k71.k.b(this.a, wlVar.a) && k71.k.b(this.b, wlVar.b) && k71.k.b(this.c, wlVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cm cmVar = this.b;
        return this.c.hashCode() + ((hashCode + (cmVar == null ? 0 : cmVar.hashCode())) * 31);
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
