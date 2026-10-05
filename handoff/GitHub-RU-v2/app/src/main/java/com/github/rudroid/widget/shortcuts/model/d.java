package com.github.rudroid.widget.shortcuts.model;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import java.util.ArrayList;
import java.util.Iterator;
import sy.y;
import w61.a0;
import x61.n;
import y71.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d<T> implements j {
    public final /* synthetic */ j r;
    public final /* synthetic */ oa.j s;
    public final /* synthetic */ StoredShortcutModel t;
    public final /* synthetic */ float u;

    public d(j jVar, oa.j jVar2, StoredShortcutModel storedShortcutModel, float f) {
        this.r = jVar;
        this.s = jVar2;
        this.t = storedShortcutModel;
        this.u = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c cVar2;
        int i;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.v = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.v;
                if (i != 0) {
                    y.j(obj2);
                    ?? r8 = ((xz0.g) obj).a;
                    ArrayList arrayList = new ArrayList(n.F((Iterable) r8, 10));
                    Iterator it = r8.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new a((xz0.e) it.next()));
                    }
                    g1.a aVar2 = g1.Companion;
                    h hVar = new h(this.s, this.t, arrayList, this.u);
                    aVar2.getClass();
                    t1 t1Var = new t1(hVar);
                    cVar2.v = 1;
                    if (this.r.c(t1Var, cVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj22 = cVar2.u;
        b71.a aVar3 = b71.a.r;
        i = cVar2.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
