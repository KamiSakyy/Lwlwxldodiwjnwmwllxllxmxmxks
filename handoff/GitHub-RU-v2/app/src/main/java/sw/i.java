package sw;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final b e;

    public i(String str, String str2, boolean z, String str3, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && this.c == iVar.c && k71.k.b(this.d, iVar.d) && k71.k.b(this.e, iVar.e);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
        b bVar = this.e;
        return i + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("OnSearchShortcutQueryLabelTerm(term=", this.a, ", name=", this.b, ", negative=");
        com.github.rudroid.m0.z(o, this.c, ", value=", this.d, ", label=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
