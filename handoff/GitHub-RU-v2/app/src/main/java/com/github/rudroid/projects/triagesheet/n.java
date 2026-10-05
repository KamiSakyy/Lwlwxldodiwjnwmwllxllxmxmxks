package com.github.rudroid.projects.triagesheet;

import java.util.List;

@c71.e(c = "com.github.rudroid.projects.triagesheet.SelectorHandler$combineSelectedProjectsAndSelectableIntoModel$1", f = "SelectorHandler.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class n extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ fl.f f18063v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f18064w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f18065x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, a71.c cVar) {
        super(3, cVar);
        this.f18065x = pVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        n nVar = new n(this.f18065x, (a71.c) obj3);
        nVar.f18063v = (fl.f) obj;
        nVar.f18064w = (List) obj2;
        return nVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        q qVar;
        List list;
        fl.f fVar = this.f18063v;
        List list2 = this.f18064w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        k71.k.g(fVar, "<this>");
        fl.g gVar = fVar.a;
        Object obj2 = fVar.b;
        if (obj2 != null) {
            List list3 = (List) fVar.b;
            if (list3 == null || (list = (List) this.f18065x.f18071a.s(list3, list2)) == null) {
                list = x61.r.r;
            }
            qVar = new q(list2, list);
        } else {
            qVar = null;
        }
        return new fl.f(gVar, qVar, fVar.c);
    }
}
