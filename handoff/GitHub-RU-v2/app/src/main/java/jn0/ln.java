package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ln {
    public final kn a;
    public final String b;
    public final String c;

    public ln(kn knVar, String str, String str2) {
        this.a = knVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        return k71.k.b(this.a, lnVar.a) && k71.k.b(this.b, lnVar.b) && k71.k.b(this.c, lnVar.c);
    }

    public final int hashCode() {
        kn knVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((knVar == null ? 0 : Boolean.hashCode(knVar.a)) * 31, this.b, 31);
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
