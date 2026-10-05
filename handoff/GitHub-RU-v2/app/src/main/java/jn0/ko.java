package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ko implements aa.v0 {
    public final mo a;
    public final String b;
    public final String c;

    public ko(mo moVar, String str, String str2) {
        this.a = moVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko)) {
            return false;
        }
        ko koVar = (ko) obj;
        return k71.k.b(this.a, koVar.a) && k71.k.b(this.b, koVar.b) && k71.k.b(this.c, koVar.c);
    }

    public final int hashCode() {
        mo moVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((moVar == null ? 0 : moVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(organization=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
