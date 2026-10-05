package com.github.rudroid.widget.shortcuts;

import android.content.Context;
import com.github.rudroid.widget.shortcuts.g;
import kotlin.KotlinNothingValueException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends m71.a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(Context context, z5.k kVar, c71.c cVar) {
        e eVar;
        int i;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i2 = eVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.w = i2 - Integer.MIN_VALUE;
                Object obj = eVar.u;
                b71.a aVar = b71.a.r;
                i = eVar.w;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw new KotlinNothingValueException();
                }
                sy.y.j(obj);
                g.Companion.getClass();
                k71.k.g(context, "context");
                r1.d dVar = new r1.d(new com.github.rudroid.profile.status.ui.x(((g.b) k41.b.v(g.b.class, context.getApplicationContext())).a(), kVar, context, 22), true, 1361962442);
                eVar.w = 1;
                v8.l0.F(dVar, eVar);
                return;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.u;
        b71.a aVar2 = b71.a.r;
        i = eVar.w;
        if (i == 0) {
        }
    }
}
