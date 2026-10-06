package com.github.rudroid.support;

import android.os.Build;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h0;
import com.github.rudroid.utilities.ui.u0;
import in.a1;
import v71.b0;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public class s extends k1 {
    public static final a Companion = new a();
    public a1 A;
    public String B;
    public com.github.rudroid.activities.util.c s;
    public q10.g t;
    public y1 u;
    public i1 v;
    public y1 w;
    public String x;
    public y1 y;
    public String z;

    public static final class a {
    }

    public s(com.github.rudroid.activities.util.c cVar, q10.g gVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(gVar, "supportClientForUserFactory");
        this.s = cVar;
        this.t = gVar;
        g1.a aVar = g1.Companion;
        h.Companion.getClass();
        h hVar = h.f;
        aVar.getClass();
        y1 c = n1Shadow.c(new u0(hVar));
        this.u = c;
        this.v = new i1(c);
        this.w = n1Shadow.c("");
        this.x = "";
        this.y = n1Shadow.c("");
        this.z = "";
        int i = Build.VERSION.SDK_INT;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder n = x.i.n(i, "GitHub Android v1.257.0; OS SDK v", "; ", str, " ");
        n.append(str2);
        this.B = n.toString();
        b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new n(this, null), 3);
        b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new p(this, null), 3);
        b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new r(this, null), 3);
    }

    public final void P() {
        boolean z = !S() && this.x.length() > 0 && this.z.length() > 0;
        g1.a aVar = g1.Companion;
        y1 y1Var = this.u;
        h hVar = (h) ((g1) y1Var.getValue()).getData();
        h a2 = hVar != null ? h.a(hVar, null, false, z, null, null, 27) : null;
        aVar.getClass();
        h0 h0Var = new h0(a2);
        y1Var.getClass();
        y1Var.k((Object) null, h0Var);
    }

    public final void Q() {
        int length = this.z.length();
        y1 y1Var = this.u;
        if (length < 15) {
            g1.a aVar = g1.Companion;
            h hVar = (h) ((g1) y1Var.getValue()).getData();
            h a2 = hVar != null ? h.a(hVar, null, false, false, g.t, null, 23) : null;
            aVar.getClass();
            h0 h0Var = new h0(a2);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var);
        } else if (this.z.length() > 60000) {
            g1.a aVar2 = g1.Companion;
            h hVar2 = (h) ((g1) y1Var.getValue()).getData();
            h a3 = hVar2 != null ? h.a(hVar2, null, false, false, g.u, null, 23) : null;
            aVar2.getClass();
            h0 h0Var2 = new h0(a3);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var2);
        } else {
            g1.a aVar3 = g1.Companion;
            h hVar3 = (h) ((g1) y1Var.getValue()).getData();
            h a4 = hVar3 != null ? h.a(hVar3, null, false, false, null, null, 23) : null;
            aVar3.getClass();
            h0 h0Var3 = new h0(a4);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var3);
        }
        P();
    }

    public final void R() {
        int length = this.x.length();
        y1 y1Var = this.u;
        if (length < 3) {
            g1.a aVar = g1.Companion;
            h hVar = (h) ((g1) y1Var.getValue()).getData();
            h a2 = hVar != null ? h.a(hVar, null, false, false, null, g.r, 15) : null;
            aVar.getClass();
            h0 h0Var = new h0(a2);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var);
        } else if (this.x.length() > 50) {
            g1.a aVar2 = g1.Companion;
            h hVar2 = (h) ((g1) y1Var.getValue()).getData();
            h a3 = hVar2 != null ? h.a(hVar2, null, false, false, null, g.s, 15) : null;
            aVar2.getClass();
            h0 h0Var2 = new h0(a3);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var2);
        } else {
            g1.a aVar3 = g1.Companion;
            h hVar3 = (h) ((g1) y1Var.getValue()).getData();
            h a4 = hVar3 != null ? h.a(hVar3, null, false, false, null, null, 15) : null;
            aVar3.getClass();
            h0 h0Var3 = new h0(a4);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var3);
        }
        P();
    }

    public final boolean S() {
        y1 y1Var = this.u;
        h hVar = (h) ((g1) y1Var.getValue()).getData();
        if ((hVar != null ? hVar.d : null) != null) {
            return true;
        }
        h hVar2 = (h) ((g1) y1Var.getValue()).getData();
        return (hVar2 != null ? hVar2.e : null) != null;
    }
    public static Object I(Object p1) { return null; }
    public Object t() { return null; }
    public Object u() { return null; }
}
