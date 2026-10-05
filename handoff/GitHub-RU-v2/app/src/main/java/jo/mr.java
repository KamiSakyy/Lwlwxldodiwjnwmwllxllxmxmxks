package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mr {
    public final String a;
    public final jr b;
    public final String c;

    public mr(String str, jr jrVar, String str2) {
        this.a = str;
        this.b = jrVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr)) {
            return false;
        }
        mr mrVar = (mr) obj;
        return k71.k.b(this.a, mrVar.a) && k71.k.b(this.b, mrVar.b) && k71.k.b(this.c, mrVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jr jrVar = this.b;
        return this.c.hashCode() + ((hashCode + (jrVar == null ? 0 : jrVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
