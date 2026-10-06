package com.github.rudroid.uitoolkit.snackbar;

import androidx.compose.runtime.f1;
import f1.ca;
import f1.la;
import f1.v9;
import f1.z9;
import kotlin.NoWhenBranchMatchedException;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.uitoolkit.snackbar.SnackBarHandlerKt$SnackBarHandler$4$1$1", f = "SnackBarHandler.kt", l = {37}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c extends c71.j implements j71.e {
    public final /* synthetic */ f1 A;
    public final /* synthetic */ f1 B;
    public final /* synthetic */ f1 C;
    public int v;
    public final /* synthetic */ ca w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ f1 y;
    public final /* synthetic */ f1 z;

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[la.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                la laVar = la.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ca caVar, Object obj, f1 f1Var, f1 f1Var2, f1 f1Var3, f1 f1Var4, f1 f1Var5, a71.c cVar) {
        super(2, cVar);
        this.w = caVar;
        this.x = obj;
        this.y = f1Var;
        this.z = f1Var2;
        this.A = f1Var3;
        this.B = f1Var4;
        this.C = f1Var5;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c(this.w, this.x, this.y, this.z, this.A, this.B, this.C, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        c cVar;
        b71.a aVar = b71.a.r;
        int i = this.v;
        a0 a0Var = a0.a;
        f1 f1Var = this.z;
        Object obj2 = this.x;
        if (i == 0) {
            y.j(obj);
            z9 a2 = this.w.a();
            if (a2 != null) {
                a2.a();
            }
            String str = (String) ((j71.c) this.y.getValue()).k(obj2);
            if (str == null) {
                ((j71.c) f1Var.getValue()).k(obj2);
                return a0Var;
            }
            String str2 = (String) ((j71.c) this.A.getValue()).k(obj2);
            v9 v9Var = str2 != null ? v9.s : v9.r;
            this.v = 1;
            cVar = this;
            obj = ca.c(this.w, str, str2, v9Var, cVar, 4);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
            cVar = this;
        }
        int ordinal = ((la) obj).ordinal();
        if (ordinal == 0) {
            ((j71.c) cVar.B.getValue()).k(obj2);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ((j71.c) cVar.C.getValue()).k(obj2);
        }
        ((j71.c) f1Var.getValue()).k(obj2);
        return a0Var;
    }
    public Object b = null;
    public Object v(Object) { return null; }
}
