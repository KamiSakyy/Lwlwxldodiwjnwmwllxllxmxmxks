package com.github.rudroid.uitoolkit.debug;

import a0.s0;
import androidx.compose.runtime.n1;
import c71.j;
import k71.l;
import sy.y;
import v71.b0;
import v71.z;
import w1.o;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final /* synthetic */ int a = 0;

    @c71.e(c = "com.github.rudroid.uitoolkit.debug.RecomposeHighlighterKt$recomposeModifier$2$1$1", f = "RecomposeHighlighter.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class a extends j implements j71.e {
        public int v;
        public final /* synthetic */ n1 w;
        public final /* synthetic */ Long[] x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n1 n1Var, Long[] lArr, a71.c cVar) {
            super(2, cVar);
            this.w = n1Var;
            this.x = lArr;
        }

        public final a71.c r(a71.c cVar, Object obj) {
            return new a(this.w, this.x, cVar);
        }

        public final Object s(Object obj, Object obj2) {
            return r((a71.c) obj2, (z) obj).v(a0.a);
        }

        public final Object v(Object obj) {
            b71.a aVar = b71.a.r;
            int i = this.v;
            if (i == 0) {
                y.j(obj);
                this.v = 1;
                if (b0.l(3000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.j(obj);
            }
            this.w.E(this.x[0].longValue());
            return a0.a;
        }
    }

    public static final class b extends l implements j71.c {
        public final Object k(Object obj) {
            throw s0.d(obj);
        }
    }

    static {
        w1.a.a(o.a, new f());
    }
}
