package com.github.rudroid.starredreposandlists.bottomsheet;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.m0;
import com.github.rudroid.starredreposandlists.bottomsheet.i;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.i1;
import y71.y1;
import yz0.e8;
import yz0.f8;
import yz0.g8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w extends k1 {
    public static final a Companion = new a();
    public f8 A;
    public q1 B;
    public xm.a s;
    public q t;
    public com.github.rudroid.activities.util.c u;
    public String v;
    public String w;
    public ArrayList x;
    public y1 y;
    public i1 z;

    public static final class a {
    }

    public w(xm.a aVar, q qVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        k71.k.g(aVar, "fetchListSelectionBottomSheetDataUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = aVar;
        this.t = qVar;
        this.u = cVar;
        String str = (String) a1Var.a("repo_name");
        if (str == null) {
            throw new IllegalStateException("Repo name not set in bundle!");
        }
        this.v = str;
        String str2 = (String) a1Var.a("repo_owner");
        if (str2 == null) {
            throw new IllegalStateException("Repo owner not set in bundle!");
        }
        this.w = str2;
        y1 s = m0.s(fl.f.Companion, (Object) null);
        this.y = s;
        this.z = new i1(s);
        q1 q1Var = this.B;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.B = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new z(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable, java.lang.Object] */
    public final void P() {
        y61.b h;
        f8 f8Var = this.A;
        if (f8Var != null) {
            fl.e eVar = fl.f.Companion;
            x61.rShadow rVar = this.x;
            if (rVar == null) {
                rVar = x61.rShadow.r;
            }
            this.t.getClass();
            boolean z = f8Var.a;
            i.a aVar = i.a.a;
            if (z) {
                java.lang.Object r0 = (java.lang.Object) (f8Var.c);
                y61.b i = sy.d0Shadow.i();
                ArrayList arrayList = new ArrayList(x61.n.F((Iterable) r0, 10));
                for (e8 e8Var : r0) {
                    String str = e8Var.r;
                    arrayList.add(new i.b(new v(str, e8Var.s, rVar.contains(str))));
                }
                i.addAll(arrayList);
                i.add(aVar);
                h = sy.d0Shadow.h(i);
            } else {
                ArrayList arrayList2 = f8Var.b;
                y61.b i2 = sy.d0Shadow.i();
                i2.add(i.c.a);
                ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    g8 g8Var = (g8) obj;
                    String str2 = g8Var.b;
                    arrayList3.add(new i.b(new v(str2, g8Var.a, rVar.contains(str2))));
                }
                i2.addAll(arrayList3);
                i2.add(aVar);
                h = sy.d0Shadow.h(i2);
            }
            eVar.getClass();
            fl.f c = fl.e.c(h);
            y1 y1Var = this.y;
            y1Var.getClass();
            y1Var.k((Object) null, c);
        }
    }
}
