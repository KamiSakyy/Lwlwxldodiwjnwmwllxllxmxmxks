package com.github.rudroid.workers;

import java.util.Iterator;
import java.util.List;
import oa.j;

@c71.e(c = "com.github.rudroid.workers.AnalyticsWorker", f = "AnalyticsWorker.kt", l = {70, 74, 76, 83}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a extends c71.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ AnalyticsWorker B;
    public int C;
    public Iterator u;
    public j v;
    public wj.c w;
    public List x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AnalyticsWorker analyticsWorker, c71.c cVar) {
        super(cVar);
        this.B = analyticsWorker;
    }

    public final Object v(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(this);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }
}
