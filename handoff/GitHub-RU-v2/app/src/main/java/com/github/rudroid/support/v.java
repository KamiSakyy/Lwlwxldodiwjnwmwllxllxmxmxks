package com.github.rudroid.support;

import android.content.ContentResolver;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.r0;
import com.github.rudroid.utilities.ui.t1;
import com.github.service.models.ApiRequestStatus;
import in.a1;
import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.support.SupportViewModel$submit$1", f = "SupportViewModel.kt", l = {123}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s w;
    public final /* synthetic */ ContentResolver x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar, ContentResolver contentResolver, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
        this.x = contentResolver;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        s sVar = this.w;
        y1 y1Var = sVar.u;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            g1.a aVar2 = g1.Companion;
            h hVar = (h) ((g1) y1Var.getValue()).getData();
            if (hVar == null) {
                h.Companion.getClass();
                hVar = h.f;
            }
            aVar2.getClass();
            r0 r0Var = new r0(hVar);
            y1Var.getClass();
            y1Var.k((Object) null, r0Var);
            a1 a1Var = sVar.A;
            if (a1Var == null) {
                k71.k.m("supportClient");
                throw null;
            }
            String str = sVar.x;
            String str2 = sVar.z;
            String str3 = sVar.B;
            h hVar2 = (h) ((g1) y1Var.getValue()).getData();
            List list = hVar2 != null ? hVar2.a : x61.r.r;
            u uVar = new u(0, sVar);
            this.v = 1;
            obj = a1Var.c(str, str2, str3, this.x, list, uVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        if (((ApiRequestStatus) obj) == ApiRequestStatus.SUCCESS) {
            g1.a aVar3 = g1.Companion;
            h hVar3 = (h) ((g1) y1Var.getValue()).getData();
            if (hVar3 == null) {
                h.Companion.getClass();
                hVar3 = h.f;
            }
            aVar3.getClass();
            t1 t1Var = new t1(hVar3);
            y1Var.getClass();
            y1Var.k((Object) null, t1Var);
        }
        return w61.a0.a;
    }
}
