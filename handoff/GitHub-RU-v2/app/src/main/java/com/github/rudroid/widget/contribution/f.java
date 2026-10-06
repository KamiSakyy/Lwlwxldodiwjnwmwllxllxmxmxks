package com.github.rudroid.widget.contribution;

import android.content.Context;
import b6.v1;
import b6.x1;
import kotlin.KotlinNothingValueException;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends m71.a {
    public final l a = l.a;
    public final v1 b = v1.a;

    public final x1 B() {
        return this.b;
    }

    public final l6.g C() {
        return this.a;
    }

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
                r1.d dVar = new r1.d(new c(context, kVar, 0), true, 442666695);
                eVar.w = 1;
                l0.F(dVar, eVar);
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
    public Object k0(Object p1, Object p2, Object p3) { return null; }
}
