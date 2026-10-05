package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yd implements aa.v0 {
    public final be a;
    public final String b;
    public final String c;

    public yd(be beVar, String str, String str2) {
        this.a = beVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return k71.k.b(this.a, ydVar.a) && k71.k.b(this.b, ydVar.b) && k71.k.b(this.c, ydVar.c);
    }

    public final int hashCode() {
        be beVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((beVar == null ? 0 : beVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(topic=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
