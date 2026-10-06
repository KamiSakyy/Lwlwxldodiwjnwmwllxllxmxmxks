package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qx {
    public final String a;
    public final boolean b;
    public final nx c;
    public final String d;

    public qx(String str, boolean z, nx nxVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = nxVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx)) {
            return false;
        }
        qx qxVar = (qx) obj;
        return k71.k.b(this.a, qxVar.a) && this.b == qxVar.b && k71.k.b(this.c, qxVar.c) && k71.k.b(this.d, qxVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        nx nxVar = this.c;
        return this.d.hashCode() + ((e + (nxVar == null ? 0 : nxVar.hashCode())) * 31);
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
