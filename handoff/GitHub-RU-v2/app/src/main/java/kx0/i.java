package kx0;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import fw0.i2;
import java.util.ArrayList;
import java.util.List;
import ox0.p0;
import x61.n;
import x61.rShadow;
import yz0.b3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements b3 {
    public boolean a;
    public boolean b;
    public ArrayList c;

    public i(ox0.d dVar) {
        k71.k.g(dVar, "data");
        p0 p0Var = dVar.a;
        i2 i2Var = p0Var.d.a;
        int i = 0;
        boolean z = i2Var != null && i2Var.a;
        boolean z2 = i2Var != null && i2Var.b;
        Iterable iterable = p0Var.b.b;
        ArrayList S = x61.m.S(iterable == null ? r.r : iterable);
        ArrayList arrayList = new ArrayList(n.F(S, 10));
        int size = S.size();
        while (i < size) {
            Object obj = S.get(i);
            i++;
            arrayList.add(new h((ox0.f) obj));
        }
        this.a = z;
        this.b = z2;
        this.c = arrayList;
    }

    @Override // yz0.b3
    public final boolean a() {
        return this.b;
    }

    @Override // yz0.b3
    public final boolean b() {
        return this.a;
    }

    @Override // yz0.b3
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
