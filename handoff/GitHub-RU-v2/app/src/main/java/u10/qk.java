package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qk {
    public final pk a;
    public final String b;
    public final String c;

    public qk(pk pkVar, String str, String str2) {
        this.a = pkVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk)) {
            return false;
        }
        qk qkVar = (qk) obj;
        return k71.k.b(this.a, qkVar.a) && k71.k.b(this.b, qkVar.b) && k71.k.b(this.c, qkVar.c);
    }

    public final int hashCode() {
        pk pkVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((pkVar == null ? 0 : Boolean.hashCode(pkVar.a)) * 31, this.b, 31);
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
