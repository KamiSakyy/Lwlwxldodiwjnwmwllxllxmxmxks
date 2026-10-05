package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hv implements aa.v0 {
    public final lv a;
    public final String b;
    public final String c;

    public hv(lv lvVar, String str, String str2) {
        this.a = lvVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        return k71.k.b(this.a, hvVar.a) && k71.k.b(this.b, hvVar.b) && k71.k.b(this.c, hvVar.c);
    }

    public final int hashCode() {
        lv lvVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((lvVar == null ? 0 : lvVar.hashCode()) * 31, this.b, 31);
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
