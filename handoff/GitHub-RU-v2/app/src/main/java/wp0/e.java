package wp0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final b d;
    public final j e;

    public e(String str, String str2, String str3, b bVar, j jVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        b bVar = this.d;
        return this.e.hashCode() + ((i + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnCommit(abbreviatedOid=", this.a, ", id=", this.b, ", messageHeadline=");
        o.append(this.c);
        o.append(", author=");
        o.append(this.d);
        o.append(", repository=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
