package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ny {
    public final String a;
    public final my b;
    public final String c;

    public ny(String str, my myVar, String str2) {
        this.a = str;
        this.b = myVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) obj;
        return k71.k.b(this.a, nyVar.a) && k71.k.b(this.b, nyVar.b) && k71.k.b(this.c, nyVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        my myVar = this.b;
        return this.c.hashCode() + ((hashCode + (myVar == null ? 0 : myVar.hashCode())) * 31);
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
