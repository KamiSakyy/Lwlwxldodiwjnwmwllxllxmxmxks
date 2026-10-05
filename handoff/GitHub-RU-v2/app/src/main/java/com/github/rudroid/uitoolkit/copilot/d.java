package com.github.rudroid.uitoolkit.copilot;

import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.Iterator;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ j71.c t;

    public /* synthetic */ d(List list, j71.c cVar, int i) {
        this.r = i;
        this.s = list;
        this.t = cVar;
    }

    public final Object k(Object obj) {
        Object obj2;
        switch (this.r) {
            case 0:
                m0.f fVar = (m0.f) obj;
                k71.k.g(fVar, "$this$FadingEdgeHorizontalBar");
                List list = this.s;
                fVar.r(list.size(), (j71.c) null, new j(list), new r1.d(new k(list, this.t), true, 802480018));
                break;
            default:
                String str = (String) obj;
                k71.k.g(str, "typeId");
                Iterator it = this.s.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (k71.k.b(((ShortcutType) obj2).name(), str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ShortcutType shortcutType = (ShortcutType) obj2;
                if (shortcutType != null) {
                    this.t.k(shortcutType);
                }
                break;
        }
        return a0.a;
    }
}
