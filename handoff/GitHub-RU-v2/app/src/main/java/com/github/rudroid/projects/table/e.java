package com.github.rudroid.projects.table;

import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
class e implements j71.e {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l01.l0 f17869r;

    public e(l01.l0 l0Var) {
        this.f17869r = l0Var;
    }

    public final Object s(Object obj, Object obj2) {
        l01.y yVar = (l01.y) obj;
        String str = yVar != null ? yVar.r : null;
        l01.y yVar2 = (l01.y) obj2;
        String str2 = yVar2 != null ? yVar2.r : null;
        l01.l0 l0Var = this.f17869r;
        Set set = l0Var.x;
        k71.k.d(str != null ? new l01.y(str) : null);
        int Y = x61.m.Y(set, str);
        Set set2 = l0Var.x;
        k71.k.d(str2 != null ? new l01.y(str2) : null);
        return Integer.valueOf(k71.k.h(Y, x61.m.Y(set2, str2)));
    }
}
