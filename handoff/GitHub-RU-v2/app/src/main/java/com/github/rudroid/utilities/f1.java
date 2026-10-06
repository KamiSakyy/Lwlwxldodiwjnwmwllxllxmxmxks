package com.github.rudroid.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    public static final a Companion = new a();
    public sc.c1 a;

    public static final class a {
    }

    public f1(sc.c1 c1Var) {
        k71.k.g(c1Var, "imageLoaderForUser");
        this.a = c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, Context context, String str, int i, c71.c cVar) {
        g1 g1Var;
        int i2;
        Drawable a2;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i3 = g1Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g1Var.w = i3 - Integer.MIN_VALUE;
                Object obj = g1Var.u;
                b71.a aVar = b71.a.r;
                i2 = g1Var.w;
                if (i2 != 0) {
                    sy.y.j(obj);
                    if (jVar == null) {
                        return null;
                    }
                    r9.i iVar = new r9.i(context);
                    iVar.c = str;
                    iVar.d(i);
                    iVar.h = sy.f0.u(x61.l.g0(new u9.d[]{new u9.a()}));
                    g9.h hVar = (g9.h) this.a.a(jVar);
                    r9.k a3 = iVar.a();
                    g1Var.w = 1;
                    obj = hVar.c(a3, g1Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                a2 = ((r9.l) obj).a();
                if (a2 == null) {
                    return aa1.b.R(a2, 0, 0, 7);
                }
                return null;
            }
        }
        g1Var = new g1(this, cVar);
        Object obj2 = g1Var.u;
        b71.a aVar2 = b71.a.r;
        i2 = g1Var.w;
        if (i2 != 0) {
        }
        a2 = ((r9.l) obj2).a();
        if (a2 == null) {
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class o0 {
        public o0() {
        }
    }
}
