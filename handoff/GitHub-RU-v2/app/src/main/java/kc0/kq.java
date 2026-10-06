package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kq {
    public final String a;
    public final sq b;
    public final String c;

    public kq(String str, sq sqVar, String str2) {
        this.a = str;
        this.b = sqVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        return k71.k.b(this.a, kqVar.a) && k71.k.b(this.b, kqVar.b) && k71.k.b(this.c, kqVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sq sqVar = this.b;
        return this.c.hashCode() + ((hashCode + (sqVar == null ? 0 : sqVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
