package jk;

import a0.s0;
import b01.n;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final String a;
    public final int b;
    public final lj.a c;
    public final String d;
    public final String e;
    public final n f;

    public i(String str, int i, lj.a aVar, String str2, String str3, n nVar) {
        this.a = str;
        this.b = i;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k.b(this.a, iVar.a) && this.b == iVar.b && k.b(this.c, iVar.c) && k.b(this.d, iVar.d) && k.b(this.e, iVar.e) && k.b(this.f, iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + h1.i(h1.i((this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31)) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "PinnedDiscussionData(id=", this.a, ", number=", ", author=");
        n.append(this.c);
        n.append(", title=");
        n.append(this.d);
        n.append(", categoryName=");
        n.append(this.e);
        n.append(", background=");
        n.append(this.f);
        n.append(")");
        return n.toString();
    }
}
