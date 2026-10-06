package com.github.rudroid.widget.pullrequests;

import android.content.Context;
import b6.v1;
import b6.x1;
import kotlin.KotlinNothingValueException;
import sy.y;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends m71.a {
    public final a a = a.a;
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
                int i3 = 1;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    throw new KotlinNothingValueException();
                }
                y.j(obj);
                r1.d dVar = new r1.d(new com.github.rudroid.widget.contribution.c(context, kVar, i3), true, 2087929038);
                bVar.w = 1;
                l0.F(dVar, bVar);
                return;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.w;
        int i32 = 1;
        if (i == 0) {
        }
    }
    public Object v(Object p1) { return null; }
    public Object v(Object) { return null; }
}
