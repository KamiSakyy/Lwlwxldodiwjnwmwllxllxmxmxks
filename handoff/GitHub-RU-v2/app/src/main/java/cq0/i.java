package cq0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public String a;
    public boolean b;
    public x c;
    public g d;

    public i(String str, boolean z, x xVar, g gVar) {
        this.a = str;
        this.b = z;
        this.c = xVar;
        this.d = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && this.b == iVar.b && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int e = x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        x xVar = this.c;
        int hashCode = (e + (xVar == null ? 0 : xVar.a.hashCode())) * 31;
        g gVar = this.d;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("NewTreeEntry(path=", this.a, ", isGenerated=", ", submodule=", this.b);
        o.append(this.c);
        o.append(", fileType=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
