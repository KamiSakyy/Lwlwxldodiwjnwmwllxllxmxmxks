package w80;

import hc0.fq;
import hc0.zk;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "name", "url", "isInOrganization", "owner", "id", "viewerPermission", "squashMergeAllowed", "rebaseMergeAllowed", "mergeCommitAllowed", "viewerDefaultCommitEmail", "viewerDefaultMergeMethod", "viewerPossibleCommitEmails", "planSupports", "allowUpdateBranch", "defaultBranchRef"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0029. Please report as an issue. */
    public static o2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool5 = null;
        n2 n2Var = null;
        String str4 = null;
        fq fqVar = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        String str5 = null;
        zk zkVar = null;
        List list = null;
        Boolean bool9 = null;
        m2 m2Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool3 = bool4;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool3;
                case 1:
                    bool3 = bool4;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool3;
                case 2:
                    bool3 = bool4;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool3;
                case 3:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 4:
                    bool = bool4;
                    bool2 = bool5;
                    n2Var = (n2) aa.c.c(q2.a, true).a(eVar, wVar);
                    bool4 = bool;
                    bool5 = bool2;
                case 5:
                    bool3 = bool4;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool3;
                case 6:
                    bool3 = bool4;
                    fqVar = (fq) aa.c.b(ic0.b.h).a(eVar, wVar);
                    bool4 = bool3;
                case 7:
                    bool3 = bool4;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool3;
                case 8:
                    bool3 = bool4;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool3;
                case 9:
                    bool3 = bool4;
                    bool7 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool3;
                case 10:
                    bool3 = bool4;
                    str5 = (String) aa.c.i.a(eVar, wVar);
                    bool4 = bool3;
                case 11:
                    Boolean bool10 = bool4;
                    Boolean bool11 = bool5;
                    Boolean bool12 = bool6;
                    Boolean bool13 = bool7;
                    Boolean bool14 = bool8;
                    Boolean bool15 = bool9;
                    String u = eVar.u();
                    k71.k.d(u);
                    zk.Companion.getClass();
                    Iterator it = zk.y.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((zk) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    zk zkVar2 = (zk) obj;
                    zkVar = zkVar2 == null ? zk.w : zkVar2;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool12;
                    bool7 = bool13;
                    bool8 = bool14;
                    bool9 = bool15;
                case 12:
                    bool3 = bool4;
                    list = (List) aa.c.b(aa.c.a(aa.c.a)).a(eVar, wVar);
                    bool4 = bool3;
                case 13:
                    bool3 = bool4;
                    bool8 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool3;
                case 14:
                    bool3 = bool4;
                    bool9 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool3;
                case 15:
                    bool = bool4;
                    bool2 = bool5;
                    m2Var = (m2) aa.c.b(aa.c.c(p2.a, false)).a(eVar, wVar);
                    bool4 = bool;
                    bool5 = bool2;
            }
            Boolean bool16 = bool4;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "name");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (bool16 == null) {
                k41.b.B(eVar, "isInOrganization");
                throw null;
            }
            Boolean bool17 = bool5;
            boolean booleanValue = bool16.booleanValue();
            if (n2Var == null) {
                k41.b.B(eVar, "owner");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (bool17 == null) {
                k41.b.B(eVar, "squashMergeAllowed");
                throw null;
            }
            Boolean bool18 = bool6;
            boolean booleanValue2 = bool17.booleanValue();
            if (bool18 == null) {
                k41.b.B(eVar, "rebaseMergeAllowed");
                throw null;
            }
            Boolean bool19 = bool7;
            boolean booleanValue3 = bool18.booleanValue();
            if (bool19 == null) {
                k41.b.B(eVar, "mergeCommitAllowed");
                throw null;
            }
            Boolean bool20 = bool8;
            boolean booleanValue4 = bool19.booleanValue();
            if (zkVar == null) {
                k41.b.B(eVar, "viewerDefaultMergeMethod");
                throw null;
            }
            if (bool20 == null) {
                k41.b.B(eVar, "planSupports");
                throw null;
            }
            Boolean bool21 = bool9;
            boolean booleanValue5 = bool20.booleanValue();
            if (bool21 != null) {
                return new o2(str, str2, str3, booleanValue, n2Var, str4, fqVar, booleanValue2, booleanValue3, booleanValue4, str5, zkVar, list, booleanValue5, bool21.booleanValue(), m2Var);
            }
            k41.b.B(eVar, "allowUpdateBranch");
            throw null;
        }
    }
}
