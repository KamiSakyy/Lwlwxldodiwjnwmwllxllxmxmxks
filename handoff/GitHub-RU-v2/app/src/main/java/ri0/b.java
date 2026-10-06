package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements aa.h0 {
    public String a;
    public boolean b;
    public boolean c;
    public a d;
    public String e;

    public b(String str, boolean z, boolean z2, a aVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = aVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        a aVar = this.d;
        return this.e.hashCode() + ((e + (aVar == null ? 0 : aVar.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("AutoMergeRequestFragment(id=", this.a, ", viewerCanDisableAutoMerge=", ", viewerCanEnableAutoMerge=", this.b);
        o.append(this.c);
        o.append(", autoMergeRequest=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
    public Object c(Object p1, Object p2) { return null; }
}
