package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vy {
    public String a;
    public uy b;
    public String c;

    public vy(String str, uy uyVar, String str2) {
        this.a = str;
        this.b = uyVar;
        this.c = str2;
    }

    public static vy a(vy vyVar, uy uyVar) {
        String str = vyVar.a;
        String str2 = vyVar.c;
        vyVar.getClass();
        return new vy(str, uyVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy)) {
            return false;
        }
        vy vyVar = (vy) obj;
        return k71.k.b(this.a, vyVar.a) && k71.k.b(this.b, vyVar.b) && k71.k.b(this.c, vyVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uy uyVar = this.b;
        return this.c.hashCode() + ((hashCode + (uyVar == null ? 0 : uyVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comparison(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
