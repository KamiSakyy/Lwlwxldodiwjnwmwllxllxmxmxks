package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pd {
    public String a;
    public String b;
    public sd0.s c;

    public pd(String str, String str2, sd0.s sVar) {
        this.a = str;
        this.b = str2;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return k71.k.b(this.a, pdVar.a) && k71.k.b(this.b, pdVar.b) && k71.k.b(this.c, pdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationNameAndAvatar=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
