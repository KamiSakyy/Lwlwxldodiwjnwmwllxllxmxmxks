package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ul {
    public tl a;
    public String b;
    public String c;

    public ul(tl tlVar, String str, String str2) {
        this.a = tlVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul)) {
            return false;
        }
        ul ulVar = (ul) obj;
        return k71.k.b(this.a, ulVar.a) && k71.k.b(this.b, ulVar.b) && k71.k.b(this.c, ulVar.c);
    }

    public final int hashCode() {
        tl tlVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((tlVar == null ? 0 : Boolean.hashCode(tlVar.a)) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(notificationSettings=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
