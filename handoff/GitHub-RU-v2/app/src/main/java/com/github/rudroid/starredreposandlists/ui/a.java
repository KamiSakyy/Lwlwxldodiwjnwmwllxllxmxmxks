package com.github.rudroid.starredreposandlists.ui;

import m0.s;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.starredreposandlists.ui.StarredRepositoriesAndListsScreenKt$StarredRepositoriesAndListsScreen$1$1", f = "StarredRepositoriesAndListsScreen.kt", l = {49}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s sVar, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a(this.w, cVar);
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
            if (s.j(this.w, 0, this) == aVar) {
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
}
