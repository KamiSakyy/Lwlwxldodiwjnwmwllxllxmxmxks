package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eq {
    public final gq a;
    public final String b;
    public final String c;

    public eq(gq gqVar, String str, String str2) {
        this.a = gqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return k71.k.b(this.a, eqVar.a) && k71.k.b(this.b, eqVar.b) && k71.k.b(this.c, eqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization(teams=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }










}
