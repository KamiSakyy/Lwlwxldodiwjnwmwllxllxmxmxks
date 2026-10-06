package iz;

import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.issueorpullrequest.ChecksOverviewState;
import com.google.android.gms.internal.measurement.b4;
import gv.b5;
import gv.b6;
import gv.g6;
import gv.p5;
import gv.q5;
import gv.r5;
import gv.y5;
import io0.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import sy.d0;
import sy.t;
import x61.m;
import x61.n;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
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
    public b(g6 g6Var) {
        int i;
        ChecksOverviewState checksOverviewState;
        p5 p5Var;
        b6 b6Var;
        p5 p5Var2;
        b6 b6Var2;
        p5 p5Var3;
        b6 b6Var3;
        a aVar = Companion;
        y5 y5Var = g6Var.C;
        List list = g6Var.N.c;
        b5 b5Var = (list == null || (p5Var3 = (p5) m.f0(list)) == null || (b6Var3 = p5Var3.b.c) == null) ? null : b6Var3.c;
        aVar.getClass();
        List<q5> list2 = b5Var != null ? b5Var.b : null;
        List<q5> list3 = r.r;
        list2 = list2 == null ? list3 : list2;
        ArrayList arrayList = new ArrayList();
        for (q5 q5Var : list2) {
            fz.a aVar2 = (q5Var != null ? q5Var.c : null) != null ? new fz.a(q5Var.c) : (q5Var != null ? q5Var.b : null) != null ? new fz.a(q5Var.b) : null;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        int i2 = y5Var.a;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            int size = arrayList.size();
            i = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (k.b(((fz.a) obj).h, Boolean.TRUE) && (i = i + 1) < 0) {
                    d0.w();
                    throw null;
                }
            }
        }
        int i4 = i2 - i;
        int i5 = i4 > 0 ? i4 + (b5Var != null ? b5Var.a : 0) : b5Var != null ? b5Var.a : 0;
        a aVar3 = Companion;
        b5 b5Var2 = (list == null || (p5Var2 = (p5) m.f0(list)) == null || (b6Var2 = p5Var2.b.c) == null) ? null : b6Var2.c;
        aVar3.getClass();
        List list4 = y5Var.b;
        List<r5> S = list4 != null ? m.S(list4) : null;
        S = S == null ? list3 : S;
        ArrayList arrayList2 = new ArrayList(n.F(S, 10));
        for (r5 r5Var : S) {
            k.g(r5Var, "requiredStatusCheck");
            String str = r5Var.a;
            String str2 = r5Var.b;
            MergeCheckStatus d = b31.b.d(b4.o0(r5Var.c));
            String str3 = r5Var.d;
            if (str3 == null) {
                str3 = "";
            }
            arrayList2.add(new fz.a(str, str2, null, d, "", "", str3, Boolean.TRUE, null));
        }
        List list5 = b5Var2 != null ? b5Var2.b : null;
        list3 = list5 != null ? list5 : list3;
        ArrayList arrayList3 = new ArrayList();
        for (q5 q5Var2 : list3) {
            fz.a aVar4 = (q5Var2 != null ? q5Var2.c : null) != null ? new fz.a(q5Var2.c) : (q5Var2 != null ? q5Var2.b : null) != null ? new fz.a(q5Var2.b) : null;
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
            if (hashSet.add(((fz.a) obj2).b)) {
                arrayList4.add(obj2);
            }
        }
        List v0 = m.v0(arrayList4, t.f(new f(22), new f(23)));
        if (g6Var.M > 0) {
            checksOverviewState = ChecksOverviewState.ACTION_REQUIRED;
        } else {
            if (list != null && (p5Var = (p5) m.f0(list)) != null && (b6Var = p5Var.b.c) != null) {
                int ordinal = b6Var.b.ordinal();
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

    public final int a() {
        return this.a;
    }

    public final ChecksOverviewState b() {
        return this.c;
    }

    public final List c() {
        return this.b;
    }
}
