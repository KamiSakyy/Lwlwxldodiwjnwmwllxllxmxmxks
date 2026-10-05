package com.github.rudroid.widget.shortcuts.model;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import oa.j;
import w61.a0;
import y71.i;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements i {
    public final /* synthetic */ y r;
    public final /* synthetic */ j s;
    public final /* synthetic */ StoredShortcutModel t;
    public final /* synthetic */ float u;

    public e(y yVar, j jVar, StoredShortcutModel storedShortcutModel, float f) {
        this.r = yVar;
        this.s = jVar;
        this.t = storedShortcutModel;
        this.u = f;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        Object b = this.r.b(new d(jVar, this.s, this.t, this.u), cVar);
        return b == b71.a.r ? b : a0.a;
    }
}
