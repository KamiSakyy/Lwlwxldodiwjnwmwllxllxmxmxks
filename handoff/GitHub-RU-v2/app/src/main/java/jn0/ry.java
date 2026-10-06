package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ry {
    public String a;
    public ny b;
    public String c;

    public ry(String str, ny nyVar, String str2) {
        this.a = str;
        this.b = nyVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry)) {
            return false;
        }
        ry ryVar = (ry) obj;
        return k71.k.b(this.a, ryVar.a) && k71.k.b(this.b, ryVar.b) && k71.k.b(this.c, ryVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ny nyVar = this.b;
        return this.c.hashCode() + ((hashCode + (nyVar == null ? 0 : nyVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", comparison=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
