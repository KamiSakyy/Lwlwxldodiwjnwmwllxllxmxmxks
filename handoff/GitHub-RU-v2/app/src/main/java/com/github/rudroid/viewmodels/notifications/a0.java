package com.github.rudroid.viewmodels.notifications;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileSubjectType;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$loadNextPage$1", f = "NotificationsViewModel.kt", l = {386, 399}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(s sVar, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (r11.a(r1, r3, r10) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r11.b(r3, r10) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        s sVar = this.w;
        com.github.rudroid.activities.util.c cVar = sVar.N;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            y71.y a = sVar.z.a(cVar.d(), sVar.l0.b, sVar.V, new o(sVar, 9));
            z zVar = new z(sVar);
            this.v = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        kj.j jVar = sVar.O;
        oa.j d = cVar.d();
        MobileAppElement mobileAppElement = MobileAppElement.NOTIFICATION_LIST;
        wj.e eVar = new wj.e(MobileAppAction.GESTURE, mobileAppElement, s.R(sVar), MobileSubjectType.NOTIFICATIONS);
        this.v = 2;
    }
}
