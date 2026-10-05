package i50;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final t f;
    public final String g;
    public final c40.c h;
    public final i80.c i;
    public final g70.a j;
    public final y60.a k;

    public u(String str, String str2, boolean z, boolean z2, boolean z3, t tVar, String str3, c40.c cVar, i80.c cVar2, g70.a aVar, y60.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = tVar;
        this.g = str3;
        this.h = cVar;
        this.i = cVar2;
        this.j = aVar;
        this.k = aVar2;
    }

    public static u a(u uVar, boolean z, boolean z2, boolean z3, g70.a aVar, y60.a aVar2, int i) {
        String str = uVar.a;
        String str2 = uVar.b;
        if ((i & 4) != 0) {
            z = uVar.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = uVar.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = uVar.e;
        }
        boolean z6 = z3;
        t tVar = uVar.f;
        String str3 = uVar.g;
        c40.c cVar = uVar.h;
        i80.c cVar2 = uVar.i;
        g70.a aVar3 = (i & 512) != 0 ? uVar.j : aVar;
        y60.a aVar4 = (i & 1024) != 0 ? uVar.k : aVar2;
        k71.k.g(aVar4, "minimizableCommentFragment");
        return new u(str, str2, z4, z5, z6, tVar, str3, cVar, cVar2, aVar3, aVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && this.c == uVar.c && this.d == uVar.d && this.e == uVar.e && k71.k.b(this.f, uVar.f) && k71.k.b(this.g, uVar.g) && k71.k.b(this.h, uVar.h) && k71.k.b(this.i, uVar.i) && k71.k.b(this.j, uVar.j) && k71.k.b(this.k, uVar.k);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e);
        t tVar = this.f;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + h1.i((e + (tVar == null ? 0 : tVar.hashCode())) * 31, this.g, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionCommentReplyFragment(__typename=", this.a, ", url=", this.b, ", viewerCanMarkAsAnswer=");
        m0.A(o, this.c, ", viewerCanUnmarkAsAnswer=", this.d, ", isAnswer=");
        o.append(this.e);
        o.append(", discussion=");
        o.append(this.f);
        o.append(", id=");
        o.append(this.g);
        o.append(", commentFragment=");
        o.append(this.h);
        o.append(", reactionFragment=");
        o.append(this.i);
        o.append(", orgBlockableFragment=");
        o.append(this.j);
        o.append(", minimizableCommentFragment=");
        o.append(this.k);
        o.append(")");
        return o.toString();
    }
}
