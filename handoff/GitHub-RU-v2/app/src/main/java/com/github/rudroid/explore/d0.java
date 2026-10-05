package com.github.rudroid.explore;

import com.github.service.models.response.TrendingPeriod;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f12191r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f12192s;

    public d0(y71.j jVar, n0 n0Var) {
        this.f12191r = jVar;
        this.f12192s = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c0 c0Var;
        int i;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i10 = c0Var.f12188v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f12188v = i10 - Integer.MIN_VALUE;
                Object obj2 = c0Var.f12187u;
                b71.a aVar = b71.a.r;
                i = c0Var.f12188v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = (List) obj;
                    n0 n0Var = this.f12192s;
                    d dVar = n0Var.f12237w;
                    boolean z10 = !list.isEmpty();
                    f fVar = f.f12202s;
                    TrendingPeriod trendingPeriod = n0Var.E;
                    dVar.getClass();
                    ArrayList a10 = d.a(list, z10, fVar, trendingPeriod);
                    c0Var.f12188v = 1;
                    if (this.f12191r.c(a10, c0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        c0Var = new c0(this, cVar);
        Object obj22 = c0Var.f12187u;
        b71.a aVar2 = b71.a.r;
        i = c0Var.f12188v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class n0<T1,T2,T3,T4> {
        public n0() {
        }
    }
}
