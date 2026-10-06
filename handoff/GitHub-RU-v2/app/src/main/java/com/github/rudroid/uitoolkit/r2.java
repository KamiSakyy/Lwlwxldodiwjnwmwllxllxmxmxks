package com.github.rudroid.uitoolkit;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 {
    public static final void a(List list, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        k71.k.g(list, "simpleMetadataItems");
        sVar.e0(-480386881);
        int i2 = (sVar.h(list) ? 4 : 2) | i;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w0.a(null, null, (p2) it.next(), sVar, 0, 3);
            }
            sVar2 = sVar;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new q2(list, i, 0);
        }
    }
    public Object getValue() { return null; }
}
