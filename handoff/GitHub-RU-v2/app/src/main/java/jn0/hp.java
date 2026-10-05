package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hp implements aa.v0 {
    public final ip a;
    public final String b;
    public final String c;

    public hp(ip ipVar, String str, String str2) {
        this.a = ipVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return k71.k.b(this.a, hpVar.a) && k71.k.b(this.b, hpVar.b) && k71.k.b(this.c, hpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
