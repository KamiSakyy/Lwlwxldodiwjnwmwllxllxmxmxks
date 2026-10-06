package lx0;

import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.issueorpullrequest.ChecksOverviewState;
import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import lm0.g;
import sy.d0Shadow;
import sy.tShadow;
import x61.m;
import x61.n;
import x61.rShadow;
import xt0.e5;
import xt0.f5;
import xt0.g5;
import xt0.m5;
import xt0.p5;
import xt0.r4;
import xt0.u5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements h01.c {
    public static final a Companion = new a();
    public int a;
    public List b;
    public ChecksOverviewState c;

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e7, code lost:
    
        if (r1 != null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(u5 u5Var) {
        int i;
        ChecksOverviewState checksOverviewState;
        e5 e5Var;
        p5 p5Var;
        e5 e5Var2;
        p5 p5Var2;
        e5 e5Var3;
        p5 p5Var3;
        a aVar = Companion;
        m5 m5Var = u5Var.C;
        List list = u5Var.N.c;
        r4 r4Var = (list == null || (e5Var3 = (e5) m.f0(list)) == null || (p5Var3 = e5Var3.b.c) == null) ? null : p5Var3.c;
        aVar.getClass();
        List<f5> list2 = r4Var != null ? r4Var.b : null;
        List<f5> list3 = rShadow.r;
        list2 = list2 == null ? list3 : list2;
        ArrayList arrayList = new ArrayList();
        for (f5 f5Var : list2) {
            kx0.a aVar2 = (f5Var != null ? f5Var.c : null) != null ? new kx0.a(f5Var.c) : (f5Var != null ? f5Var.b : null) != null ? new kx0.a(f5Var.b) : null;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        int i2 = m5Var.a;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            int size = arrayList.size();
            i = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (k.b(((kx0.a) obj).h, Boolean.TRUE) && (i = i + 1) < 0) {
                    d0Shadow.w();
                    throw null;
                }
            }
        }
        int i4 = i2 - i;
        int i5 = i4 > 0 ? i4 + (r4Var != null ? r4Var.a : 0) : r4Var != null ? r4Var.a : 0;
        a aVar3 = Companion;
        r4 r4Var2 = (list == null || (e5Var2 = (e5) m.f0(list)) == null || (p5Var2 = e5Var2.b.c) == null) ? null : p5Var2.c;
        aVar3.getClass();
        List list4 = m5Var.b;
        List<g5> S = list4 != null ? m.S(list4) : null;
        S = S == null ? list3 : S;
        int i6 = 10;
        ArrayList arrayList2 = new ArrayList(n.F(S, 10));
        for (g5 g5Var : S) {
            k.g(g5Var, "requiredStatusCheck");
            String str = g5Var.a;
            String str2 = g5Var.b;
            MergeCheckStatus d = b4.d(com.google.common.util.concurrent.a.W(g5Var.c));
            String str3 = g5Var.d;
            if (str3 == null) {
                str3 = "";
            }
            arrayList2.add(new kx0.a(str, str2, null, d, "", "", str3, Boolean.TRUE, null));
        }
        List list5 = r4Var2 != null ? r4Var2.b : null;
        list3 = list5 != null ? list5 : list3;
        ArrayList arrayList3 = new ArrayList();
        for (f5 f5Var2 : list3) {
            kx0.a aVar4 = (f5Var2 != null ? f5Var2.c : null) != null ? new kx0.a(f5Var2.c) : (f5Var2 != null ? f5Var2.b : null) != null ? new kx0.a(f5Var2.b) : null;
            if (aVar4 != null) {
                arrayList3.add(aVar4);
            }
        }
        ArrayList l0 = m.l0(arrayList3, arrayList2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        int size2 = l0.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = l0.get(i7);
            i7++;
            if (hashSet.add(((kx0.a) obj2).b)) {
                arrayList4.add(obj2);
            }
        }
        List v0 = m.v0(arrayList4, tShadow.f(new j71.c[]{new g(9), new g(i6)}));
        if (u5Var.M > 0) {
            checksOverviewState = ChecksOverviewState.ACTION_REQUIRED;
        } else {
            if (list != null && (e5Var = (e5) m.f0(list)) != null && (p5Var = e5Var.b.c) != null) {
                int ordinal = p5Var.b.ordinal();
                if (ordinal == 0) {
                    checksOverviewState = ChecksOverviewState.ERROR;
                } else if (ordinal == 1) {
                    checksOverviewState = ChecksOverviewState.EXPECTED;
                } else if (ordinal == 2) {
                    checksOverviewState = ChecksOverviewState.FAILURE;
                } else if (ordinal == 3) {
                    checksOverviewState = ChecksOverviewState.PENDING;
                } else if (ordinal == 4) {
                    checksOverviewState = ChecksOverviewState.SUCCESS;
                } else {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    checksOverviewState = ChecksOverviewState.UNKNOWN;
                }
            }
            checksOverviewState = ChecksOverviewState.UNKNOWN;
        }
        k.g(checksOverviewState, "checksState");
        this.a = i5;
        this.b = v0;
        this.c = checksOverviewState;
    }

    @Override // h01.c
    public final int a() {
        return this.a;
    }

    @Override // h01.c
    public final ChecksOverviewState b() {
        return this.c;
    }

    @Override // h01.c
    public final List c() {
        return this.b;
    }
}
