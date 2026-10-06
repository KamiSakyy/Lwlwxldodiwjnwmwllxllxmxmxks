package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gv {
    public String a;
    public boolean b;
    public dv c;
    public String d;

    public gv(String str, boolean z, dv dvVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = dvVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        return k71.k.b(this.a, gvVar.a) && this.b == gvVar.b && k71.k.b(this.c, gvVar.c) && k71.k.b(this.d, gvVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        dv dvVar = this.c;
        return this.d.hashCode() + ((e + (dvVar == null ? 0 : dvVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Repository(id=", this.a, ", viewerCanPush=", ", branchInfo=", this.b);
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
