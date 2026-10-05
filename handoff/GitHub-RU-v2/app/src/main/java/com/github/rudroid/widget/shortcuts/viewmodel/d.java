package com.github.rudroid.widget.shortcuts.viewmodel;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.ArrayList;
import java.util.List;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final class d<T> implements y71.j {
    public final /* synthetic */ f r;
    public final /* synthetic */ oa.j s;

    public d(f fVar, oa.j jVar) {
        this.r = fVar;
        this.s = jVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        List list = (List) obj;
        f fVar = this.r;
        y1 y1Var = fVar.y;
        if (k71.k.b(((b) y1Var.getValue()).b, this.s)) {
            b bVar = (b) fVar.z.getValue();
            g1.a aVar = g1.Companion;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (((StoredShortcutModel) t).y != ShortcutType.DISCUSSION) {
                    arrayList.add(t);
                }
            }
            aVar.getClass();
            b a = b.a(bVar, null, null, new t1(arrayList), 0.0f, 47);
            y1Var.getClass();
            y1Var.k((Object) null, a);
        }
        return a0.a;
    }
}
