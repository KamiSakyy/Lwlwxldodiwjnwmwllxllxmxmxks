package com.github.rudroid.settings.copilot;

import com.github.rudroid.utilities.ui.g1;
import java.util.Iterator;
import java.util.List;
import xn.e1;
import xn.g4;
import y71.y1;

@c71.e(c = "com.github.rudroid.settings.copilot.CopilotChatSettingsViewModel$copilotChatSettingsUiModel$1", f = "CopilotChatSettingsViewModel.kt", l = {80}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.i {
    public int A;
    public /* synthetic */ com.github.rudroid.copilot.preferences.f B;
    public /* synthetic */ g4 C;
    public /* synthetic */ eg.a D;
    public /* synthetic */ g1 E;
    public /* synthetic */ List F;
    public final /* synthetic */ o G;
    public e1 v;
    public List w;
    public int x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, a71.c cVar) {
        super(6, cVar);
        this.G = oVar;
    }

    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        p pVar = new p(this.G, (a71.c) obj6);
        pVar.B = (com.github.rudroid.copilot.preferences.f) obj;
        pVar.C = (g4) obj2;
        pVar.D = (eg.a) obj3;
        pVar.E = (g1) obj4;
        pVar.F = (List) obj5;
        return pVar.v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0118, code lost:
    
        r2 = r13;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0116, code lost:
    
        if (r3 > sy.q.m(r2.a)) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        e1 e1Var;
        List list;
        int i;
        boolean z;
        boolean z2;
        Object c;
        Integer valueOf;
        com.github.rudroid.copilot.preferences.f fVar = this.B;
        g4 g4Var = this.C;
        eg.a aVar = this.D;
        g1 g1Var = this.E;
        List list2 = this.F;
        b71.a aVar2 = b71.a.r;
        int i2 = this.A;
        if (i2 == 0) {
            sy.y.j(obj);
            e1Var = g4Var.a;
            list = g4Var.f;
            i = (g4Var.d && e1Var == e1.s) ? 1 : 0;
            o oVar = this.G;
            y1 y1Var = oVar.B;
            z = !g4Var.b && (((g4) y1Var.getValue()).a == e1.x || ((g4) y1Var.getValue()).a == e1.y);
            z2 = fVar.b;
            com.github.rudroid.activities.util.c cVar = oVar.y;
            this.B = null;
            this.C = g4Var;
            this.D = aVar;
            this.E = g1Var;
            this.F = list2;
            this.v = e1Var;
            this.w = list;
            this.x = i;
            this.y = z;
            this.z = z2;
            this.A = 1;
            cVar.getClass();
            c = com.github.rudroid.activities.util.a.c(cVar, this);
            if (c == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.z;
            boolean z3 = this.y;
            i = this.x;
            list = this.w;
            e1Var = this.v;
            sy.y.j(obj);
            c = obj;
            z = z3;
        }
        e1 e1Var2 = e1Var;
        String str = ((oa.j) c).a;
        int i3 = i;
        List list3 = list;
        sz0.b bVar = g4Var.e;
        List list4 = g4Var.f;
        k71.k.g(list2, "activePlayStoreSubscriptions");
        sz0.b bVar2 = g4Var.e;
        boolean z4 = (bVar2 == null || bVar2 == sz0.b.s) ? false : true;
        if (!list4.isEmpty() && !z4) {
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                valueOf = Integer.valueOf(sy.q.m((e1) it.next()));
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(sy.q.m((e1) it.next()));
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            } else {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            if (!list4.isEmpty()) {
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (sy.q.m((e1) it2.next()) > intValue) {
                        break;
                    }
                }
            }
        }
        int i4 = i3;
        boolean z5 = false;
        return new eg.c(g1Var, e1Var2, list3, i4 != 0, z, z2, str, bVar, aVar, z5);
    }
}
