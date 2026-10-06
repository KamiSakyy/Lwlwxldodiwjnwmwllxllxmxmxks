package wy0;

import android.content.Context;
import f1.ub;
import java.util.List;
import java.util.Map;
import jo.jf;
import jo.kf;
import jo.lf;
import jo.nf;
import jo.pf;
import jo.qf;
import jo.zi0;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class n6 implements j71.e {
    public final /* synthetic */ int r;

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        jn0.r3 r10 = null;
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        switch (i) {
            case 0:
                ((Long) obj2).longValue();
                k71.k.g((py0.b) obj, "<unused var>");
                break;
            case 1:
                String str = (String) obj2;
                k71.k.g((s01.n) obj, "<unused var>");
                k71.k.g(str, "after");
                break;
            case 2:
                jn0.o3 o3Var = (jn0.o3) obj;
                List list = (List) obj2;
                k71.k.g(o3Var, "data");
                k71.k.g(list, "nodes");
                jn0.s3 s3Var = o3Var.a;
                jn0.r3 r3Var = s3Var.b;
                if (r3Var != null) {
                    jn0.q3 q3Var = r3Var.a;
                    k71.k.g(q3Var, "pageInfo");
                    r10 = new jn0.r3(q3Var, list);
                }
                String str2 = s3Var.a;
                String str3 = s3Var.c;
                k71.k.g(str2, "id");
                k71.k.g(str3, "__typename");
                jn0.s3 s3Var2 = new jn0.s3(str2, r10, str3);
                String str4 = o3Var.b;
                String str5 = o3Var.c;
                k71.k.g(str4, "id");
                k71.k.g(str5, "__typename");
                break;
            case 3:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                ((Long) obj2).longValue();
                k71.k.g((zi0) obj, "<unused var>");
                break;
            case 6:
                w1.r rVar = (w1.r) obj;
                String str6 = (String) obj2;
                k71.k.g(rVar, "$this$applyIfNotNull");
                k71.k.g(str6, "it");
                break;
            case 7:
                String str7 = (String) obj2;
                k71.k.g((s01.n) obj, "<unused var>");
                k71.k.g(str7, "after");
                break;
            case 8:
                kf kfVar = (kf) obj;
                List list2 = (List) obj2;
                k71.k.g(kfVar, "data");
                k71.k.g(list2, "nodes");
                qf qfVar = kfVar.a;
                jf jfVar = qfVar.c;
                if (jfVar != null) {
                    lf lfVar = jfVar.a;
                    pf pfVar = lfVar.b.a;
                    k71.k.g(pfVar, "pageInfo");
                    lf lfVar2 = new lf(lfVar.a, new nf(pfVar, list2));
                    String str8 = jfVar.b;
                    String str9 = jfVar.c;
                    k71.k.g(str8, "id");
                    k71.k.g(str9, "__typename");
                    r10 = new jf(lfVar2, str8, str9);
                }
                String str10 = qfVar.a;
                String str11 = qfVar.b;
                k71.k.g(str10, "__typename");
                k71.k.g(str11, "id");
                qf qfVar2 = new qf(str10, str11, r10);
                String str12 = kfVar.b;
                String str13 = kfVar.c;
                k71.k.g(str12, "id");
                k71.k.g(str13, "__typename");
                break;
            case 9:
                z10.a aVar = (z10.a) obj;
                String str14 = (String) obj2;
                k71.k.g(aVar, "userAchievementsParameters");
                k71.k.g(str14, "after");
                break;
            case 10:
                v10.d dVar = (v10.d) obj;
                List list3 = (List) obj2;
                k71.k.g(dVar, "data");
                k71.k.g(list3, "nodes");
                v10.k kVar = dVar.a;
                if (kVar != null) {
                    v10.b bVar = kVar.c.a;
                    r10 = new v10.k(kVar.a, kVar.b, new v10.f(new v10.b(bVar.a, bVar.b, list3)));
                }
                break;
            case 11:
                String str15 = (String) obj;
                z5.m mVar = (z5.m) obj2;
                if (str15.length() != 0) {
                    break;
                } else {
                    break;
                }
            case 12:
                ((z5.i) obj).b = (z5.a) obj2;
                break;
            case 13:
                ((z5.i) obj).a = (z5.n) obj2;
                break;
            case 14:
                ((i6.h) obj2).getClass();
                ((z5.i) obj).e = 1;
                break;
            case 15:
                z5.d dVar2 = (z5.d) obj2;
                ((z5.i) obj).c = dVar2 != null ? dVar2.a : null;
                break;
            case 16:
                ((z5.i) obj).d = (Float) obj2;
                break;
            case 17:
                break;
            case 18:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                }
                break;
            case 19:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    com.github.rudroid.uitoolkit.listitems.d0.a((w1.r) null, "3", 0L, (g3.q0) null, 0L, 0L, (com.github.rudroid.uitoolkit.text.l) null, 0L, sVar3, 48, 253);
                    break;
                }
            case 20:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sVar4.V();
                    break;
                } else {
                    float f = ih.a.l;
                    w1.r B = androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, f, 0.0f, 0.0f, 13);
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
                    androidx.compose.foundation.layout.b.c(B, androidx.compose.foundation.layout.l.g(ih.a.k), androidx.compose.foundation.layout.l.g(f), (w1.i) null, 0, 0, zg.n.a, sVar4, 1573302, 56);
                    break;
                }
            case 21:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!sVar5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    sVar5.V();
                    break;
                } else {
                    com.github.rudroid.uitoolkit.listitems.d0.a((w1.r) null, "3", 0L, (g3.q0) null, 0L, 0L, (com.github.rudroid.uitoolkit.text.l) null, 0L, sVar5, 48, 253);
                    break;
                }
            case 22:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (!sVar6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    sVar6.V();
                    break;
                } else {
                    ub.c(com.github.rudroid.uitoolkit.utils.d0.a((Context) sVar6.j(w2.j0.b), "#Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi in dictum arcu, quis curs", 2, (g3.q0) null, sVar6, 24), (w1.r) null, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (Map) null, (j71.c) null, (g3.q0) null, sVar6, 0, 384, 520190);
                    break;
                }
            case 23:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (!sVar7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    sVar7.V();
                    break;
                } else {
                    float f2 = ih.a.l;
                    w1.r B2 = androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, f2, 0.0f, 0.0f, 13);
                    androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.l.a;
                    androidx.compose.foundation.layout.b.c(B2, androidx.compose.foundation.layout.l.g(ih.a.k), androidx.compose.foundation.layout.l.g(f2), (w1.i) null, 0, 0, zg.n.b, sVar7, 1573302, 56);
                    break;
                }
            case 24:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (!sVar8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    sVar8.V();
                    break;
                } else {
                    com.github.rudroid.uitoolkit.listitems.d0.a((w1.r) null, "3", 0L, (g3.q0) null, 0L, 0L, (com.github.rudroid.uitoolkit.text.l) null, 0L, sVar8, 48, 253);
                    break;
                }
            case 25:
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (!sVar9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                    sVar9.V();
                    break;
                } else {
                    ub.c(com.github.rudroid.uitoolkit.utils.d0.a((Context) sVar9.j(w2.j0.b), "#Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi in dictum arcu, quis curs", 2, (g3.q0) null, sVar9, 24), (w1.r) null, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (Map) null, (j71.c) null, (g3.q0) null, sVar9, 0, 384, 520190);
                    break;
                }
            case 26:
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (!sVar10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                    sVar10.V();
                    break;
                } else {
                    float f3 = ih.a.l;
                    w1.r B3 = androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, f3, 0.0f, 0.0f, 13);
                    androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.l.a;
                    androidx.compose.foundation.layout.b.c(B3, androidx.compose.foundation.layout.l.g(ih.a.k), androidx.compose.foundation.layout.l.g(f3), (w1.i) null, 0, 0, zg.n.c, sVar10, 1573302, 56);
                    break;
                }
            case 27:
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (!sVar11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                    sVar11.V();
                    break;
                } else {
                    com.github.rudroid.uitoolkit.listitems.d0.a((w1.r) null, "3", 0L, (g3.q0) null, 0L, 0L, (com.github.rudroid.uitoolkit.text.l) null, 0L, sVar11, 48, 253);
                    break;
                }
            case 28:
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (!sVar12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                    sVar12.V();
                    break;
                } else {
                    ub.c(com.github.rudroid.uitoolkit.utils.d0.a((Context) sVar12.j(w2.j0.b), "#Lorem ipsum dolor sit", 2, (g3.q0) null, sVar12, 24), (w1.r) null, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (Map) null, (j71.c) null, (g3.q0) null, sVar12, 0, 384, 520190);
                    break;
                }
            default:
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (!sVar13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                    sVar13.V();
                    break;
                } else {
                    com.github.rudroid.uitoolkit.listitems.d0.a((w1.r) null, "3", 0L, (g3.q0) null, 0L, 0L, (com.github.rudroid.uitoolkit.text.l) null, 0L, sVar13, 48, 253);
                    break;
                }
        }
        return a0Var;
    }
    public n6(int p1) {
    }
}
