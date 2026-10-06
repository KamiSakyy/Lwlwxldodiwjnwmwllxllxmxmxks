package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ku {
    public String a;
    public su b;
    public String c;

    public ku(String str, su suVar, String str2) {
        this.a = str;
        this.b = suVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        return k71.k.b(this.a, kuVar.a) && k71.k.b(this.b, kuVar.b) && k71.k.b(this.c, kuVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        su suVar = this.b;
        return this.c.hashCode() + ((hashCode + (suVar == null ? 0 : suVar.hashCode())) * 31);
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
