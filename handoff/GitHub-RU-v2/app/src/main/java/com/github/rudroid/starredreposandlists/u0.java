package com.github.rudroid.starredreposandlists;

import android.view.MotionEvent;
import com.github.rudroid.common.f;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import le.p;
import yz0.f5;
import yz0.g5;
import yz0.h5;
import yz0.i5;
import yz0.j5;
import yz0.n5;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class u0 implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ u0(int i) {
        this.r = i;
    }

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        switch (i) {
            case 0:
                d3.c0 c0Var = (d3.c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                d3.z.b(c0Var);
                return a0Var;
            case 1:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 2:
                d3.c0 c0Var2 = (d3.c0) obj;
                k71.k.g(c0Var2, "$this$semantics");
                d3.z.b(c0Var2);
                return a0Var;
            case 3:
                n5 n5Var = (n5) obj;
                k71.k.g(n5Var, "it");
                ArrayList arrayList = new ArrayList();
                List w = n5Var.w();
                ArrayList arrayList2 = new ArrayList(x61.n.F(w, 10));
                Iterator it = w.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new p.c((j5) it.next(), n5Var.x()));
                }
                arrayList.addAll(arrayList2);
                if (n5Var.D()) {
                    arrayList.add(new p.c(f5.s, n5Var.x()));
                }
                if (!arrayList.isEmpty() && !(x61.m.e0(arrayList) instanceof p.b)) {
                    arrayList.add(new p.b("TemplateDivider"));
                }
                List I = n5Var.I();
                ArrayList arrayList3 = new ArrayList(x61.n.F(I, 10));
                Iterator it2 = I.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new p.c((g5) it2.next(), n5Var.x()));
                }
                arrayList.addAll(arrayList3);
                if (!arrayList.isEmpty() && !(x61.m.e0(arrayList) instanceof p.b)) {
                    arrayList.add(new p.b("TemplateDivider1"));
                }
                List n = n5Var.n();
                ArrayList arrayList4 = new ArrayList(x61.n.F(n, 10));
                Iterator it3 = n.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(new p.c((h5) it3.next(), n5Var.x()));
                }
                arrayList.addAll(arrayList4);
                if (!arrayList.isEmpty() && !(x61.m.e0(arrayList) instanceof p.b)) {
                    arrayList.add(new p.b("TemplateDivider1"));
                }
                i5 F = n5Var.F();
                if (n5Var.R() && F != null) {
                    arrayList.add(new p.c(F, n5Var.x()));
                }
                if (!arrayList.isEmpty() && !(x61.m.e0(arrayList) instanceof p.b)) {
                    arrayList.add(new p.b("TemplateDivider2"));
                }
                return new com.github.rudroid.templates.u(n5Var.x(), arrayList);
            case 4:
                k71.k.g((String) obj, "it");
                return a0Var;
            case 5:
                k71.k.g((String) obj, "it");
                return a0Var;
            case 6:
                d3.c0 c0Var3 = (d3.c0) obj;
                k71.k.g(c0Var3, "$this$semantics");
                d3.z.g(c0Var3, "");
                return a0Var;
            case 7:
                w1.r rVar = (w1.r) obj;
                k71.k.g(rVar, "$this$applyIf");
                return d3.q.b(rVar, false, new u0(8));
            case 8:
                d3.c0 c0Var4 = (d3.c0) obj;
                k71.k.g(c0Var4, "$this$semantics");
                d3.z.g(c0Var4, "");
                return a0Var;
            case 9:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 10:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 11:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 12:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 13:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 14:
                k71.k.g((androidx.compose.ui.layout.k1) obj, "$this$layout");
                return a0Var;
            case 15:
                w1.r rVar2 = (w1.r) obj;
                k71.k.g(rVar2, "$this$applyIf");
                return rVar2;
            case 16:
                k71.k.g((String) obj, "it");
                return a0Var;
            case 18:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
            case 17:
                return a0Var;
            case 19:
                k71.k.g((g3.m0) obj, "it");
                return a0Var;
            case 20:
                d3.c0 c0Var5 = (d3.c0) obj;
                k71.k.g(c0Var5, "$this$semantics");
                d3.z.i(c0Var5, 0);
                return a0Var;
            case 21:
                k71.k.g((g3.m0) obj, "it");
                return a0Var;
            case 22:
                g3.h0 h0Var = com.github.rudroid.uitoolkit.utils.j.a;
                k71.k.g((f2.d) obj, "$this$mutableStateOf");
                return a0Var;
            case 23:
                MotionEvent motionEvent = (MotionEvent) obj;
                k71.k.g(motionEvent, "it");
                return Boolean.valueOf((motionEvent.getFlags() & 1) != 0);
            case 24:
                int intValue = ((Integer) obj).intValue();
                com.github.rudroid.common.f.Companion.getClass();
                return f.a.a(intValue);
            case 25:
                throw null;
            case 26:
                k71.k.g((GitHubWebView) obj, "it");
                return a0Var;
            case 27:
                k71.k.g((GitHubWebView) obj, "it");
                return a0Var;
            case 28:
                k71.k.g((GitHubWebView) obj, "it");
                return a0Var;
            default:
                k71.k.g((GitHubWebView) obj, "it");
                return a0Var;
        }
    }
}
