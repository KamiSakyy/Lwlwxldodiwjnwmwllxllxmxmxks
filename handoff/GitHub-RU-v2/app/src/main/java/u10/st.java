package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class st {
    public final String a;
    public final boolean b;
    public final pt c;
    public final String d;

    public st(String str, boolean z, pt ptVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = ptVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return k71.k.b(this.a, stVar.a) && this.b == stVar.b && k71.k.b(this.c, stVar.c) && k71.k.b(this.d, stVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        pt ptVar = this.c;
        return this.d.hashCode() + ((e + (ptVar == null ? 0 : ptVar.hashCode())) * 31);
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
