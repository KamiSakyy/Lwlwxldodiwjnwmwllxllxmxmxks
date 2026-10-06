package com.github.rudroid.settings.copilot.debug;

import androidx.compose.runtime.f1;
import androidx.fragment.app.l1;
import com.github.rudroid.settings.copilot.debug.CopilotPermissionsOverrideActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ CopilotPermissionsOverrideActivity s;

    public /* synthetic */ b(CopilotPermissionsOverrideActivity copilotPermissionsOverrideActivity, int i) {
        this.r = i;
        this.s = copilotPermissionsOverrideActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r4 == androidx.compose.runtime.n.a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        final CopilotPermissionsOverrideActivity copilotPermissionsOverrideActivity = this.s;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                CopilotPermissionsOverrideActivity.a aVar = CopilotPermissionsOverrideActivity.Companion;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    final f1 l = k41.b.l(copilotPermissionsOverrideActivity.J0().t, (l1) null, sVar, 7);
                    final f1 l2 = k41.b.l(copilotPermissionsOverrideActivity.J0().u, (l1) null, sVar, 7);
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-481011603, new j71.e() { // from class: com.github.rudroid.settings.copilot.debug.c
                        public final Object s(Object obj4, Object obj5) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            CopilotPermissionsOverrideActivity.a aVar2 = CopilotPermissionsOverrideActivity.Companion;
                            int i2 = 0;
                            int i3 = 1;
                            if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                w1.r a = com.github.rudroid.utilities.c0.a(ih.d.b(sVar2).b, w1.o.a);
                                CopilotPermissionsOverrideActivity copilotPermissionsOverrideActivity2 = CopilotPermissionsOverrideActivity.this;
                                com.github.rudroid.uitoolkit.utils.z.a(a, r1.i.d(544513529, new b(copilotPermissionsOverrideActivity2, i3), sVar2), null, null, null, 0, 0L, 0L, r1.i.d(621419631, new d(l, l2, copilotPermissionsOverrideActivity2, i2), sVar2), sVar2, 100663344, 252);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), sVar, 805306368, 511);
                    break;
                }
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                CopilotPermissionsOverrideActivity.a aVar2 = CopilotPermissionsOverrideActivity.Companion;
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    boolean h = sVar2.h(copilotPermissionsOverrideActivity);
                    Object N = sVar2.N();
                    if (!h) {
                        obj3 = N;
                        break;
                    }
                    com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j jVar = new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(15, copilotPermissionsOverrideActivity);
                    sVar2.n0(jVar);
                    obj3 = jVar;
                    qg.p.c(null, "Copilot Permission Overrides", null, 0L, (j71.a) obj3, 0, 0.0f, 0.0f, 0, 0, null, sVar2, 48, 0, 2029);
                    break;
                }
        }
        return a0Var;
    }
    public Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object w(Object p1, Object p2) { return null; }
    public Object z(Object p1, Object p2, Object p3, Object p4) { return null; }
}
