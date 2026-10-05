package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gb implements aa.v0 {
    public final ib a;
    public final String b;
    public final String c;

    public gb(ib ibVar, String str, String str2) {
        this.a = ibVar;
        this.b = str;
        this.c = str2;
    }

    public static gb a(gb gbVar, ib ibVar) {
        String str = gbVar.b;
        String str2 = gbVar.c;
        gbVar.getClass();
        return new gb(ibVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return k71.k.b(this.a, gbVar.a) && k71.k.b(this.b, gbVar.b) && k71.k.b(this.c, gbVar.c);
    }

    public final int hashCode() {
        ib ibVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ibVar == null ? 0 : ibVar.hashCode()) * 31, this.b, 31);
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
