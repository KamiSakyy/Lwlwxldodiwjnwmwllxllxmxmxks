package sy;

import android.view.View;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.InteractionType;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.WorkflowState;
import com.github.service.models.response.organizations.Organization;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.github.service.models.response.type.IssueState;
import da1.k0;
import da1.o0;
import da1.p0;
import da1.s0;
import da1.u0;
import dw.y6;
import dw.z6;
import gn0.e20;
import gn0.r2;
import gn0.yv;
import hc0.rb;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import u10.nf;
import u10.of;
import vn0.s1;
import wy0.p4;
import yz0.q4;
import yz0.r4;
import yz0.x1;
import yz0.z4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u {
    public static void a(Throwable th2, Throwable th3) {
        k71.k.g(th2, "<this>");
        k71.k.g(th3, "exception");
        if (th2 != th3) {
            Integer num = f71.a.a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = e71.a.a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    public static void b(StringBuilder sb, Object obj, j71.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.k(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final mn.e c(vn0.g gVar, String str) {
        s1 s1Var;
        ArrayList arrayList = x61.r.r;
        if (gVar == null) {
            return new mn.e(0, arrayList, new x01.i((String) null, false, true));
        }
        vn0.o oVar = gVar.b;
        x01.i iVar = new x01.i(oVar.c, oVar.a, true ^ oVar.b);
        List<vn0.k> list = gVar.c;
        if (list != null) {
            arrayList = new ArrayList();
            for (vn0.k kVar : list) {
                mn.a b = (kVar == null || (s1Var = kVar.c) == null) ? null : xn0.a.b(s1Var, str);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return new mn.e(gVar.a, arrayList, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g01.a d(nf nfVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        Boolean bool2;
        com.github.service.models.response.a aVar;
        String str10;
        int i;
        int i2;
        int i3;
        q4 q4Var;
        com.github.service.models.response.a aVar2;
        k71.k.g(nfVar, "<this>");
        of ofVar = nfVar.a;
        boolean z = ofVar.d;
        ArrayList arrayList = ofVar.f.a;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ea0.w wVar = (ea0.w) obj;
            com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(ofVar.c, t.q.q(ofVar.e), (String) null, false, (String) null, 60);
            k71.k.g(wVar, "<this>");
            ea0.p pVar = wVar.d;
            ea0.r rVar = pVar.c;
            ea0.s sVar = pVar.b;
            String str11 = "";
            if (rVar != null) {
                str2 = rVar.a;
            } else if (sVar != null) {
                str2 = sVar.a;
            } else {
                str = "";
                if (rVar == null) {
                    str4 = rVar.b;
                } else if (sVar != null) {
                    str4 = sVar.b;
                } else {
                    str3 = "";
                    if (rVar != null) {
                        str6 = rVar.c;
                    } else if (sVar != null) {
                        str6 = sVar.c;
                    } else {
                        str5 = "";
                        if (rVar == null) {
                            str8 = rVar.i.b;
                        } else if (sVar != null) {
                            str8 = sVar.k.b;
                        } else {
                            str7 = "";
                            if (rVar != null) {
                                str11 = rVar.i.c.c;
                            } else if (sVar != null) {
                                str11 = sVar.k.c.c;
                            }
                            String str12 = str11;
                            if (rVar != null || (bool2 = rVar.g) == null) {
                                if (sVar != null) {
                                    bool2 = sVar.h;
                                } else {
                                    str9 = str;
                                    bool = null;
                                    if (rVar == null) {
                                        i2 = rVar.d;
                                    } else if (sVar != null) {
                                        i2 = sVar.d;
                                    } else {
                                        aVar = aVar3;
                                        str10 = str3;
                                        i = 0;
                                        rb rbVar = wVar.a;
                                        x1 x1Var = InteractionType.Companion;
                                        String str13 = rbVar.r;
                                        x1Var.getClass();
                                        InteractionType a = x1.a(str13);
                                        ea0.o oVar = wVar.c;
                                        g01.c cVar = new g01.c(a, oVar != null ? oVar.b : null, t.q.q(oVar != null ? oVar.d : null), wVar.b, aVar);
                                        String str14 = str5;
                                        com.github.service.models.response.a aVar4 = aVar;
                                        if (rVar != null) {
                                            i3 = rVar.f.a;
                                        } else if (sVar != null) {
                                            Integer num = sVar.e;
                                            i3 = num != null ? num.intValue() : sVar.g.a;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (rVar != null) {
                                            String str15 = rVar.a;
                                            String str16 = rVar.b;
                                            int i5 = rVar.d;
                                            r01.e eVar = IssueState.Companion;
                                            String str17 = rVar.e.r;
                                            eVar.getClass();
                                            IssueState b = r01.e.b(str17);
                                            ea0.x xVar = rVar.i;
                                            q4Var = new q4(str15, str16, i5, b, xVar.c.c, xVar.b, t.a0.N(rVar.j));
                                        } else if (sVar != null) {
                                            String str18 = sVar.a;
                                            String str19 = sVar.b;
                                            boolean z2 = sVar.i;
                                            int i6 = sVar.d;
                                            PullRequestState Q = m7.y.Q(sVar.f);
                                            ea0.y yVar = sVar.k;
                                            q4 r4Var = new r4(str18, str19, z2, i6, Q, yVar.c.c, yVar.b, false);
                                            aVar2 = aVar4;
                                            q4Var = r4Var;
                                            arrayList2.add(new g01.f(aVar2, str9, str10, str14, str7, str12, bool, i, cVar, i3, q4Var));
                                        } else {
                                            q4Var = z4.t;
                                        }
                                        aVar2 = aVar4;
                                        arrayList2.add(new g01.f(aVar2, str9, str10, str14, str7, str12, bool, i, cVar, i3, q4Var));
                                    }
                                    aVar = aVar3;
                                    str10 = str3;
                                    i = i2;
                                    rb rbVar2 = wVar.a;
                                    x1 x1Var2 = InteractionType.Companion;
                                    String str132 = rbVar2.r;
                                    x1Var2.getClass();
                                    InteractionType a2 = x1.a(str132);
                                    ea0.o oVar2 = wVar.c;
                                    g01.c cVar2 = new g01.c(a2, oVar2 != null ? oVar2.b : null, t.q.q(oVar2 != null ? oVar2.d : null), wVar.b, aVar);
                                    String str142 = str5;
                                    com.github.service.models.response.a aVar42 = aVar;
                                    if (rVar != null) {
                                    }
                                    if (rVar != null) {
                                    }
                                    aVar2 = aVar42;
                                    arrayList2.add(new g01.f(aVar2, str9, str10, str142, str7, str12, bool, i, cVar2, i3, q4Var));
                                }
                            }
                            str9 = str;
                            bool = bool2;
                            if (rVar == null) {
                            }
                            aVar = aVar3;
                            str10 = str3;
                            i = i2;
                            rb rbVar22 = wVar.a;
                            x1 x1Var22 = InteractionType.Companion;
                            String str1322 = rbVar22.r;
                            x1Var22.getClass();
                            InteractionType a22 = x1.a(str1322);
                            ea0.o oVar22 = wVar.c;
                            g01.c cVar22 = new g01.c(a22, oVar22 != null ? oVar22.b : null, t.q.q(oVar22 != null ? oVar22.d : null), wVar.b, aVar);
                            String str1422 = str5;
                            com.github.service.models.response.a aVar422 = aVar;
                            if (rVar != null) {
                            }
                            if (rVar != null) {
                            }
                            aVar2 = aVar422;
                            arrayList2.add(new g01.f(aVar2, str9, str10, str1422, str7, str12, bool, i, cVar22, i3, q4Var));
                        }
                        str7 = str8;
                        if (rVar != null) {
                        }
                        String str122 = str11;
                        if (rVar != null) {
                        }
                        if (sVar != null) {
                        }
                    }
                    str5 = str6;
                    if (rVar == null) {
                    }
                    str7 = str8;
                    if (rVar != null) {
                    }
                    String str1222 = str11;
                    if (rVar != null) {
                    }
                    if (sVar != null) {
                    }
                }
                str3 = str4;
                if (rVar != null) {
                }
                str5 = str6;
                if (rVar == null) {
                }
                str7 = str8;
                if (rVar != null) {
                }
                String str12222 = str11;
                if (rVar != null) {
                }
                if (sVar != null) {
                }
            }
            str = str2;
            if (rVar == null) {
            }
            str3 = str4;
            if (rVar != null) {
            }
            str5 = str6;
            if (rVar == null) {
            }
            str7 = str8;
            if (rVar != null) {
            }
            String str122222 = str11;
            if (rVar != null) {
            }
            if (sVar != null) {
            }
        }
        return new g01.a(arrayList2, z);
    }

    public static final h01.p e(z6 z6Var) {
        y6 y6Var = z6Var.b;
        return new h01.p(y6Var.a, y6Var.b);
    }

    public static final x6.a0 f(View view) {
        k71.k.g(view, "view");
        s71.f fVar = new s71.f(s71.j.j0(s71.j.h0(view, new p4(21)), new p4(22)));
        x6.a0 a0Var = (x6.a0) (!fVar.hasNext() ? null : fVar.next());
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static List h(Throwable th2) {
        Object invoke;
        k71.k.g(th2, "<this>");
        Integer num = f71.a.a;
        if (!(num == null || num.intValue() >= 19)) {
            Method method = e71.a.b;
            return (method == null || (invoke = method.invoke(th2, null)) == null) ? x61.r.r : x61.l.r((Throwable[]) invoke);
        }
        Throwable[] suppressed = th2.getSuppressed();
        k71.k.f(suppressed, "getSuppressed(...)");
        return x61.l.r(suppressed);
    }

    public static final boolean i(wm.b bVar) {
        List list;
        k71.k.g(bVar, "<this>");
        if (bVar.K() != ShortcutType.DISCUSSION) {
            String obj = t71.p.t0(bVar.P()).toString();
            if (obj.length() != 0) {
                String C = t71.w.C(t71.w.C(obj, "\"", ""), "'", "");
                if (t71.p.I(C, "(", false) || t71.p.I(C, ")", false)) {
                    return true;
                }
                Pattern compile = Pattern.compile("\\s+");
                k71.k.f(compile, "compile(...)");
                t71.p.d0(0);
                Matcher matcher = compile.matcher(C);
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int i = 0;
                    do {
                        arrayList.add(C.subSequence(i, matcher.start()).toString());
                        i = matcher.end();
                    } while (matcher.find());
                    arrayList.add(C.subSequence(i, C.length()).toString());
                    list = arrayList;
                } else {
                    list = d0.n(C.toString());
                }
                if (list.contains("AND") || list.contains("OR")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static x3.k j(a71.h hVar, j71.e eVar) {
        v71.a0 a0Var = v71.a0.r;
        k71.k.g(hVar, "context");
        return t.q.m(new r11.b(hVar, a0Var, eVar));
    }

    public static ca1.g k(String str) {
        da1.b bVar = new da1.b();
        StringReader stringReader = new StringReader(str);
        da1.f0 f0Var = new da1.f0(bVar);
        f0Var.r.getClass();
        ca1.g gVar = new ca1.g();
        bVar.d = gVar;
        gVar.B = f0Var;
        bVar.a = f0Var;
        bVar.h = f0Var.t;
        da1.a aVar = new da1.a(stringReader);
        bVar.b = aVar;
        f0Var.s.getClass();
        aVar.A = null;
        f0Var.s.getClass();
        bVar.c = new u0(bVar);
        bVar.e = new ArrayList(32);
        bVar.i = f0Var.a();
        p0 p0Var = new p0(2, bVar);
        bVar.j = p0Var;
        bVar.g = p0Var;
        bVar.f = "";
        bVar.l = da1.b0.r;
        bVar.m = null;
        bVar.n = false;
        bVar.o = null;
        bVar.p = null;
        bVar.q = new ArrayList();
        bVar.r = new ArrayList();
        bVar.s = new ArrayList();
        bVar.t = new o0(3, bVar);
        bVar.u = true;
        bVar.v = false;
        while (true) {
            if (bVar.g.a == 7) {
                ArrayList arrayList = bVar.e;
                if (arrayList == null) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    bVar.e = null;
                } else {
                    bVar.E();
                }
            } else {
                u0 u0Var = bVar.c;
                s0 s0Var = u0Var.k;
                while (!u0Var.e) {
                    u0Var.c.d(u0Var, u0Var.a);
                }
                if (!((k0) s0Var).d.A()) {
                    u0Var.e = false;
                    s0Var = u0Var.d;
                }
                bVar.g = s0Var;
                bVar.H(s0Var);
                s0Var.f();
            }
        }
        da1.a aVar2 = bVar.b;
        if (aVar2 != null) {
            aVar2.close();
            bVar.b = null;
            bVar.c = null;
            bVar.e = null;
        }
        return bVar.d;
    }

    public static final CheckStatusState l(yv yvVar) {
        int ordinal = yvVar.ordinal();
        if (ordinal == 0) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 1) {
            return CheckStatusState.UNKNOWN__;
        }
        if (ordinal == 2) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 3) {
            return CheckStatusState.QUEUED;
        }
        if (ordinal == 4) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 5) {
            return CheckStatusState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Organization m(k70.q qVar) {
        k71.k.g(qVar, "<this>");
        return new Organization(qVar.b, qVar.e, qVar.d, qVar.c, t.q.q(qVar.g), qVar.f);
    }

    public static final CheckStatusState n(r2 r2Var) {
        k71.k.g(r2Var, "<this>");
        switch (r2Var.ordinal()) {
            case 0:
                return CheckStatusState.COMPLETED;
            case 1:
                return CheckStatusState.IN_PROGRESS;
            case 2:
                return CheckStatusState.UNKNOWN__;
            case 3:
                return CheckStatusState.QUEUED;
            case 4:
                return CheckStatusState.REQUESTED;
            case 5:
                return CheckStatusState.WAITING;
            case 6:
                return CheckStatusState.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final WorkflowState o(e20 e20Var) {
        int ordinal = e20Var.ordinal();
        if (ordinal == 0) {
            return WorkflowState.ACTIVE;
        }
        if (ordinal == 1) {
            return WorkflowState.DELETED;
        }
        if (ordinal == 2) {
            return WorkflowState.DISABLED_FORK;
        }
        if (ordinal == 3) {
            return WorkflowState.DISABLED_INACTIVITY;
        }
        if (ordinal == 4) {
            return WorkflowState.DISABLED_MANUALLY;
        }
        if (ordinal == 5) {
            return WorkflowState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract void g(u31.x xVar, float f, float f2);
}
