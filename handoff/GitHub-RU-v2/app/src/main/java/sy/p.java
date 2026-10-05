package sy;

import android.content.Context;
import android.content.res.Resources;
import android.os.UserManager;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import com.github.service.dotcom.models.response.copilot.SteerAgentTaskRequest;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.DeploymentState;
import com.github.service.models.response.DeploymentStatusState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.TimelineItem;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.type.IssueState;
import gn0.f8;
import gn0.pt;
import hc0.fm;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m10.f40;
import ri0.a4;
import ri0.b4;
import ri0.y3;
import ri0.z3;
import u10.b60;
import u10.c60;
import u10.e60;
import u10.f60;
import u10.g60;
import u10.h60;
import u10.j60;
import u10.k60;
import wy0.p4;
import xn.c4;
import yz0.a6;
import yz0.b7;
import yz0.d6;
import yz0.d7;
import yz0.h7;
import yz0.i7;
import yz0.j6;
import yz0.j7;
import yz0.k6;
import yz0.l6;
import yz0.m6;
import yz0.m7;
import yz0.n6;
import yz0.o3;
import yz0.o6;
import yz0.p6;
import yz0.q7;
import yz0.r6;
import yz0.s5;
import yz0.s6;
import yz0.v5;
import yz0.v6;
import yz0.w5;
import yz0.x5;
import yz0.y5;
import yz0.y6;
import yz0.y7;
import yz0.z5;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p {
    public static final String a(Object[] objArr, int i, int i2, x61.g gVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == gVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        k71.k.f(sb2, "toString(...)");
        return sb2;
    }

    public static final b01.e b(g50.b bVar) {
        String str = bVar.a;
        String str2 = bVar.b;
        String str3 = bVar.c;
        boolean z = bVar.d;
        boolean z2 = bVar.e;
        String str4 = bVar.f;
        if (str4 == null) {
            str4 = "";
        }
        g50.a aVar = bVar.g;
        return new b01.e(str, str2, str3, z, z2, str4, aVar != null ? aVar.a : null);
    }

    public static final List c(c60.j jVar) {
        ArrayList arrayList;
        c60.g gVar;
        c60.a aVar;
        List list;
        c60.i iVar;
        c60.b bVar;
        List list2;
        c60.h hVar;
        c60.c cVar;
        List list3;
        int i = 0;
        if (jVar != null && (hVar = jVar.b) != null && (cVar = hVar.b) != null && (list3 = cVar.b) != null) {
            ArrayList S = x61.m.S(list3);
            ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
            int size = S.size();
            while (i < size) {
                Object obj = S.get(i);
                i++;
                arrayList2.add(o.l(((c60.f) obj).c));
            }
            return arrayList2;
        }
        if (jVar != null && (iVar = jVar.d) != null && (bVar = iVar.b) != null && (list2 = bVar.b) != null) {
            ArrayList S2 = x61.m.S(list2);
            ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
            int size2 = S2.size();
            while (i < size2) {
                Object obj2 = S2.get(i);
                i++;
                arrayList3.add(o.l(((c60.e) obj2).c));
            }
            return arrayList3;
        }
        if (jVar == null || (gVar = jVar.c) == null || (aVar = gVar.b) == null || (list = aVar.b) == null) {
            arrayList = null;
        } else {
            ArrayList S3 = x61.m.S(list);
            arrayList = new ArrayList(x61.n.F(S3, 10));
            int size3 = S3.size();
            while (i < size3) {
                Object obj3 = S3.get(i);
                i++;
                arrayList.add(o.l(((c60.d) obj3).c));
            }
        }
        return arrayList == null ? x61.r.r : arrayList;
    }

    public static final h01.q d(b4 b4Var) {
        String str;
        ke0.a aVar;
        sf0.e eVar;
        o6 r6Var;
        o6 o6Var;
        ye0.e eVar2;
        ih0.r rVar;
        ih0.b bVar;
        zk0.c cVar;
        ge0.b bVar2;
        ie0.b bVar3;
        ee0.b bVar4;
        ce0.b bVar5;
        mf0.e eVar3;
        DeploymentStatusState deploymentStatusState;
        me0.b bVar6;
        kg0.c cVar2;
        ig0.e eVar4;
        o6 m6Var;
        kf0.d dVar;
        eh0.e eVar5;
        ue0.c cVar3;
        gj0.c cVar4;
        uh0.c cVar5;
        wd0.c cVar6;
        af0.b bVar7;
        cj0.b bVar8;
        wi0.c cVar7;
        sj0.d dVar2;
        sj0.b bVar9;
        wj0.c cVar8;
        String str2;
        gk0.b bVar10;
        gk0.b bVar11;
        String str3;
        ud0.a aVar2;
        yj0.c cVar9;
        String str4;
        gk0.b bVar12;
        gk0.b bVar13;
        String str5;
        ud0.a aVar3;
        gg0.b bVar14;
        ui0.d dVar3;
        kh0.c cVar10;
        ej0.f fVar;
        ef0.i iVar;
        if0.b bVar15;
        oh0.b bVar16;
        ok0.b bVar17;
        ch0.b bVar18;
        mk0.c cVar11;
        ug0.c cVar12;
        kj0.b bVar19;
        qe0.m mVar;
        kk0.c cVar13;
        ae0.c cVar14;
        ij0.b bVar20;
        og0.a aVar4;
        String str6 = b4Var.b;
        a4 a4Var = b4Var.c;
        int i = a4Var.b;
        x61.r<y3> rVar2 = a4Var.d;
        if (rVar2 == null) {
            rVar2 = x61.r.r;
        }
        ArrayList arrayList = new ArrayList();
        for (y3 y3Var : rVar2) {
            if (y3Var != null && (aVar4 = y3Var.c) != null) {
                o6Var = b31.b.p(aVar4);
            } else if (y3Var != null && (bVar20 = y3Var.d) != null) {
                o6Var = b31.b.z(bVar20);
            } else if (y3Var != null && (cVar14 = y3Var.e) != null) {
                o6Var = b31.b.k(cVar14);
            } else if (y3Var != null && (cVar13 = y3Var.f) != null) {
                o6Var = b31.b.B(cVar13);
            } else if (y3Var != null && (mVar = y3Var.g) != null) {
                o6Var = b31.b.l(mVar);
            } else if (y3Var != null && (bVar19 = y3Var.h) != null) {
                o6Var = b31.b.A(bVar19);
            } else if (y3Var != null && (cVar12 = y3Var.i) != null) {
                o6Var = b31.b.q(cVar12);
            } else if (y3Var != null && (cVar11 = y3Var.j) != null) {
                o6Var = b31.b.C(cVar11);
            } else if (y3Var != null && (bVar18 = y3Var.k) != null) {
                o6Var = b31.b.r(bVar18);
            } else if (y3Var != null && (bVar17 = y3Var.l) != null) {
                o6Var = b31.b.D(bVar17);
            } else if (y3Var != null && (bVar16 = y3Var.m) != null) {
                o6Var = b31.b.t(bVar16);
            } else if (y3Var != null && (bVar15 = y3Var.n) != null) {
                o6Var = b31.b.o(bVar15);
            } else if (y3Var == null || (iVar = y3Var.o) == null) {
                if (y3Var == null || (fVar = y3Var.p) == null) {
                    str = "";
                    if (y3Var != null && (cVar10 = y3Var.q) != null) {
                        kh0.b bVar21 = cVar10.e;
                        String str7 = bVar21 != null ? bVar21.b : "";
                        String str8 = cVar10.d;
                        kh0.a aVar5 = cVar10.c;
                        o6Var = new v6(new com.github.service.models.response.a(aVar5 != null ? aVar5.b.b : "", b41.b.O(aVar5 != null ? aVar5.b.d : null), (String) null, false, (String) null, 60), str7, str8, cVar10.f);
                    } else if (y3Var != null && (dVar3 = y3Var.r) != null) {
                        o6Var = b31.b.v(dVar3);
                    } else if (y3Var == null || (bVar14 = y3Var.s) == null) {
                        if (y3Var != null && (cVar9 = y3Var.u) != null) {
                            yj0.b bVar22 = cVar9.d;
                            yj0.a aVar6 = cVar9.c;
                            com.github.service.models.response.a d = aa1.b.d(aVar6 != null ? aVar6.b : null);
                            if (bVar22 == null || (aVar3 = bVar22.b) == null || (str4 = aa1.b.d(aVar3).z) == null) {
                                str4 = (bVar22 == null || (bVar12 = bVar22.c) == null) ? "" : bVar12.b;
                            }
                            if (bVar22 != null && (bVar13 = bVar22.c) != null && (str5 = bVar13.c.b) != null) {
                                str = str5;
                            }
                            m6Var = new j7(d, str4, str, cVar9.e);
                        } else if (y3Var != null && (cVar8 = y3Var.v) != null) {
                            wj0.b bVar23 = cVar8.d;
                            wj0.a aVar7 = cVar8.c;
                            com.github.service.models.response.a d2 = aa1.b.d(aVar7 != null ? aVar7.b : null);
                            if (bVar23 == null || (aVar2 = bVar23.b) == null || (str2 = aa1.b.d(aVar2).z) == null) {
                                str2 = (bVar23 == null || (bVar10 = bVar23.c) == null) ? "" : bVar10.b;
                            }
                            if (bVar23 != null && (bVar11 = bVar23.c) != null && (str3 = bVar11.c.b) != null) {
                                str = str3;
                            }
                            m6Var = new i7(d2, str2, str, cVar8.e);
                        } else if (y3Var != null && (dVar2 = y3Var.w) != null) {
                            sj0.a aVar8 = dVar2.c;
                            com.github.service.models.response.a d3 = aa1.b.d(aVar8 != null ? aVar8.b : null);
                            sj0.c cVar15 = dVar2.e;
                            if (cVar15 != null && (bVar9 = cVar15.b) != null) {
                                r6 = bVar9.b;
                            }
                            com.github.service.models.response.a d4 = aa1.b.d(r6);
                            String str9 = dVar2.d;
                            o6Var = new h7(d3, d4, str9 != null ? str9 : "", dVar2.f);
                        } else if (y3Var != null && (cVar7 = y3Var.x) != null) {
                            o6Var = b31.b.w(cVar7);
                        } else if (y3Var != null && (bVar8 = y3Var.y) != null) {
                            cj0.a aVar9 = bVar8.c;
                            o6Var = new b7(aVar9 != null ? aVar9.b.b : "", bVar8.d);
                        } else if (y3Var != null && (bVar7 = y3Var.z) != null) {
                            af0.a aVar10 = bVar7.c;
                            o6Var = new d6(aVar10 != null ? aVar10.b.b : "", bVar7.d);
                        } else if (y3Var != null && (cVar6 = y3Var.A) != null) {
                            o6Var = b31.b.j(cVar6);
                        } else if (y3Var != null && (cVar5 = y3Var.B) != null) {
                            o6Var = b31.b.u(cVar5);
                        } else if (y3Var != null && (cVar4 = y3Var.C) != null) {
                            o6Var = b31.b.y(cVar4);
                        } else if (y3Var != null && (cVar3 = y3Var.E) != null) {
                            o6Var = b31.b.m(cVar3);
                        } else if (y3Var != null && (eVar5 = y3Var.I) != null) {
                            o6Var = b31.b.s(eVar5);
                        } else if (y3Var != null && (dVar = y3Var.D) != null) {
                            kf0.a aVar11 = dVar.c;
                            str = aVar11 != null ? aVar11.b.b : "";
                            kf0.b bVar24 = dVar.d;
                            String str10 = bVar24.c;
                            f8 f8Var = bVar24.b;
                            if (f8Var != null) {
                                switch (f8Var.ordinal()) {
                                    case 0:
                                        r6 = DeploymentState.ABANDONED;
                                        break;
                                    case 1:
                                        r6 = DeploymentState.ACTIVE;
                                        break;
                                    case 2:
                                        r6 = DeploymentState.DESTROYED;
                                        break;
                                    case 3:
                                        r6 = DeploymentState.ERROR;
                                        break;
                                    case 4:
                                        r6 = DeploymentState.FAILURE;
                                        break;
                                    case 5:
                                        r6 = DeploymentState.INACTIVE;
                                        break;
                                    case 6:
                                        r6 = DeploymentState.IN_PROGRESS;
                                        break;
                                    case 7:
                                        r6 = DeploymentState.PENDING;
                                        break;
                                    case 8:
                                        r6 = DeploymentState.QUEUED;
                                        break;
                                    case 9:
                                        r6 = DeploymentState.SUCCESS;
                                        break;
                                    case 10:
                                        r6 = DeploymentState.WAITING;
                                        break;
                                    case 11:
                                        r6 = DeploymentState.UNKNOWN__;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            o6Var = new j6(str, str10, r6, dVar.e);
                        } else if (y3Var != null && (eVar4 = y3Var.F) != null) {
                            ig0.a aVar12 = eVar4.c;
                            String str11 = aVar12 != null ? aVar12.b.b : "";
                            ig0.c cVar16 = eVar4.f;
                            String str12 = cVar16 != null ? cVar16.b : "";
                            ig0.b bVar25 = eVar4.g;
                            m6Var = new m6(str11, str12, bVar25 != null ? bVar25.b : "", eVar4.e.b, eVar4.d);
                        } else if (y3Var != null && (cVar2 = y3Var.t) != null) {
                            kg0.a aVar13 = cVar2.c;
                            o6Var = new n6(aVar13 != null ? aVar13.b.b : "", cVar2.d.a, cVar2.e);
                        } else if (y3Var != null && (bVar6 = y3Var.H) != null) {
                            me0.a aVar14 = bVar6.c;
                            o6Var = new a6(aVar14 != null ? aVar14.b.b : "", bVar6.e, bVar6.f, bVar6.d);
                        } else if (y3Var != null && (eVar3 = y3Var.J) != null) {
                            mf0.a aVar15 = eVar3.c;
                            str = aVar15 != null ? aVar15.b.b : "";
                            mf0.c cVar17 = eVar3.e;
                            String str13 = cVar17.d.c;
                            switch (cVar17.b.ordinal()) {
                                case 0:
                                    deploymentStatusState = DeploymentStatusState.ERROR;
                                    break;
                                case 1:
                                    deploymentStatusState = DeploymentStatusState.FAILURE;
                                    break;
                                case 2:
                                    deploymentStatusState = DeploymentStatusState.INACTIVE;
                                    break;
                                case 3:
                                    deploymentStatusState = DeploymentStatusState.IN_PROGRESS;
                                    break;
                                case 4:
                                    deploymentStatusState = DeploymentStatusState.PENDING;
                                    break;
                                case 5:
                                    deploymentStatusState = DeploymentStatusState.QUEUED;
                                    break;
                                case 6:
                                    deploymentStatusState = DeploymentStatusState.SUCCESS;
                                    break;
                                case 7:
                                    deploymentStatusState = DeploymentStatusState.WAITING;
                                    break;
                                case 8:
                                    deploymentStatusState = DeploymentStatusState.UNKNOWN__;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            o6Var = new k6(str, str13, deploymentStatusState, eVar3.d);
                        } else if (y3Var != null && (bVar5 = y3Var.N) != null) {
                            ce0.a aVar16 = bVar5.b;
                            com.github.service.models.response.a aVar17 = new com.github.service.models.response.a(aVar16 != null ? aVar16.b.b : "", b41.b.O(aVar16 != null ? aVar16.b.d : null), (String) null, false, (String) null, 60);
                            String str14 = bVar5.d;
                            o6Var = new v5(aVar17, str14 != null ? str14 : "", bVar5.c);
                        } else if (y3Var != null && (bVar4 = y3Var.K) != null) {
                            ee0.a aVar18 = bVar4.b;
                            o6Var = new w5(new com.github.service.models.response.a(aVar18 != null ? aVar18.b.b : "", b41.b.O(aVar18 != null ? aVar18.b.d : null), (String) null, false, (String) null, 60), bVar4.c);
                        } else if (y3Var != null && (bVar3 = y3Var.L) != null) {
                            ie0.a aVar19 = bVar3.b;
                            o6Var = new y5(new com.github.service.models.response.a(aVar19 != null ? aVar19.b.b : "", b41.b.O(aVar19 != null ? aVar19.b.d : null), (String) null, false, (String) null, 60), bVar3.c);
                        } else if (y3Var != null && (bVar2 = y3Var.M) != null) {
                            ge0.a aVar20 = bVar2.b;
                            o6Var = new x5(new com.github.service.models.response.a(aVar20 != null ? aVar20.b.b : "", b41.b.O(aVar20 != null ? aVar20.b.d : null), (String) null, false, (String) null, 60), bVar2.c);
                        } else if (y3Var != null && (cVar = y3Var.O) != null) {
                            o6Var = b31.b.E(cVar);
                        } else if (y3Var != null && (bVar = y3Var.P) != null) {
                            ih0.a aVar21 = bVar.b;
                            o6Var = new s5(aVar21 != null ? aVar21.a : "", bVar.a);
                        } else if (y3Var == null || (rVar = y3Var.Q) == null) {
                            if (y3Var != null && (eVar2 = y3Var.R) != null) {
                                ye0.b bVar26 = eVar2.d.b;
                                TimelineItem.LinkedItemConnectorType linkedItemConnectorType = TimelineItem.LinkedItemConnectorType.LINKED;
                                ye0.a aVar22 = eVar2.c;
                                String str15 = aVar22 != null ? aVar22.b.b : null;
                                String str16 = str15 == null ? "" : str15;
                                r01.e eVar6 = IssueState.Companion;
                                String str17 = bVar26 != null ? bVar26.a.r : null;
                                if (str17 == null) {
                                    str17 = "";
                                }
                                eVar6.getClass();
                                IssueState b = r01.e.b(str17);
                                int i2 = bVar26 != null ? bVar26.d : 0;
                                String str18 = bVar26 != null ? bVar26.b : null;
                                String str19 = str18 == null ? "" : str18;
                                String str20 = bVar26 != null ? bVar26.c : null;
                                r6Var = new r6(linkedItemConnectorType, str16, i2, str19, str20 == null ? "" : str20, eVar2.e, b, b31.b.d0(bVar26 != null ? bVar26.e : null));
                            } else if (y3Var == null || (eVar = y3Var.S) == null) {
                                if (y3Var != null && (aVar = y3Var.T) != null) {
                                    r6 = new z5(aVar.b, aVar.d, aVar.e, aVar.c);
                                }
                                o6Var = r6;
                            } else {
                                sf0.b bVar27 = eVar.d.b;
                                TimelineItem.LinkedItemConnectorType linkedItemConnectorType2 = TimelineItem.LinkedItemConnectorType.UNLINKED;
                                sf0.a aVar23 = eVar.c;
                                String str21 = aVar23 != null ? aVar23.b.b : null;
                                String str22 = str21 == null ? "" : str21;
                                r01.e eVar7 = IssueState.Companion;
                                String str23 = bVar27 != null ? bVar27.a.r : null;
                                if (str23 == null) {
                                    str23 = "";
                                }
                                eVar7.getClass();
                                IssueState b2 = r01.e.b(str23);
                                int i3 = bVar27 != null ? bVar27.d : 0;
                                String str24 = bVar27 != null ? bVar27.b : null;
                                String str25 = str24 == null ? "" : str24;
                                String str26 = bVar27 != null ? bVar27.c : null;
                                r6Var = new r6(linkedItemConnectorType2, str22, i3, str25, str26 == null ? "" : str26, eVar.e, b2, b31.b.d0(bVar27 != null ? bVar27.e : null));
                            }
                            o6Var = r6Var;
                        } else {
                            ih0.q qVar = rVar.b;
                            o6Var = new d7(qVar != null ? qVar.a : "", rVar.c, rVar.a);
                        }
                        o6Var = m6Var;
                    } else {
                        String str27 = bVar14.d;
                        gg0.a aVar24 = bVar14.c;
                        o6Var = new l6(new com.github.service.models.response.a(aVar24 != null ? aVar24.b.b : "", b41.b.O(aVar24 != null ? aVar24.b.d : null), (String) null, false, (String) null, 60), str27, bVar14.e);
                    }
                } else {
                    if (fVar.f != null) {
                        o6Var = b31.b.x(fVar);
                    }
                    o6Var = r6;
                }
            } else {
                o6Var = b31.b.n(iVar);
            }
            if (o6Var != null) {
                arrayList.add(o6Var);
            }
        }
        List F0 = x61.m.F0(arrayList);
        z3 z3Var = a4Var.c;
        return new h01.q(str6, i, F0, z3Var.a, z3Var.b, z3Var.c, z3Var.d);
    }

    public static final List e(mg0.y yVar) {
        sf0.e eVar;
        String str;
        o6 s6Var;
        o6 o6Var;
        ye0.e eVar2;
        cf0.e eVar3;
        zk0.c cVar;
        ik0.c cVar2;
        qk0.b bVar;
        hi0.b bVar2;
        eh0.e eVar4;
        ue0.c cVar3;
        gj0.c cVar4;
        uh0.c cVar5;
        wd0.c cVar6;
        ej0.f fVar;
        ef0.i iVar;
        if0.b bVar3;
        oh0.b bVar4;
        ok0.b bVar5;
        ch0.b bVar6;
        mk0.c cVar7;
        ug0.c cVar8;
        kj0.b bVar7;
        qe0.m mVar;
        kk0.c cVar9;
        ae0.c cVar10;
        ij0.b bVar8;
        og0.a aVar;
        x61.r<mg0.w> rVar = yVar.d;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList arrayList = new ArrayList();
        for (mg0.w wVar : rVar) {
            if (wVar != null && (aVar = wVar.c) != null) {
                o6Var = b31.b.p(aVar);
            } else if (wVar != null && (bVar8 = wVar.d) != null) {
                o6Var = b31.b.z(bVar8);
            } else if (wVar != null && (cVar10 = wVar.e) != null) {
                o6Var = b31.b.k(cVar10);
            } else if (wVar != null && (cVar9 = wVar.f) != null) {
                o6Var = b31.b.B(cVar9);
            } else if (wVar != null && (mVar = wVar.g) != null) {
                o6Var = b31.b.l(mVar);
            } else if (wVar != null && (bVar7 = wVar.h) != null) {
                o6Var = b31.b.A(bVar7);
            } else if (wVar != null && (cVar8 = wVar.i) != null) {
                o6Var = b31.b.q(cVar8);
            } else if (wVar != null && (cVar7 = wVar.j) != null) {
                o6Var = b31.b.C(cVar7);
            } else if (wVar != null && (bVar6 = wVar.k) != null) {
                o6Var = b31.b.r(bVar6);
            } else if (wVar != null && (bVar5 = wVar.l) != null) {
                o6Var = b31.b.D(bVar5);
            } else if (wVar != null && (bVar4 = wVar.m) != null) {
                o6Var = b31.b.t(bVar4);
            } else if (wVar != null && (bVar3 = wVar.n) != null) {
                o6Var = b31.b.o(bVar3);
            } else if (wVar != null && (iVar = wVar.o) != null) {
                o6Var = b31.b.n(iVar);
            } else if (wVar != null && (fVar = wVar.p) != null) {
                if (fVar.f != null) {
                    o6Var = b31.b.x(fVar);
                }
                o6Var = null;
            } else if (wVar != null && (cVar6 = wVar.q) != null) {
                o6Var = b31.b.j(cVar6);
            } else if (wVar != null && (cVar5 = wVar.r) != null) {
                o6Var = b31.b.u(cVar5);
            } else if (wVar != null && (cVar4 = wVar.s) != null) {
                o6Var = b31.b.y(cVar4);
            } else if (wVar != null && (cVar3 = wVar.v) != null) {
                o6Var = b31.b.m(cVar3);
            } else if (wVar == null || (eVar4 = wVar.x) == null) {
                if (wVar != null && (bVar2 = wVar.t) != null) {
                    hi0.a aVar2 = bVar2.c;
                    o6Var = new y6(aVar2 != null ? aVar2.b.b : "", bVar2.d);
                } else if (wVar != null && (bVar = wVar.u) != null) {
                    qk0.a aVar3 = bVar.c;
                    o6Var = new q7(aVar3 != null ? aVar3.b.b : "", bVar.d);
                } else if (wVar != null && (cVar2 = wVar.w) != null) {
                    ik0.a aVar4 = cVar2.c;
                    String str2 = aVar4 != null ? aVar4.b.b : "";
                    ik0.b bVar9 = cVar2.e;
                    o6Var = new m7(str2, bVar9 != null ? bVar9.b : "", cVar2.d);
                } else if (wVar != null && (cVar = wVar.y) != null) {
                    o6Var = b31.b.E(cVar);
                } else if (wVar == null || (eVar3 = wVar.z) == null) {
                    if (wVar == null || (eVar2 = wVar.A) == null) {
                        if (wVar != null && (eVar = wVar.B) != null) {
                            sf0.c cVar11 = eVar.d.c;
                            TimelineItem.LinkedItemConnectorType linkedItemConnectorType = TimelineItem.LinkedItemConnectorType.UNLINKED;
                            sf0.a aVar5 = eVar.c;
                            String str3 = aVar5 != null ? aVar5.b.b : null;
                            String str4 = str3 == null ? "" : str3;
                            o3 o3Var = PullRequestState.Companion;
                            String str5 = cVar11 != null ? cVar11.a.r : null;
                            if (str5 == null) {
                                str5 = "";
                            }
                            o3Var.getClass();
                            PullRequestState b = o3.b(str5);
                            int i = cVar11 != null ? cVar11.e : 0;
                            String str6 = cVar11 != null ? cVar11.c : null;
                            String str7 = str6 == null ? "" : str6;
                            str = cVar11 != null ? cVar11.d : null;
                            s6Var = new s6(linkedItemConnectorType, str4, i, str7, str == null ? "" : str, eVar.e, b, cVar11 != null && cVar11.b, cVar11 != null && cVar11.f);
                        }
                        o6Var = null;
                    } else {
                        ye0.c cVar12 = eVar2.d.c;
                        TimelineItem.LinkedItemConnectorType linkedItemConnectorType2 = TimelineItem.LinkedItemConnectorType.LINKED;
                        ye0.a aVar6 = eVar2.c;
                        String str8 = aVar6 != null ? aVar6.b.b : null;
                        String str9 = str8 == null ? "" : str8;
                        o3 o3Var2 = PullRequestState.Companion;
                        String str10 = cVar12 != null ? cVar12.a.r : null;
                        if (str10 == null) {
                            str10 = "";
                        }
                        o3Var2.getClass();
                        PullRequestState b2 = o3.b(str10);
                        int i2 = cVar12 != null ? cVar12.e : 0;
                        String str11 = cVar12 != null ? cVar12.c : null;
                        String str12 = str11 == null ? "" : str11;
                        str = cVar12 != null ? cVar12.d : null;
                        s6Var = new s6(linkedItemConnectorType2, str9, i2, str12, str == null ? "" : str, eVar2.e, b2, cVar12 != null && cVar12.b, cVar12 != null && cVar12.f);
                    }
                    o6Var = s6Var;
                } else {
                    String str13 = eVar3.b;
                    cf0.a aVar7 = eVar3.c;
                    String str14 = aVar7 != null ? aVar7.b.b : "";
                    cf0.b bVar10 = eVar3.d;
                    o6Var = new p6(str13, str14, bVar10 != null ? bVar10.a : 0, bVar10 != null ? bVar10.b : "", bVar10 != null ? bVar10.c.a.b : "", bVar10 != null ? bVar10.c.b : "", eVar3.e);
                }
            } else {
                o6Var = b31.b.s(eVar4);
            }
            if (o6Var != null) {
                arrayList.add(o6Var);
            }
        }
        return x61.m.F0(arrayList);
    }

    public static final y7 f(e60 e60Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        yz0.s bVar;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        j60 j60Var;
        j60 j60Var2;
        b60 b60Var;
        j60 j60Var3;
        j60 j60Var4;
        f60 f60Var;
        j60 j60Var5;
        j60 j60Var6;
        j60 j60Var7;
        j60 j60Var8;
        j60 j60Var9;
        k71.k.g(e60Var, "<this>");
        k60 k60Var = e60Var.a;
        String str = "";
        String str2 = (k60Var == null || (j60Var9 = k60Var.b) == null) ? "" : j60Var9.b;
        fm fmVar = (k60Var == null || (j60Var8 = k60Var.b) == null) ? null : j60Var8.d;
        int i = fmVar == null ? -1 : va0.p.a[fmVar.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
        } else if (i == 3) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        IssueOrPullRequestState issueOrPullRequestState2 = issueOrPullRequestState;
        ArrayList b = f0.b((k60Var == null || (j60Var7 = k60Var.b) == null) ? null : j60Var7.i);
        List c = c((k60Var == null || (j60Var6 = k60Var.b) == null) ? null : j60Var6.j);
        List list = (k60Var == null || (j60Var5 = k60Var.b) == null) ? null : j60Var5.f.a;
        if (list == null) {
            list = x61.r.r;
        }
        ArrayList S = x61.m.S(list);
        ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            g60 g60Var = (g60) obj;
            h60 h60Var = g60Var.b;
            c60 c60Var = g60Var.a;
            String str3 = str;
            arrayList2.add(new xz0.f(new SimpleLegacyProject(h60Var.b, h60Var.a, w.C(h60Var.c), c60Var != null ? c60Var.a : null), c60Var != null ? c60Var.a : null));
            str = str3;
        }
        String str4 = str;
        bb0.g e = s.e((k60Var == null || (j60Var4 = k60Var.b) == null || (f60Var = j60Var4.e) == null) ? null : f60Var.c);
        c40.c cVar = (k60Var == null || (j60Var3 = k60Var.b) == null) ? null : j60Var3.k;
        if (cVar == null) {
            yz0.s.Companion.getClass();
            bVar = yz0.r.b;
        } else {
            j60 j60Var10 = k60Var.b;
            bVar = new bb0.b(cVar, j60Var10.c, new yz0.b0(j60Var10.b));
        }
        com.github.service.models.response.a aVar = new com.github.service.models.response.a((k60Var == null || (b60Var = k60Var.a) == null) ? str4 : b60Var.b, (Avatar) null, (String) null, false, (String) null, 62);
        ArrayList arrayList3 = new ArrayList();
        if (k60Var == null || (j60Var2 = k60Var.b) == null) {
            z = true;
        } else {
            z = true;
            if (j60Var2.g) {
                z2 = true;
                if (k60Var == null && (j60Var = k60Var.b) != null && j60Var.h == z) {
                    z3 = z;
                    arrayList = b;
                } else {
                    arrayList = b;
                    z3 = false;
                }
                return new y7(str2, issueOrPullRequestState2, arrayList, c, arrayList2, e, bVar, aVar, arrayList3, z2, z3);
            }
        }
        z2 = false;
        if (k60Var == null) {
        }
        arrayList = b;
        z3 = false;
        return new y7(str2, issueOrPullRequestState2, arrayList, c, arrayList2, e, bVar, aVar, arrayList3, z2, z3);
    }

    public static void g(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static String k(a7.d dVar, int i) {
        k71.k.g(dVar, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            String resourceName = dVar.a.getResources().getResourceName(i);
            k71.k.d(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static s71.h m(x6.w wVar) {
        k71.k.g(wVar, "<this>");
        return s71.j.h0(wVar, new p4(19));
    }

    public static final boolean o(t10.g gVar) {
        k71.k.g(gVar, "<this>");
        return gVar == t10.g.z || gVar == t10.g.t || gVar == t10.g.y;
    }

    public static boolean p(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final void q(Object[] objArr, int i, int i2) {
        k71.k.g(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final pt t(ShortcutIcon shortcutIcon) {
        switch (shortcutIcon == null ? -1 : vl0.o.a[shortcutIcon.ordinal()]) {
            case -1:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                return pt.Y;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return pt.X;
            case 2:
                return pt.J;
            case 3:
                return pt.H;
            case 4:
                return pt.C;
            case 5:
                return pt.O;
            case 6:
                return pt.P;
            case 7:
                return pt.w;
            case 8:
                return pt.F;
            case 9:
                return pt.B;
            case 10:
                return pt.A;
            case 11:
                return pt.V;
            case 12:
                return pt.W;
            case 13:
                return pt.u;
            case 14:
                return pt.t;
            case 15:
                return pt.E;
            case 16:
                return pt.U;
            case 17:
                return pt.v;
            case 18:
                return pt.y;
            case 19:
                return pt.L;
            case 20:
                return pt.M;
            case 21:
                return pt.T;
            case 22:
                return pt.G;
            case 23:
                return pt.x;
            case 24:
                return pt.N;
            case 25:
                return pt.Q;
            case 26:
                return pt.S;
            case 27:
                return pt.I;
            case 28:
                return pt.D;
            case 29:
                return pt.z;
            case 30:
                return pt.K;
            case 31:
                return pt.R;
            case 32:
                return pt.P;
        }
    }

    public static final f40 u(com.github.service.models.response.shortcuts.a aVar) {
        if (k71.k.b(aVar, ShortcutScope.AllRepositories.INSTANCE)) {
            return null;
        }
        if (!(aVar instanceof ShortcutScope.SpecificRepository)) {
            throw new NoWhenBranchMatchedException();
        }
        ShortcutScope.SpecificRepository specificRepository = (ShortcutScope.SpecificRepository) aVar;
        return new f40(specificRepository.t, specificRepository.s);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final q01.r v() {
        throw new UnsupportedOperationException("Method not decompiled");
    }
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static SteerAgentTaskRequest w(c4 c4Var) {
        return new SteerAgentTaskRequest(c4Var instanceof xn.a4 ? null : c4Var, c4Var.getType(), null);
    }

    public abstract InputFilter[] l(InputFilter[] inputFilterArr);

    public abstract boolean n();

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract TransformationMethod x(TransformationMethod transformationMethod);
}
