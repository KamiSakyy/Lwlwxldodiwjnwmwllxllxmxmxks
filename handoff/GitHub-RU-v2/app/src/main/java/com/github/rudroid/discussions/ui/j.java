package com.github.rudroid.discussions.ui;

import com.github.rudroid.activities.h0;
import f1.ca;
import f1.v9;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.discussions.ui.ComposeCommentContentKt$ComposeCommentBottomSheetContent$2$1", f = "ComposeCommentContent.kt", l = {76}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class j extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f11917v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ca f11918w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h0 f11919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ca caVar, h0 h0Var, a71.c cVar) {
        super(2, cVar);
        this.f11918w = caVar;
        this.f11919x = h0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j(this.f11918w, this.f11919x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f11917v;
        if (i == 0) {
            y.j(obj);
            String str = this.f11919x.f5819a;
            v9 v9Var = v9.f23929r;
            this.f11917v = 1;
            if (ca.c(this.f11918w, str, null, v9Var, this, 4) == aVar) {
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
