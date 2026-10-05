package com.github.rudroid.searchandfilter.newflags;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public final je.a a;
    public final kj.j b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bm.l.values().length];
            try {
                bm.l lVar = bm.l.r;
                iArr[38] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public k(je.a aVar, kj.j jVar) {
        k71.k.g(aVar, "setDraftBannerDismissedUseCase");
        k71.k.g(jVar, "analyticsUseCase");
        this.a = aVar;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, bm.l lVar, MobileEventContext mobileEventContext, c71.c cVar) {
        l lVar2;
        int i;
        if (cVar instanceof l) {
            lVar2 = (l) cVar;
            int i2 = lVar2.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar2.y = i2 - Integer.MIN_VALUE;
                Object obj = lVar2.w;
                b71.a aVar = b71.a.r;
                i = lVar2.y;
                a0 a0Var = a0.a;
                if (i != 0) {
                    y.j(obj);
                    if (a.a[lVar.ordinal()] == 1) {
                        lVar2.u = jVar;
                        lVar2.v = mobileEventContext;
                        lVar2.y = 1;
                        je.a aVar2 = this.a;
                        aVar2.getClass();
                        Object d = aVar2.a.d(lVar2, new Long(ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli()), gi.d.l);
                        if (d != aVar) {
                            d = a0Var;
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                mobileEventContext = lVar2.v;
                jVar = lVar2.u;
                y.j(obj);
                wj.e eVar = new wj.e(MobileAppAction.PRESS, MobileAppElement.DRAFT_FILTER_ONBOARDING, mobileEventContext, MobileSubjectType.FILTER_DRAFT);
                lVar2.u = null;
                lVar2.v = null;
                lVar2.y = 2;
                return this.b.a(jVar, eVar, lVar2) != aVar ? aVar : a0Var;
            }
        }
        lVar2 = new l(this, cVar);
        Object obj2 = lVar2.w;
        b71.a aVar3 = b71.a.r;
        i = lVar2.y;
        a0 a0Var2 = a0.a;
        if (i != 0) {
        }
        wj.e eVar2 = new wj.e(MobileAppAction.PRESS, MobileAppElement.DRAFT_FILTER_ONBOARDING, mobileEventContext, MobileSubjectType.FILTER_DRAFT);
        lVar2.u = null;
        lVar2.v = null;
        lVar2.y = 2;
        if (this.b.a(jVar, eVar2, lVar2) != aVar3) {
        }
    }
}
