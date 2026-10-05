package fz;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;
import lz.o0;
import qx.k2;
import x61.n;
import x61.r;
import yz0.b3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements b3 {
    public final boolean a;
    public final boolean b;
    public final ArrayList c;

    public i(lz.d dVar) {
        k71.k.g(dVar, "data");
        o0 o0Var = dVar.a;
        k2 k2Var = o0Var.d.a;
        int i = 0;
        boolean z = k2Var != null && k2Var.a;
        boolean z2 = k2Var != null && k2Var.b;
        r rVar = o0Var.b.b;
        ArrayList S = x61.m.S(rVar == null ? r.r : rVar);
        ArrayList arrayList = new ArrayList(n.F(S, 10));
        int size = S.size();
        while (i < size) {
            Object obj = S.get(i);
            i++;
            arrayList.add(new h((lz.e) obj));
        }
        this.a = z;
        this.b = z2;
        this.c = arrayList;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && k71.k.b(this.c, iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return m0.j(")", h1.u("ApolloNotifications(getsParticipatingWeb=", this.a, ", getsWatchingWeb=", this.b, ", notifications="), this.c);
    }
}
