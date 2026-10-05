package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tx implements aa.v0 {
    public final yx a;
    public final String b;
    public final String c;

    public tx(yx yxVar, String str, String str2) {
        this.a = yxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        return k71.k.b(this.a, txVar.a) && k71.k.b(this.b, txVar.b) && k71.k.b(this.c, txVar.c);
    }

    public final int hashCode() {
        yx yxVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((yxVar == null ? 0 : yxVar.hashCode()) * 31, this.b, 31);
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
