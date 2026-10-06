package xl0;

import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.issueorpullrequest.ChecksOverviewState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k21.f;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import ri0.g5;
import ri0.h5;
import ri0.i5;
import ri0.q5;
import ri0.s4;
import ri0.t5;
import ri0.y5;
import sy.d0Shadow;
import sy.q;
import sy.tShadow;
import wy0.p4;
import x61.m;
import x61.n;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements h01.c {
    public static final a Companion = new a();
    public int a;
    public List b;
    public ChecksOverviewState c;

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e9, code lost:
    
        if (r1 != null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(y5 y5Var) {
        int i;
        ChecksOverviewState checksOverviewState;
        g5 g5Var;
        t5 t5Var;
        g5 g5Var2;
        t5 t5Var2;
        g5 g5Var3;
        t5 t5Var3;
        a aVar = Companion;
        q5 q5Var = y5Var.C;
        List list = y5Var.O.c;
        s4 s4Var = (list == null || (g5Var3 = (g5) m.f0(list)) == null || (t5Var3 = g5Var3.b.c) == null) ? null : t5Var3.c;
        aVar.getClass();
        List<h5> list2 = s4Var != null ? s4Var.b : null;
        List<h5> list3 = rShadow.r;
        list2 = list2 == null ? list3 : list2;
        ArrayList arrayList = new ArrayList();
        for (h5 h5Var : list2) {
            wl0.a aVar2 = (h5Var != null ? h5Var.c : null) != null ? new wl0.a(h5Var.c) : (h5Var != null ? h5Var.b : null) != null ? new wl0.a(h5Var.b) : null;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        int i2 = q5Var.a;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            int size = arrayList.size();
            i = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (k.b(((wl0.a) obj).h, Boolean.TRUE) && (i = i + 1) < 0) {
                    d0Shadow.w();
                    throw null;
                }
            }
        }
        int i4 = i2 - i;
        int i5 = i4 > 0 ? i4 + (s4Var != null ? s4Var.a : 0) : s4Var != null ? s4Var.a : 0;
        a aVar3 = Companion;
        s4 s4Var2 = (list == null || (g5Var2 = (g5) m.f0(list)) == null || (t5Var2 = g5Var2.b.c) == null) ? null : t5Var2.c;
        aVar3.getClass();
        List list4 = q5Var.b;
        List<i5> S = list4 != null ? m.S(list4) : null;
        S = S == null ? list3 : S;
        ArrayList arrayList2 = new ArrayList(n.F(S, 10));
        for (i5 i5Var : S) {
            k.g(i5Var, "requiredStatusCheck");
            String str = i5Var.a;
            String str2 = i5Var.b;
            MergeCheckStatus e = f.e(q.o(i5Var.c));
            String str3 = i5Var.d;
            if (str3 == null) {
                str3 = "";
            }
            arrayList2.add(new wl0.a(str, str2, null, e, "", "", str3, Boolean.TRUE, null));
        }
        List list5 = s4Var2 != null ? s4Var2.b : null;
        list3 = list5 != null ? list5 : list3;
        ArrayList arrayList3 = new ArrayList();
        for (h5 h5Var2 : list3) {
            wl0.a aVar4 = (h5Var2 != null ? h5Var2.c : null) != null ? new wl0.a(h5Var2.c) : (h5Var2 != null ? h5Var2.b : null) != null ? new wl0.a(h5Var2.b) : null;
            if (aVar4 != null) {
                arrayList3.add(aVar4);
            }
        }
        ArrayList l0 = m.l0(arrayList3, arrayList2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        int size2 = l0.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = l0.get(i6);
            i6++;
            if (hashSet.add(((wl0.a) obj2).b)) {
                arrayList4.add(obj2);
            }
        }
        List v0 = m.v0(arrayList4, tShadow.f(new j71.c[]{new p4(28), new p4(29)}));
        if (y5Var.N > 0) {
            checksOverviewState = ChecksOverviewState.ACTION_REQUIRED;
        } else {
            if (list != null && (g5Var = (g5) m.f0(list)) != null && (t5Var = g5Var.b.c) != null) {
                int ordinal = t5Var.b.ordinal();
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
