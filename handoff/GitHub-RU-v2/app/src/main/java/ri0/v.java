package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.h0 {
    public String a;
    public String b;
    public u c;
    public String d;

    public v(String str, String str2, u uVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = uVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c) && k71.k.b(this.d, vVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("FilesChangedReviewThreadFragment(id=", this.a, ", headRefOid=", this.b, ", reviewThreads=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
