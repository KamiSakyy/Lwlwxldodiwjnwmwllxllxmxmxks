package com.github.rudroid.repositorycreation.templaterepository;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.service.models.response.SimpleRepository;

@c71.e(c = "com.github.rudroid.repositorycreation.templaterepository.TemplateRepositoryPickerViewModel$uiModel$1", f = "TemplateRepositoryPickerViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class h0 extends c71.j implements j71.g {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ g1 f20455v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f20456w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ SimpleRepository f20457x;

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        h0 h0Var = new h0(4, (a71.c) obj4);
        h0Var.f20455v = (g1) obj;
        h0Var.f20456w = (String) obj2;
        h0Var.f20457x = (SimpleRepository) obj3;
        return h0Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        g1 g1Var = this.f20455v;
        String str = this.f20456w;
        SimpleRepository simpleRepository = this.f20457x;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return new s(h1.h(g1Var, new u(2, simpleRepository)), str, simpleRepository);
    }
}
