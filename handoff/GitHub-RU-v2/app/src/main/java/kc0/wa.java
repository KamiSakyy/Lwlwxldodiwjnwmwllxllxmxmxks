package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wa {
    public String a;
    public va b;
    public String c;

    public wa(String str, va vaVar, String str2) {
        this.a = str;
        this.b = vaVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return k71.k.b(this.a, waVar.a) && k71.k.b(this.b, waVar.b) && k71.k.b(this.c, waVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        va vaVar = this.b;
        return this.c.hashCode() + ((hashCode + (vaVar == null ? 0 : vaVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
