package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ez {
    public String a;
    public String b;
    public String c;
    public dz d;

    public ez(String str, String str2, String str3, dz dzVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        return k71.k.b(this.a, ezVar.a) && k71.k.b(this.b, ezVar.b) && k71.k.b(this.c, ezVar.c) && k71.k.b(this.d, ezVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        dz dzVar = this.d;
        return i + (dzVar == null ? 0 : dzVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", name=", this.b, ", id=");
        o.append(this.c);
        o.append(", pinnedIssues=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
