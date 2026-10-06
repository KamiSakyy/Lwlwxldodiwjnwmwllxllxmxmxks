package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ae {
    public final String a;
    public final yd b;
    public final String c;

    public ae(String str, yd ydVar, String str2) {
        this.a = str;
        this.b = ydVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return k71.k.b(this.a, aeVar.a) && k71.k.b(this.b, aeVar.b) && k71.k.b(this.c, aeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yd ydVar = this.b;
        return this.c.hashCode() + ((hashCode + (ydVar == null ? 0 : ydVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", object=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
