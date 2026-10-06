package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xl implements aaShadow.v0 {
    public final am a;
    public final String b;
    public final String c;

    public xl(am amVar, String str, String str2) {
        this.a = amVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl)) {
            return false;
        }
        xl xlVar = (xl) obj;
        return k71.k.b(this.a, xlVar.a) && k71.k.b(this.b, xlVar.b) && k71.k.b(this.c, xlVar.c);
    }

    public final int hashCode() {
        am amVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((amVar == null ? 0 : amVar.hashCode()) * 31, this.b, 31);
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
