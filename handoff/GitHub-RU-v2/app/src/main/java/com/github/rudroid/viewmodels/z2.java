package com.github.rudroid.viewmodels;

import android.content.SharedPreferences;
import com.github.rudroid.common.e;
import java.util.Objects;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
final class z2<T> implements y71.j {
    public final /* synthetic */ u2 r;
    public final /* synthetic */ oa.j s;
    public final /* synthetic */ String t;

    public z2(u2 u2Var, oa.j jVar, String str) {
        this.r = u2Var;
        this.s = jVar;
        this.t = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(7:19|20|(3:22|(1:24)(1:26)|25)|27|(1:29)(1:34)|30|(1:32)(1:33))|12|13|14))|37|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        r2 = r9.y;
        com.github.rudroid.common.e.Companion.getClass();
        r2.f(com.github.rudroid.common.e.a.u);
        r9.w.k(r8);
        com.github.rudroid.auth.p.a(r9.F, com.github.rudroid.auth.i.A, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(w61.k kVar, a71.c cVar) {
        y2 y2Var;
        int i;
        String str;
        if (cVar instanceof y2) {
            y2Var = (y2) cVar;
            int i2 = y2Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y2Var.x = i2 - Integer.MIN_VALUE;
                Object obj = y2Var.v;
                b71.a aVar = b71.a.r;
                i = y2Var.x;
                oa.j jVar = this.s;
                u2 u2Var = this.r;
                if (i != 0) {
                    sy.y.j(obj);
                    yz0.c8 c8Var = (yz0.c8) kVar.r;
                    Set set = (Set) kVar.s;
                    Objects.toString(c8Var);
                    Objects.toString(set);
                    qe.a aVar2 = u2Var.y;
                    com.github.rudroid.common.e.Companion.getClass();
                    aVar2.f(e.a.t);
                    oa.m mVar = u2Var.w;
                    String str2 = jVar.c;
                    String str3 = c8Var.c;
                    String str4 = jVar.b;
                    androidx.compose.foundation.lazy.layout.t1 t1Var = jVar.g;
                    r71.e eVar = oa.j.p[3];
                    t1Var.getClass();
                    k71.k.g(eVar, "property");
                    String str5 = "";
                    if (!t1Var.a) {
                        String string = ((SharedPreferences) t1Var.b).getString("enterprise_version", "");
                        if (string != null) {
                            str5 = string;
                        }
                        t1Var.c = str5;
                        t1Var.d = k41.b.i(str5);
                        t1Var.a = true;
                    }
                    oa.j a = mVar.a(str2, str3, str4, (String) t1Var.c, this.t, set, c8Var.b.r, new t2(u2Var, 1));
                    String str6 = a != null ? a.a : null;
                    jVar.i(-1L);
                    dn.z zVar = u2Var.x;
                    v71.b0.z(zVar.g, (a71.h) null, (v71.a0) null, new a61.g0(zVar, (a71.c) null, 9), 3);
                    com.github.rudroid.featureflags.f fVar = u2Var.B;
                    y2Var.u = str6;
                    y2Var.x = 1;
                    if (fVar.a(jVar, new com.github.rudroid.copilot.e(17), new com.github.rudroid.copilot.e(18), y2Var) == aVar) {
                        return aVar;
                    }
                    str = str6;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = y2Var.u;
                    sy.y.j(obj);
                }
                y71.y1 y1Var = u2Var.F;
                k71.k.g(y1Var, "<this>");
                y1Var.k((Object) null, new com.github.rudroid.auth.l0(str));
                return w61.a0.a;
            }
        }
        y2Var = new y2(this, cVar);
        Object obj2 = y2Var.v;
        b71.a aVar3 = b71.a.r;
        i = y2Var.x;
        oa.j jVar2 = this.s;
        u2 u2Var2 = this.r;
        if (i != 0) {
        }
        y71.y1 y1Var2 = u2Var2.F;
        k71.k.g(y1Var2, "<this>");
        y1Var2.k((Object) null, new com.github.rudroid.auth.l0(str));
        return w61.a0.a;
    }
}
