package com.github.rudroid.settings.preferences;

import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j;
import w1.o;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ PushNotificationOptInPreference s;

    public /* synthetic */ e(PushNotificationOptInPreference pushNotificationOptInPreference, int i) {
        this.r = i;
        this.s = pushNotificationOptInPreference;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                s sVar = (s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(152424626, new e(this.s, 1), sVar), sVar, 805306368, 511);
                } else {
                    sVar.V();
                }
                break;
            default:
                s sVar2 = (s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    PushNotificationOptInPreference pushNotificationOptInPreference = this.s;
                    boolean h = sVar2.h(pushNotificationOptInPreference);
                    Object N = sVar2.N();
                    if (h || N == n.a) {
                        N = new j(17, pushNotificationOptInPreference);
                        sVar2.n0(N);
                    }
                    d.a(48, 0, sVar2, (j71.a) N, o.a);
                } else {
                    sVar2.V();
                }
                break;
        }
        return a0.a;
    }
}
