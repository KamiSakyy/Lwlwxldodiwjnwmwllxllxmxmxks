package com.github.rudroid.viewmodels.tasklist;

import java.util.LinkedHashMap;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final class d<T> implements y71.j {
    public final /* synthetic */ n r;
    public final /* synthetic */ String s;

    public d(n nVar, String str) {
        this.r = nVar;
        this.s = str;
    }

    public final Object c(Object obj, a71.c cVar) {
        n nVar = this.r;
        LinkedHashMap linkedHashMap = nVar.z;
        String str = this.s;
        linkedHashMap.remove(str);
        y1 y1Var = nVar.y;
        fl.e eVar = fl.f.Companion;
        b bVar = new b((jk.g) obj, str);
        eVar.getClass();
        fl.f c = fl.e.c(bVar);
        y1Var.getClass();
        y1Var.k((Object) null, c);
        return a0.a;
    }
}
