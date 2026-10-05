package com.github.rudroid.uitoolkit.markdown.components;

import androidx.compose.runtime.f1;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class w implements j71.c {
    public final /* synthetic */ g3.g r;
    public final /* synthetic */ f1 s;
    public final /* synthetic */ f1 t;

    public /* synthetic */ w(g3.g gVar, f1 f1Var, f1 f1Var2) {
        this.r = gVar;
        this.s = f1Var;
        this.t = f1Var2;
    }

    public final Object k(Object obj) {
        Object obj2;
        int intValue = ((Integer) obj).intValue();
        Iterator it = this.r.b(intValue, "MARKDOWN_INLINE_LINK", intValue).iterator();
        if (it.hasNext()) {
            obj2 = it.next();
            this.s.setValue((String) ((g3.e) obj2).a);
            this.t.setValue(Boolean.TRUE);
        } else {
            obj2 = null;
        }
        return w61.a0.a;
    }
}
