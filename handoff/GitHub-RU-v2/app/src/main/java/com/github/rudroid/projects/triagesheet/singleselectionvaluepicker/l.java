package com.github.rudroid.projects.triagesheet.singleselectionvaluepicker;

import l01.z;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.ProjectSingleSelectFieldValuePickerViewModel$setNewValueSelected$1", f = "ProjectSingleSelectFieldValuePickerViewModel.kt", l = {17}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class l extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f18149v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f18150w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f18151x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, z zVar, a71.c cVar) {
        super(2, cVar);
        this.f18150w = mVar;
        this.f18151x = zVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l(this.f18150w, this.f18151x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f18149v;
        if (i == 0) {
            y.j(obj);
            x71.h hVar = this.f18150w.f18152s;
            this.f18149v = 1;
            if (hVar.l(this, this.f18151x) == aVar) {
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
