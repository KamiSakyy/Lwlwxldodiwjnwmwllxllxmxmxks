package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ap implements aaShadow.v0 {
    public final ep a;
    public final String b;
    public final String c;

    public ap(ep epVar, String str, String str2) {
        this.a = epVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return k71.k.b(this.a, apVar.a) && k71.k.b(this.b, apVar.b) && k71.k.b(this.c, apVar.c);
    }

    public final int hashCode() {
        ep epVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((epVar == null ? 0 : epVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
