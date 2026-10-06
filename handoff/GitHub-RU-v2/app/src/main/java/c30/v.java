package c30;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public final String a;
    public final String b;
    public final boolean c;
    public final w d;
    public final String e;

    public v(String str, String str2, boolean z, w wVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = wVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && this.c == vVar.c && k71.k.b(this.d, vVar.d) && k71.k.b(this.e, vVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        w wVar = this.d;
        return this.e.hashCode() + ((e + (wVar == null ? 0 : wVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Ref(id=", this.a, ", name=", this.b, ", viewerCanCommitToBranch=");
        o.append(this.c);
        o.append(", target=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
