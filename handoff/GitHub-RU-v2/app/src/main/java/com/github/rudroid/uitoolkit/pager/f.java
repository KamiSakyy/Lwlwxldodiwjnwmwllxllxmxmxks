package com.github.rudroid.uitoolkit.pager;

import c71.j;
import o0.x;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.uitoolkit.pager.PrimaryHorizontalPagerIndicatorKt$PrimaryHorizontalPagerIndicator$1$1$1", f = "PrimaryHorizontalPagerIndicator.kt", l = {66}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends j implements j71.e {
    public int v;
    public final /* synthetic */ x w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, a71.c cVar, x xVar) {
        super(2, cVar);
        this.w = xVar;
        this.x = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f(this.x, cVar, this.w);
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
            if (x.t(this.w, this.x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0.a;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x<T1,T2,T3,T4> {
        public x() {
        }
    }
}
