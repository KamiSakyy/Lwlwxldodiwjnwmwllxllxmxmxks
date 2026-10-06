package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ro implements aaShadow.v0 {
    public vo a;
    public String b;
    public String c;

    public ro(vo voVar, String str, String str2) {
        this.a = voVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro)) {
            return false;
        }
        ro roVar = (ro) obj;
        return k71.k.b(this.a, roVar.a) && k71.k.b(this.b, roVar.b) && k71.k.b(this.c, roVar.c);
    }

    public final int hashCode() {
        vo voVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((voVar == null ? 0 : voVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
