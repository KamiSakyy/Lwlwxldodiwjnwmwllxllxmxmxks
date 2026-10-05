package com.github.rudroid.settings.privacy;

import com.github.rudroid.actions.checklog.t;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj.c0;
import sy.d0;
import sy.y;
import v71.z;
import w61.a0;
import y71.n1;

@c71.e(c = "com.github.rudroid.settings.privacy.SettingsPrivacyViewModel$analyticsDisabled$1", f = "SettingsPrivacyViewModel.kt", l = {28, 41}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g extends c71.j implements j71.e {
    public final /* synthetic */ h A;
    public h v;
    public Iterator w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a71.c cVar) {
        super(2, cVar);
        this.A = hVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g(this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00cc -> B:6:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        h hVar;
        Iterator it;
        int i;
        h hVar2;
        Object obj2;
        Iterator it2;
        int i2;
        int i3;
        b71.a aVar = b71.a.r;
        int i4 = this.z;
        if (i4 == 0) {
            y.j(obj);
            hVar = this.A;
            ArrayList e = hVar.t.e();
            ArrayList arrayList = new ArrayList();
            int size = e.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj3 = e.get(i5);
                i5++;
                if (((oa.j) obj3).f(com.github.rudroid.common.a.r)) {
                    arrayList.add(obj3);
                }
            }
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i4 == 1) {
                int i6 = this.y;
                int i7 = this.x;
                it2 = this.w;
                h hVar3 = this.v;
                y.j(obj);
                i2 = i6;
                i3 = i7;
                hVar2 = hVar3;
                obj2 = obj;
                this.v = hVar2;
                this.w = it2;
                this.x = i3;
                this.y = i2;
                this.z = 2;
                if (n1.j((y71.i) obj2, this) != aVar) {
                    it = it2;
                    i = i3;
                    hVar = hVar2;
                }
                return aVar;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = this.x;
            it = this.w;
            h hVar4 = this.v;
            y.j(obj);
            i = i8;
            hVar = hVar4;
        }
        if (!it.hasNext()) {
            return a0.a;
        }
        oa.j jVar = (oa.j) it.next();
        c0 c0Var = hVar.s;
        String rawValue = MobileAppElement.SETTINGS_DISABLE_ANALYTICS.getRawValue();
        String rawValue2 = MobileAppAction.PRESS.getRawValue();
        String zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC).toString();
        k71.k.f(zonedDateTime, "toString(...)");
        List n = d0.n(new yz0.d(rawValue, rawValue2, zonedDateTime, (String) null, (String) null));
        t tVar = new t(4);
        this.v = hVar;
        this.w = it;
        this.x = i;
        this.y = 0;
        this.z = 1;
        obj2 = c0Var.a(jVar, n, tVar, this);
        if (obj2 != aVar) {
            hVar2 = hVar;
            i3 = i;
            it2 = it;
            i2 = 0;
            this.v = hVar2;
            this.w = it2;
            this.x = i3;
            this.y = i2;
            this.z = 2;
            if (n1.j((y71.i) obj2, this) != aVar) {
            }
        }
        return aVar;
    }





}
