package com.github.rudroid.settings.codeoptions;

import androidx.compose.runtime.f1;
import androidx.lifecycle.d1;
import com.github.rudroid.settings.codeoptions.CodeOptionsActivity;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ CodeOptionsActivity s;

    public /* synthetic */ h(CodeOptionsActivity codeOptionsActivity, int i) {
        this.r = i;
        this.s = codeOptionsActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r3 == androidx.compose.runtime.n.a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        final CodeOptionsActivity codeOptionsActivity = this.s;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                s5.e eVar = (s5.e) obj2;
                CodeOptionsActivity.a aVar = CodeOptionsActivity.Companion;
                k71.k.g(eVar, "value");
                a0 a0Var2 = (a0) codeOptionsActivity.u0.getValue();
                v71.b0.z(d1.k(a0Var2), (a71.h) null, (v71.a0) null, new z(a0Var2, bool, eVar, null), 3);
                return a0Var;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                s5.e eVar2 = (s5.e) obj2;
                CodeOptionsActivity.a aVar2 = CodeOptionsActivity.Companion;
                k71.k.g(eVar2, "value");
                a0 a0Var3 = (a0) codeOptionsActivity.u0.getValue();
                v71.b0.z(d1.k(a0Var3), (a71.h) null, (v71.a0) null, new z(a0Var3, num, eVar2, null), 3);
                return a0Var;
            case 2:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                CodeOptionsActivity.a aVar3 = CodeOptionsActivity.Companion;
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    f1 n = androidx.compose.runtime.t.n(((a0) codeOptionsActivity.u0.getValue()).u, sVar);
                    com.github.rudroid.html.a aVar4 = codeOptionsActivity.t0;
                    if (aVar4 == null) {
                        k71.k.m("tagHandler");
                        throw null;
                    }
                    aVar4.c = ((f) n.getValue()).f();
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(632143421, new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.r(28, codeOptionsActivity, n), sVar), sVar, 805306368, 511);
                } else {
                    sVar.V();
                }
                return a0Var;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                CodeOptionsActivity.a aVar5 = CodeOptionsActivity.Companion;
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String p0 = i4.p0(2131954517, sVar2);
                    boolean h = sVar2.h(codeOptionsActivity);
                    Object N = sVar2.N();
                    if (!h) {
                        obj3 = N;
                        break;
                    }
                    j71.a aVar6 = new j71.a() { // from class: com.github.rudroid.settings.codeoptions.i
                        public final Object a() {
                            CodeOptionsActivity.a aVar7 = CodeOptionsActivity.Companion;
                            CodeOptionsActivity.this.finish();
                            return w61.a0.a;
                        }
                    };
                    sVar2.n0(aVar6);
                    obj3 = aVar6;
                    qg.p.c(null, p0, null, 0L, (j71.a) obj3, 0, 0.0f, 0.0f, 0, 0, null, sVar2, 0, 0, 2029);
                } else {
                    sVar2.V();
                }
                return a0Var;
        }
    }
}
