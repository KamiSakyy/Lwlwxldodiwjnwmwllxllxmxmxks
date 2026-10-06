package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eu {
    public String a;
    public String b;
    public String c;
    public gu d;
    public uu0.j5 e;

    public eu(String str, String str2, String str3, gu guVar, uu0.j5 j5Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = guVar;
        this.e = j5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        return k71.k.b(this.a, euVar.a) && k71.k.b(this.b, euVar.b) && k71.k.b(this.c, euVar.c) && k71.k.b(this.d, euVar.d) && k71.k.b(this.e, euVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        gu guVar = this.d;
        return this.e.hashCode() + ((i + (guVar == null ? 0 : guVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", parent=");
        o.append(this.d);
        o.append(", subIssueFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
