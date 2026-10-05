package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import com.github.rudroid.widget.agenttasks.e;
import kotlin.KotlinNothingValueException;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends m71.a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(Context context, z5.k kVar, c71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.w = i2 - Integer.MIN_VALUE;
                Object obj = bVar.u;
                b71.a aVar = b71.a.r;
                i = bVar.w;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw new KotlinNothingValueException();
                }
                sy.y.j(obj);
                e.Companion.getClass();
                r1.d dVar = new r1.d(new a(e.b.a(context), kVar, context, 0), true, 438460590);
                bVar.w = 1;
                l0.F(dVar, bVar);
                return;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.w;
        if (i == 0) {
        }
    }


}
