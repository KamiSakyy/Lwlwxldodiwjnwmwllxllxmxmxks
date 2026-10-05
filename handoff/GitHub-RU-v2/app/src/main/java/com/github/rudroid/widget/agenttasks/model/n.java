package com.github.rudroid.widget.agenttasks.model;

import com.github.domain.database.GitHubDatabase;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import s0.z0;
import w61.a0;
import yz0.d3;
import yz0.j3;

/* loaded from: /home/user/work/p/classes3.dex */
final class n<T> implements y71.j {
    public final /* synthetic */ c r;
    public final /* synthetic */ oa.j s;

    public n(c cVar, oa.j jVar) {
        this.r = cVar;
        this.s = jVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object] */
    public final Object c(Object obj, a71.c cVar) {
        ?? r1 = ((xz0.g) obj).a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : r1) {
            if (obj2 instanceof j3) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            j3 j3Var = (j3) obj3;
            k71.k.g(j3Var, "pullRequest");
            String str = j3Var.a;
            String str2 = j3Var.b;
            String rawValue = j3Var.q.getRawValue();
            boolean z = j3Var.p;
            boolean z2 = j3Var.t;
            String str3 = j3Var.k;
            d3 d3Var = j3Var.f;
            String str4 = d3Var.a;
            String str5 = d3Var.b;
            int i2 = j3Var.l;
            String zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC).toString();
            k71.k.f(zonedDateTime, "toString(...)");
            arrayList2.add(new sj.b(i2, str, str2, rawValue, str3, str4, str5, zonedDateTime, z, z2));
        }
        sj.d t = ((GitHubDatabase) this.r.d.a(this.s)).t();
        Object M = m71.a.M(cVar, t.a, false, true, new z0(5, t, arrayList2));
        b71.a aVar = b71.a.r;
        a0 a0Var = a0.a;
        if (M != aVar) {
            M = a0Var;
        }
        return M == aVar ? M : a0Var;
    }
}
