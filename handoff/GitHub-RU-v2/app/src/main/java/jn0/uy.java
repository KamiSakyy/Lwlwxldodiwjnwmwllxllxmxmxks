package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uy {
    public final String a;
    public final xy b;
    public final String c;

    public uy(String str, xy xyVar, String str2) {
        this.a = str;
        this.b = xyVar;
        this.c = str2;
    }

    public static uy a(uy uyVar, xy xyVar) {
        String str = uyVar.a;
        String str2 = uyVar.c;
        uyVar.getClass();
        return new uy(str, xyVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy)) {
            return false;
        }
        uy uyVar = (uy) obj;
        return k71.k.b(this.a, uyVar.a) && k71.k.b(this.b, uyVar.b) && k71.k.b(this.c, uyVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xy xyVar = this.b;
        return this.c.hashCode() + ((hashCode + (xyVar == null ? 0 : xyVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Compare(id=");
        sb.append(this.a);
        sb.append(", diff=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
