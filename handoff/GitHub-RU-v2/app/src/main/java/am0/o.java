package am0;

import com.github.rudroid.copilot.h1;
import gn0.hn;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public String a;
    public String b;
    public boolean c;
    public int d;
    public hn e;
    public i0 f;
    public boolean g;
    public String h;

    public o(String str, String str2, boolean z, int i, hn hnVar, i0 i0Var, boolean z2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = hnVar;
        this.f = i0Var;
        this.g = z2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && this.c == oVar.c && this.d == oVar.d && this.e == oVar.e && k71.k.b(this.f, oVar.f) && this.g == oVar.g && k71.k.b(this.h, oVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + x.i.e((this.f.hashCode() + ((this.e.hashCode() + a0.s0.b(this.d, x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(id=", this.a, ", url=", this.b, ", isDraft=");
        com.github.rudroid.m0.y(o, this.c, ", number=", this.d, ", pullRequestState=");
        o.append(this.e);
        o.append(", repository=");
        o.append(this.f);
        o.append(", isInMergeQueue=");
        return com.github.rudroid.m0.l(o, this.g, ", titleHTML=", this.h, ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b {
        public b() {
        }
    }
}
