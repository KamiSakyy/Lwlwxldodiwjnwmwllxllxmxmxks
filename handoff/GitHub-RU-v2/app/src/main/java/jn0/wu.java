package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wu implements aaShadow.v0 {
    public final yu a;
    public final String b;
    public final String c;

    public wu(yu yuVar, String str, String str2) {
        this.a = yuVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu)) {
            return false;
        }
        wu wuVar = (wu) obj;
        return k71.k.b(this.a, wuVar.a) && k71.k.b(this.b, wuVar.b) && k71.k.b(this.c, wuVar.c);
    }

    public final int hashCode() {
        yu yuVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((yuVar == null ? 0 : yuVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
