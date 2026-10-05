package com.github.rudroid.utilities.ui.emojipicker;

import androidx.compose.runtime.f1;
import com.github.rudroid.y;
import java.util.Iterator;
import java.util.Map;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
final class h<T> implements y71.j {
    public final /* synthetic */ f1 r;

    public h(f1 f1Var) {
        this.r = f1Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        T t;
        int intValue = ((Number) obj).intValue();
        Iterator<T> it = b.b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((q71.g) ((Map.Entry) t).getValue()).a(intValue)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t;
        y yVar = entry != null ? (y) entry.getKey() : null;
        if (yVar != null) {
            f1 f1Var = this.r;
            if (((y) f1Var.getValue()) != yVar) {
                f1Var.setValue(yVar);
            }
        }
        return a0.a;
    }
}
