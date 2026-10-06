package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rz {
    public String a;
    public boolean b;
    public oz c;
    public String d;

    public rz(String str, boolean z, oz ozVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = ozVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        return k71.k.b(this.a, rzVar.a) && this.b == rzVar.b && k71.k.b(this.c, rzVar.c) && k71.k.b(this.d, rzVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        oz ozVar = this.c;
        return this.d.hashCode() + ((e + (ozVar == null ? 0 : ozVar.hashCode())) * 31);
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
