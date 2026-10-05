package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ms {
    public final String a;
    public final us b;
    public final String c;

    public ms(String str, us usVar, String str2) {
        this.a = str;
        this.b = usVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return k71.k.b(this.a, msVar.a) && k71.k.b(this.b, msVar.b) && k71.k.b(this.c, msVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        us usVar = this.b;
        return this.c.hashCode() + ((hashCode + (usVar == null ? 0 : usVar.hashCode())) * 31);
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
