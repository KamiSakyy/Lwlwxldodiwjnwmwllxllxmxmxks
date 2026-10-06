package cb0;

import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.issueorpullrequest.ChecksOverviewState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import sy.d0Shadow;
import sy.tShadow;
import x61.m;
import x61.n;
import x61.rShadow;
import z70.d5;
import z70.g5;
import z70.h4;
import z70.l5;
import z70.t4;
import z70.u4;
import z70.v4;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements h01.c {
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
    public b(l5 l5Var) {
        int i;
        ChecksOverviewState checksOverviewState;
        t4 t4Var;
        g5 g5Var;
        t4 t4Var2;
        g5 g5Var2;
        t4 t4Var3;
        g5 g5Var3;
        a aVar = Companion;
        d5 d5Var = l5Var.z;
        List list = l5Var.L.c;
        h4 h4Var = (list == null || (t4Var3 = (t4) m.f0(list)) == null || (g5Var3 = t4Var3.b.c) == null) ? null : g5Var3.c;
        aVar.getClass();
        List<u4> list2 = h4Var != null ? h4Var.b : null;
        List<u4> list3 = rShadow.r;
        list2 = list2 == null ? list3 : list2;
        ArrayList arrayList = new ArrayList();
        for (u4 u4Var : list2) {
            bb0.a aVar2 = (u4Var != null ? u4Var.c : null) != null ? new bb0.a(u4Var.c) : (u4Var != null ? u4Var.b : null) != null ? new bb0.a(u4Var.b) : null;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        int i2 = d5Var.a;
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            int size = arrayList.size();
            i = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (k.b(((bb0.a) obj).h, Boolean.TRUE) && (i = i + 1) < 0) {
                    d0Shadow.w();
                    throw null;
                }
            }
        }
        int i4 = i2 - i;
        int i5 = i4 > 0 ? i4 + (h4Var != null ? h4Var.a : 0) : h4Var != null ? h4Var.a : 0;
        a aVar3 = Companion;
        h4 h4Var2 = (list == null || (t4Var2 = (t4) m.f0(list)) == null || (g5Var2 = t4Var2.b.c) == null) ? null : g5Var2.c;
        aVar3.getClass();
        List list4 = d5Var.b;
        List<v4> S = list4 != null ? m.S(list4) : null;
        S = S == null ? list3 : S;
        ArrayList arrayList2 = new ArrayList(n.F(S, 10));
        for (v4 v4Var : S) {
            k.g(v4Var, "requiredStatusCheck");
            String str = v4Var.a;
            String str2 = v4Var.b;
            MergeCheckStatus g = sy.rShadow.g(y9.a.K(v4Var.c));
            String str3 = v4Var.d;
            if (str3 == null) {
                str3 = "";
            }
            arrayList2.add(new bb0.a(str, str2, null, g, "", "", str3, Boolean.TRUE, null));
        }
        List list5 = h4Var2 != null ? h4Var2.b : null;
        list3 = list5 != null ? list5 : list3;
        ArrayList arrayList3 = new ArrayList();
        for (u4 u4Var2 : list3) {
            bb0.a aVar4 = (u4Var2 != null ? u4Var2.c : null) != null ? new bb0.a(u4Var2.c) : (u4Var2 != null ? u4Var2.b : null) != null ? new bb0.a(u4Var2.b) : null;
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
            if (hashSet.add(((bb0.a) obj2).b)) {
                arrayList4.add(obj2);
            }
        }
        List v0 = m.v0(arrayList4, tShadow.f(new bq.a(13), new bq.a(14)));
        if (l5Var.K > 0) {
            checksOverviewState = ChecksOverviewState.ACTION_REQUIRED;
        } else {
            if (list != null && (t4Var = (t4) m.f0(list)) != null && (g5Var = t4Var.b.c) != null) {
                int ordinal = g5Var.b.ordinal();
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
