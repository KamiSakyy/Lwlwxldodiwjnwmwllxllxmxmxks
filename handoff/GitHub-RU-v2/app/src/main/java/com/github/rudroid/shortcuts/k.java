package com.github.rudroid.shortcuts;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import y71.y1;

@c71.e(c = "com.github.rudroid.shortcuts.ConfigureShortcutViewModel$update$1", f = "ConfigureShortcutViewModel.kt", l = {213, 216}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public StoredShortcutModel v;
    public int w;
    public final /* synthetic */ wm.b x;
    public final /* synthetic */ e y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(wm.b bVar, e eVar, boolean z, String str, a71.c cVar) {
        super(2, cVar);
        this.x = bVar;
        this.y = eVar;
        this.z = z;
        this.A = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k(this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r2 == r3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        StoredShortcutModel storedShortcutModel;
        Object a;
        e eVar = this.y;
        y1 y1Var = eVar.B;
        b71.a aVar = b71.a.r;
        int i = this.w;
        w61.a0 a0Var = w61.a0.a;
        if (i == 0) {
            sy.y.j(obj);
            wm.b bVar = this.x;
            storedShortcutModel = new StoredShortcutModel(bVar.f(), bVar.getIcon(), bVar.i(), bVar.K(), this.A, bVar.P(), bVar.getName(), bVar.g());
            g1.Companion.getClass();
            com.github.rudroid.utilities.ui.r0 r0Var = new com.github.rudroid.utilities.ui.r0(storedShortcutModel);
            y1Var.getClass();
            y1Var.k((Object) null, r0Var);
            if (!this.z) {
                t1 t1Var = new t1(storedShortcutModel);
                y1Var.getClass();
                y1Var.k((Object) null, t1Var);
                return a0Var;
            }
            tm.m mVar = eVar.t;
            oa.j d = eVar.v.d();
            com.github.rudroid.repositories.repositoryownerrepositories.d dVar = new com.github.rudroid.repositories.repositoryownerrepositories.d(10, eVar, storedShortcutModel);
            this.v = storedShortcutModel;
            this.w = 1;
            a = mVar.a(d, storedShortcutModel, dVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return a0Var;
            }
            StoredShortcutModel storedShortcutModel2 = this.v;
            sy.y.j(obj);
            storedShortcutModel = storedShortcutModel2;
            a = obj;
        }
        j jVar = new j(eVar, storedShortcutModel);
        this.v = null;
        this.w = 2;
        return ((y71.i) a).b(jVar, this) == aVar ? aVar : a0Var;
    }
}
